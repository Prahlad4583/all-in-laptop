import java.util.Scanner;
import java.awt.*;
import java.awt.event.*;

  class Calculator {
    public int a, b;
    String s1,s2,s3,s4,s5;
    Frame f;
    Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9,badd,bsub,bmul,bdiv,beq,bclr;
    Panel p;
    TextField t1;
    GridLayout g;
    Calculator(){
        f=new Frame("calculator");
        f.setLayout(new FlowLayout());
        p=new Panel();
        b0=new Button("0");
        b0.addActionListener((ActionListener) this);
        b1=new Button("1");
        b1.addActionListener((ActionListener) this);
        b2=new Button("2");
        b2.addActionListener((ActionListener) this);
        b3=new Button("3");
        b3.addActionListener((ActionListener) this);
        b4=new Button("4");
        b4.addActionListener((ActionListener) this);
        b5=new Button("5");
        b5.addActionListener((ActionListener) this);
        b6=new Button("6");
        b6.addActionListener((ActionListener) this);
        b7=new Button("7");
        b7.addActionListener((ActionListener) this);
        b8=new Button("8");
        b8.addActionListener((ActionListener) this);
        b9=new Button("9");
        b9.addActionListener((ActionListener) this);
        badd=new Button("add");
        badd.addActionListener((ActionListener) this);
        bsub=new Button("sub");
        bsub.addActionListener((ActionListener) this);
        bmul=new Button("mul");
        bmul.addActionListener((ActionListener) this);
        bdiv=new Button("div");
        bdiv.addActionListener((ActionListener) this);
        beq=new Button("beq");
        beq.addActionListener((ActionListener) this);
        bclr=new Button("bclr");
        bclr.addActionListener((ActionListener) this);
        t1=new TextField(20);
        f.add(t1);
        g=new GridLayout(4,4);
        p.setLayout(g);
        p.add(b0);
        p.add(b1);
        p.add(b2);
        p.add(b3);
        p.add(b4);
        p.add(b5);
        p.add(b6);
        p.add(b7);
        p.add(b8);
        p.add(b9);
        p.add(badd); p.add(bsub); p.add(bmul); p.add(beq); p.add(bclr);
        f.add(p);
        f.setSize(200,180);
        f.setVisible(true);
        f.setBackground(Color.lightGray);
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e){
                System.exit(0);
            }
        });





    }
    double c;

    void add() {
        System.out.println("addistion is " + (a + b));
    }

    void sub() {
        System.out.println("subtriction is " + (a - b));
    }

    void multiply() {
        System.out.println("multiply is " + (a * b));
    }

    void div() {
        System.out.println("division is " + (a / b));
    }

    void sin() {
        System.out.println(Math.sin(Math.toRadians(c)));
    }

    void cos() {
        System.out.println(Math.cos(Math.toRadians(c)));
    }

    void tan() {
        System.out.println(Math.tan(Math.toRadians(c)));
    }

    void cosec() {
        System.out.println(1 / Math.sin(Math.toRadians(c)));
    }

    void sec() {
        System.out.println(1 / Math.cos(Math.toRadians(c)));
    }

    void cot() {
        System.out.println(1 / Math.tan(Math.toRadians(c)));
    }

    void sqr() {
        System.out.println(c * c);
    }

    void all() {
        Scanner sc = new Scanner(System.in);

        System.out.println("choose choice");
        System.out.println("1. add");
        System.out.println("2. sub");
        System.out.println("3. multiply");
        System.out.println("4. divide");
        System.out.println("5. sin");
        System.out.println("6. cos");
        System.out.println("7. tan");
        System.out.println("8. cosec");
        System.out.println("9. sec");
        System.out.println("10. cot");
        System.out.println("11. sqr");
        int ch;
        ch = sc.nextInt();
        switch (ch) {
            case 1:

                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                add();
                break;
            case 2:

                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                sub();
                break;
            case 3:

                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                multiply();
                break;
            case 4:

                System.out.println("Enter first number");
                a = sc.nextInt();
                System.out.println("Enter second number");
                b = sc.nextInt();
                div();
                break;

            case 5:

                System.out.println("Enter a number");
                c = sc.nextInt();
                sin();
                break;
            case 6:

                System.out.println("Enter a number");
                c = sc.nextInt();
                cos();
                break;
            case 7:

                System.out.println("Enter a number");
                c = sc.nextInt();
                tan();
                break;
            case 8:

                System.out.println("Enter a number");
                c = sc.nextInt();
                cosec();
                break;
            case 9:

                System.out.println("Enter a number");
                c = sc.nextInt();
                sec();
                break;
            case 10:

                System.out.println("Enter a number");
                c = sc.nextInt();
                cot();
                break;
            case 11:

                System.out.println("Enter a number");
                c = sc.nextInt();
                sqr();
                break;
            default:
                System.out.println("Incorrect choice");

        }all();
    }

      public static void main(String[] args) {
         Calculator c=new Calculator();
         c.all();
      }
}