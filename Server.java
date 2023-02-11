import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;


public class Server extends Thread{
    @Override
    public void run(){try
    {
        ServerSocket s = new ServerSocket(8080);
        while (true){
            Scanner sc=new Scanner(System.in);
            Socket w=s.accept();
            System.out.println("Connection is successfully");
            PrintStream ps=new PrintStream(w.getOutputStream());
            Scanner sc1=new Scanner(w.getInputStream());
            while(true){
                String p=sc.nextLine();
                ps.println(p);
                String st=sc1.nextLine();
                System.out.println(st);
                if(st.equals("stop")){
                    break;}
            }
            w.close();
        }
    }
    catch (Exception e){
        System.out.println(e);
    }}
    public static void main(String[] args) {
        Server s=new Server();
        s.start();

    }
}
