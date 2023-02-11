import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class Login {
    String user,pass,name1,name2,Mobile,Add;
    void register(){
        JFrame f=new JFrame("Registeration Page");
        f.setSize(600,500);
        f.setLocation(650,40);
        f.setLayout(null);
        JPanel p=new JPanel();
        p.setBounds(10,10,580,480);
        p.setLayout(null);

        f.add(p);
        JLabel l=new JLabel("First Name");
        l.setBounds(10,10,80,30);
        JTextField tf=new JTextField();
        tf.setBounds(100,10,300,30);
        p.add(l);p.add(tf);
        JLabel l1=new JLabel("Last Name");
        l1.setBounds(10,50,80,30);
        JTextField t1=new JTextField();
        t1.setBounds(100,50,300,30);
        p.add(l1);p.add(t1);
        JLabel l2=new JLabel("Username");
        l2.setBounds(10,90,80,30);
        JTextField t2=new JTextField();
        t2.setBounds(100,90,300,30);
        p.add(l2);p.add(t2);
        JLabel l3=new JLabel("Password");
        l3.setBounds(10,130,80,30);
        JPasswordField pwd=new JPasswordField();
        pwd.setBounds(100,130,300,30);
        p.add(l3);p.add(pwd);
        JLabel l5=new JLabel("Mobile No.");
        l5.setBounds(10,170,80,30);
        JTextField t5=new JTextField();
        t5.setBounds(100,170,300,30);
        p.add(l5);p.add(t5);
        JLabel l4=new JLabel("Address");
        l4.setBounds(10,210,80,30);
        JTextArea area=new JTextArea();
        area.setBounds(100,210,300,50);
        p.add(l4);p.add(area);

        JButton b1=new JButton("Register");
        b1.setBounds(180,280,100,30);
        b1.setBackground(Color.CYAN);
        JLabel label=new JLabel();
        label.setBounds(100,320,400,30);
        p.add(b1);p.add(label);
        f.setVisible(true);
        ActionListener ac=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                user=t2.getText(); pass=pwd.getText();
                name1=tf.getText();name2= t1.getText();
                Mobile=t5.getText(); Add=area.getText();
                try{
                    if(!user.equals("")&& !pass.equals("")&& !name1.equals("")&& !name2.equals("")
                            && !Mobile.equals("")&& !Add.equals("")){
                    File rd=new File("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA\\Login.txt");
                    Scanner read=new Scanner(rd);
                    String data= read.nextLine();
                if(data.contains(user)){
                    label.setText("You are already registered try Login");
                        System.out.println("already");
                    } else
                    {
                        FileWriter fw=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\JAVA\\Login.txt",true);
                        fw.write(name1+name2+user+pass+Mobile+Add+"\n");
                        fw.close();

                        label.setText("Congratulation you are registered successfully try Login");
                        System.out.println("congratulations");
                        name1="";name2="";
                    }}
                    else{
                        label.setText("Empty Fields!!!!");
                    }

            }catch (Exception i){
                System.out.println(i);
            }
            }
        };b1.addActionListener(ac);

    }
    void login(){
        JFrame f=new JFrame("Login page");

        f.setSize(600,500);
        f.setLocation(50,20);
        f.setLayout(null);
        JPanel p=new JPanel();
        p.setBounds(10,10,580,480);
        p.setLayout(null);
        f.add(p);
        JLabel l=new JLabel("Username");
        l.setBounds(10,10,60,30);
        JLabel l1=new JLabel("Password");
        l1.setBounds(10,60,60,30);
        JButton b=new JButton("Login");
        b.setBounds(180,110,100,30);
        b.setBackground(Color.PINK);
        JTextField tf=new JTextField();
        tf.setBounds(100,10,300,30);
        JPasswordField pwd=new JPasswordField();
        pwd.setBounds(100,60,300,30);
        JLabel l2=new JLabel("New user ? Register here/Activate ");
        l2.setBounds(120,180,300,30);
        l2.setBackground(Color.YELLOW);
        JButton b1=new JButton("Register");
        b1.setBounds(180,240,100,30);
        b1.setBackground(Color.CYAN);
        p.add(l);p.add(l1);p.add(pwd);p.add(b);p.add(tf);p.add(l2);p.add(b1);
        f.setVisible(true);

        JFrame f1=new JFrame("Login data");
        f1.setSize(300,300);
        f1.setLocation(400,500);
        f1.setLayout(null);
        ActionListener click=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                f1.setVisible(true);
            }
        };b.addActionListener(click);
        ActionListener ok=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                register();
            }
        };b1.addActionListener(ok);

    }
    public static void main(String[] args) {
        Login l=new Login();
        l.login();
    }
}
