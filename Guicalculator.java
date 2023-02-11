import javax.swing.*;
import java.awt.*;

public class Guicalculator {
    void cal(){
        JFrame f=new JFrame("Calculator");
        f.setSize(500,500);
        f.setLayout(null);
        JTextField tf=new JTextField();
        tf.setBounds(20,20,400,40);
        JPanel p=new JPanel();
        p.setBackground(Color.pink);
       // p.setSize(400,200);
        p.setBounds(20,40,400,400);
        p.setLayout(new GridLayout(4,4,10,10));
        f.add(p);
        JButton b1=new JButton("1");
        p.add(b1);
        JButton b2=new JButton("2");
        p.add(b2);
        JButton b3=new JButton("3");
        p.add(b3);
        JButton b4=new JButton("4");
        p.add(b4);
        JButton b5=new JButton("5");
        p.add(b5);
        JButton b6=new JButton("6");
        p.add(b6);
        JButton b7=new JButton("7");
        p.add(b7);
        JButton b8=new JButton("8");
        p.add(b8);
        JButton b9=new JButton("9");
        p.add(b9);
        JButton badd=new JButton("+");
        p.add(badd);
        JButton bsub=new JButton("-");
        p.add(bsub);
        JButton bmul=new JButton("*");
        p.add(bmul);
        JButton bdiv=new JButton("/");
        p.add(bdiv);
        JButton b0=new JButton("0");
        p.add(b0);


        f.add(tf);
        f.setVisible(true);
    }
public static void main(String[]args){
        Guicalculator g=new Guicalculator();
        g.cal();
        }
}
