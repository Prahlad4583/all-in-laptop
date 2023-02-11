import java.util.Random;
import java.util.Scanner;

class user{
    static int num1=(int)(Math.random()*100);
    Random a =new Random();
    int num=a.nextInt(50);
    void input() {
        System.out.println("you hava a five chance");
        System.out.println("enter a number between 0 to 50");
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            int u = sc.nextInt();
            if (num < u) {
                System.out.println("lessthan than try again");
                System.out.println(num);
            }
            if (num > u) {
                System.out.println("Greater than try again");
                System.out.println(num);
            }
            if (num == u) {
                System.out.println("Correct You won");
                break;
            }
        }
    }
}


public class Game {

    public static void main(String[] args) {

        user b=new user();
        b.input();

        System.out.println(b.num);

    }
}
