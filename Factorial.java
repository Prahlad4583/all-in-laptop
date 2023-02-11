import java.sql.SQLOutput;
import java.util.Scanner;

public class Factorial {
    public static void main(String[]args)
    {
        int num;
        int f=1;
        int i;
        System.out.println("Enter number:");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();

        for( i=1;i<=num;i++)
        {   f=f*i;

        } System.out.println(f);
        System.out.println(i);
    }
}
