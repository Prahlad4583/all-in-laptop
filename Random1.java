import java.util.Random;
import java.util.Scanner;

public class Random1 {
    static void random() {
        Random a = new Random();
        int num = a.nextInt(50);
        Scanner sc=new Scanner(System.in);
        System.out.println("you have a five chance");
        System.out.println("Enter a number");
        int count=0;
        for (int i = 0; i < 5; i++) {
            int u =sc.nextInt(20);
            count++;
            if(u==num) {
                System.out.println("correct you won");
                System.out.println("attempt win"+count);
                break;
            }
                if(u>num){
                    System.out.println("Great than try again");

                }
                if(u<num){
                    System.out.println("less than try again");
                }

                    System.out.println("Your left attempt"+(5-count));

            }
        }

    public static void main(String[] args) {

        Random1 b=new Random1();
        random();



    }
}
