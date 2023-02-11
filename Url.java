import java.io.*;
import java.net.*;
public class Url{
    public static void main(String[] args){
        try{
            URL url=new URL("http://www.javatpoint.com/java-tutorial");
            HttpURLConnection huc=(HttpURLConnection)url.openConnection();
            for(int i=1;i<=18;i++){
                System.out.println(huc.getHeaderFieldKey(i)+" = "+huc.getHeaderField(i));
            }
            huc.disconnect();
        }catch(Exception e){System.out.println(e);}
    }
}    