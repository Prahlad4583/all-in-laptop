import javax.swing.*;
import java.awt.*;

public class Loginpage {
    void Login(){
        JFrame f=new JFrame("Login Page");
        f.setSize(500,500);
        f.setLayout(null);
        f.setBackground(Color.BLUE);
        JLabel l=new JLabel("Email id");
        l.setBounds(20,75,100,20);
        JTextField tf=new JTextField();
        tf.setBounds(100
                ,75,200,20);
       JLabel l1=new JLabel("Password");
       l1.setBounds(20,110,100,20);
        JPasswordField pwd=new JPasswordField();
        pwd.setBounds(100,110,200,20);
        JButton b=new JButton("Login");
        b.setBounds(135,150,100,20);
        f.add(l);f.add(tf);f.add(l1);f.add(pwd);f.add(b);
        f.setVisible(true);
    }

    public static void main(String[] args) {
        Loginpage l=new Loginpage();
        l.Login();
    }
}
