import java.net.*;
import java.io.*;
import java.util.Scanner;
public class Client extends Thread{
    public void run(){
        try {
            Socket s = new Socket("Localhost", 8080);

            while (true) {
                Scanner sc = new Scanner(s.getInputStream());
                Scanner sc1 = new Scanner(System.in);
                PrintStream ps = new PrintStream(s.getOutputStream());
                while (true) {
                    String st = sc.nextLine();
                    System.out.println(st);
                    if (st.equals("stop")) {
                        break;
                    }
                    String pq = sc1.nextLine();
                    ps.println(pq);
                }
                s.close();
            }
        }
        catch (Exception e){
            System.out.println(e);
        }

    }
    public static void main(String[] args) {
       Client c=new Client();
       c.start();
    }
}