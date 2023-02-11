import java.util.Random;
import java.util.Scanner;
import Prahlad.*;
class gen{
    String word() {
        String movie[] = {"pk", "indian", "kgf2", "the hero", "guest in london"};
        Random rn = new Random();
        int index = rn.nextInt(movie.length-1);
        String word = movie[index];
        System.out.println(word);
        return word;
    }
    void check() {
        String word = word();
        String w=word;
        int flag=0;

        String temp[]=new String[word.length()];


        System.out.println("length is  "+word.length());
        Scanner sc = new Scanner(System.in);

        for (int i = 0; flag<=4; i++) {
            String input = sc.next();
            if (word.contains(input))
            {
                int ind=word.indexOf(input);
                temp[ind]=input;
                word=word.replaceFirst(input,"null");
                System.out.println(word);
                System.out.println(w);
                for(String string: temp){
                    System.out.println(string);
                    if(word=="null"){
                        System.out.println("you win");
                        break;
                    }
                }

                System.out.println("Exist");
            } else
            {
                System.out.println("wrong word try again");
                flag++;
            }




        }

        System.out.println("you lose");
    }
}
public class Game1 {
    public static void main(String[] args) {

        gen g=new gen();
        g.check();
    }
}