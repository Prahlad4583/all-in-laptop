import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;
import java.util.Scanner;


public class Emailser  {
    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(8080);
            System.out.println("server is running");
            File f=new File("C:\\Users\\HP\\OneDrive\\Desktop\\cctns.txt");
            if(f.createNewFile()){
                System.out.println("create new file succesfully");
            }else {
                System.out.println("File already exists");
            }
            FileWriter fw=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\cctns.txt");
            fw.write("cctns data");
            fw.close();
            while (true){
                Scanner sc=new Scanner(System.in);
                Socket s=ss.accept();
                System.out.println("Connection is successfully");
                PrintStream ps=new PrintStream(s.getOutputStream());
                Scanner sc1=new Scanner(s.getInputStream());
                while(true){
                    String name=sc1.nextLine();
                    String dio=sc1.nextLine();
                    String email=sc1.nextLine();
                  //  fw.write(name+dio+email);
            File rd=new File("C:\\Users\\HP\\OneDrive\\Desktop\\cctns.txt");
                    Scanner read=new Scanner(rd);
                    String data= read.nextLine();
                    if(data.contains(email))
                    {ps.println("data already plz use another data");}
                    else {
                        System.out.println(name+"\n"+dio+"\n"+email);
                    }
                    Random pass=new Random();
                    int password=pass.nextInt(1111,9999);
                 FileWriter fw1=new FileWriter("C:\\Users\\HP\\OneDrive\\Desktop\\cctns.txt",true);
                fw1.write(email+password);
                fw1.close();
                ps.println("congratulation  "+name+" your account has been created successfully your login id - "+email+" password-  "+password);

                }

            }
        }
        catch (Exception e){
            System.out.println(e);
        }
    }
}
