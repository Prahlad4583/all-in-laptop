import javax.swing.*;
import java.awt.*;

public class lll {
    public static void main(String[] args) {
        JFrame f=new JFrame("Notes");
        f.setBounds(100,100,500,500);
        Container content = f.getContentPane();
        content.setLayout(new BorderLayout());

        JPanel p = new JPanel();
        p.setBackground(Color.decode("#c883fc"));
        p.setLayout(new BorderLayout());
        p.setBounds(05,05,855,450);

        JTextArea writ=new JTextArea();
        writ.setBounds(130,100,300,260);
        JScrollPane scrollPane = new JScrollPane(writ);
        p.add(scrollPane,BorderLayout.CENTER);
        JButton done=new JButton("Save Notes");
        done.setBounds(135,390,100,20);
        content.add(p, BorderLayout.CENTER);
        p.add(writ);
       // p.add(done);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        f.setSize(300, 200);
        f.setVisible(true);
    }
}
