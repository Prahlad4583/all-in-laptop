import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Random;
import java.util.Scanner;

public class TcgEnrollment {
  static   Random pwd=new Random();
   static int passw=pwd.nextInt(1111,9999);

    static String SName,SRank,SDomain,SMob,SEmail ; int a=1;
    void Enroll(){
        JFrame f=new JFrame("TCG ENROLLMENT");
        f.setBackground(Color.PINK);
        f.setBounds(100,100,400,400);
        f.setLayout(null);
        JPanel panel=new JPanel();
        panel.setBackground(Color.PINK);
        panel.setBounds(0,0,380,380);
        panel.setLayout(null);
        f.add(panel);
        JLabel Title=new JLabel("TCG ENROLLMENT");
        Title.setBounds(110,5,200,30);
        Title.setFont(new Font("Arial", Font.PLAIN, 20));
        JLabel Name=new JLabel("Name");
        Name.setBounds(30,50,70,25);
        JLabel Rank=new JLabel("Rank");
        Rank.setBounds(30,90,70,25);
        JLabel Domain=new JLabel("Domain");
        Domain.setBounds(30,130,70,25);
        JLabel Mobile=new JLabel("Mobile No.");
        Mobile.setBounds(30,170,70,25);
        JLabel Email=new JLabel("Email ID");
        Email.setBounds(30,210,70,25);
        panel.add(Title);panel.add(Name);panel.add(Rank);panel.add(Domain);
        panel.add(Mobile);panel.add(Email);
        JTextField Namet=new JTextField();
        Namet.setBounds(100,50,200,20);
        JTextField Rankt=new JTextField();
        Rankt.setBounds(100,90,200,20);
        JTextField Domaint=new JTextField();
        Domaint.setBounds(100,130,200,20);
        JTextField Mobilet=new JTextField();
        Mobilet.setBounds(100,170,200,20);
        JTextField Emailt=new JTextField();
        Emailt.setBounds(100,210,200,20);
        JButton SUBMIT=new JButton("SUBMIT");
        SUBMIT.setBounds(150,260,100,25);

        panel.add(Namet);panel.add(Rankt);panel.add(Domaint);
        panel.add(Mobilet);panel.add(Emailt);panel.add(SUBMIT);
        f.setVisible(true);
        ActionListener ac=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                JSONObject obj=new JSONObject();

                obj.put(Name.getText(),Namet.getText());
                obj.put(Rank.getText(),Rankt.getText());
                obj.put(Domain.getText(),Domaint.getText());
                obj.put(Mobile.getText(),Mobilet.getText());
                obj.put(Email.getText(),Emailt.getText());

                try {
                    File f = new File("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA\\JSON.JSON");
                    f.createNewFile();
                    if(f.createNewFile()){
                    System.out.println("file suceesfully create");}
                    else{
                        System.out.println("alredy");
                    }
                    if(!Namet.getText().equals("")&& !Rankt.getText().equals("")&& !Domaint.getText().equals("")&& !Mobilet.getText().equals("")
                            && !Emailt.getText().equals("")) {
                        File rd = new File("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA\\JSON.JSON");
                        Scanner read = new Scanner(rd);
                        String data = read.nextLine();
                        if (data.contains(Emailt.getText())) {
                               System.out.println("already");
                        } else {
                            FileWriter file = new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA\\JSON.JSON");
                            file.write(a + ":" + obj.toJSONString());
                            file.close();
                            System.out.println("file sucessfully write");
                        }
                    } else {
                        System.out.println("fill all data ");
                    }
                } catch (Exception i){
                    System.out.println(i);
                }
            }
        };SUBMIT.addActionListener(ac);
    }


    public static void main(String[] args) {
        TcgEnrollment t=new TcgEnrollment();
        t.Enroll();
        System.out.println(passw);
    }
}
