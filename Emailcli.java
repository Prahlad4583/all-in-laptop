import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Emailcli {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("Localhost", 8080);

            while (true) {
                Scanner sc1 = new Scanner(s.getInputStream());
                Scanner sc = new Scanner(System.in);
                PrintStream ps = new PrintStream(s.getOutputStream());
                while (true) {
                    System.out.println("enter your name");
                    String name = sc.nextLine();
                    System.out.println("select your dipartment 1.java 2.android 3.fullystack");
                    String dip=sc.nextLine();
                    System.out.println("enter your email id");
                    String email=sc.nextLine();
                    ps.println(name);
                    ps.println(dip);
                    ps.println(email);
                    String st=sc1.nextLine();
                    System.out.println(st);
                    if (st.equals("stop")) {
                        break;
                    }

                }
                s.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}