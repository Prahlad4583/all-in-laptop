import java.util.Scanner;

public class Sum {
    public static void main(String[] args) {
        int a;
        long b;
        long c=0;
        long d=1;
        System.out.println("Enter a number ");
        Scanner S=new Scanner(System.in);
        a=S.nextInt();
        for(b=1;b<=a;b++) {

            if (b % 2 == 1) {
                System.out.print((d = d * b)+"\t");
            }
            if (b % 2 == 0) {
                System.out.println(c = c + b);
            }
        }
    }

}
