import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Guiall {
    static int a=0;
    void Act(){
        JFrame f=new JFrame();
        f.setSize(500,500);
        f.setLayout(null);
        JTextField tf=new JTextField();
        tf.setBounds(10,10,200,30);
        JButton b=new JButton("Click");
        b.setBounds(10,60,100,30);

        f.add(tf);
        f.add(b);
        f.setVisible(true);
        ActionListener click=new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a++;
                tf.setText(String.valueOf(a));
                b.setText(Integer.toString(a));
            }
        }; b.addActionListener(click);

    }

    void GridBag(){
        JFrame f=new JFrame("Grid bag" );
        f.setSize(500,500);
        f.setLocation(100,100);
        f.setLayout(null);
        JTextField tf1 = new JTextField();
       // tf1.setBounds(20,20,100,20);
        JPanel p=new JPanel(new GridBagLayout());
        p.setBackground(Color.pink);
        p.setBounds(20,20,400,400);
        GridBagConstraints gc=new GridBagConstraints();
         f.add(p);
        JButton b=new JButton("0");
        JButton b1=new JButton("1");
        JButton b2=new JButton("2");
        JButton b3=new JButton("3");
        JButton b4=new JButton("4");
        JButton b5=new JButton(" ");
        gc.gridx=0;
        gc.gridy=0;p.add(b,gc);
        gc.gridx=0;
        gc.gridy=1; p.add(b5,gc);
        gc.gridx=0;
        gc.gridy=2;p.add(b1,gc);
        gc.gridx=2;
        gc.gridy=0;p.add(b2,gc);
        gc.gridx=1;
        gc.gridy=1;p.add(b3,gc);
        gc.gridx=2;
        gc.gridy=2;p.add(b4,gc);


        f.setVisible(true);
    }
    public static void main(String[] args) {
        Guiall g=new Guiall();
        //g.Act();
       g.GridBag();
    }
}
