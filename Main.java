import java.util.Scanner;
public class Main
{
    public static void main(String[] args)
    {
        Scanner p=new Scanner(System.in);
        System.out.println("Enter a Number");
        int i;
        int l;
        int e;
        int j;
        for(i=1;i<=5;i++)
        {
            for(j=i;j<5;j++)
            {
                System.out.print(" ");
            }


            for(l=2;l<=i;l++)
            {
                System.out.print("*");
            }


            for(e=1;e<=i;e++)
              {
                System.out.print("*");
            }
            System.out.print("\n");
        }





    }

    public static class niraj {
    }
}
