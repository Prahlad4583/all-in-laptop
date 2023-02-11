import java.sql.SQLOutput;

public class Largest {
    public static void main(String[] args)
    {
        int a=500;
        int b=60;
        int c=2005;
        if(a>b)
        {
            if(a>c)
            {
                System.out.println(a);
            }
            else
            {
                System.out.println(c);
            }
        }
        else
        {
            if(b>c)
            {
                System.out.println(b);
            }
            else
            {
                System.out.println(c);
            }
        }

    }
}
