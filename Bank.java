import java.util.Scanner;
abstract class BankService {
    public String Name = "State bank of India";
    public String IFSC = "SBIN0004913";

    public void bankdetail() {
        System.out.println("Bank_Name: " + Name + "\n" + "Bank_ifsc code " + IFSC);
    }

    abstract void Deposite();

    abstract void Withdraw();

    abstract void Checkbal();


}
class Bankk extends  BankService {
    private double bal = 5000;
    private int pwd;
    double money;

    public void Deposite() {
        System.out.println("Enter your password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Enter amout");
            money = s.nextInt();
            bal = bal + money;
            System.out.println("Deposite: " + money);
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("inccorect password");
        }
    }

    public void Withdraw() {
        System.out.println("Enter your password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Enter amout");
            money = s.nextInt();
            if(money<=bal){
            bal = bal - money;
            System.out.println("Withdraw: " + money);
            System.out.println("Total balance: " + bal);}
            else{
                System.out.println("insusffunt balance");
            }
        } else {
            System.out.println("inccorect password");
        }
    }

    public void Checkbal() {
        System.out.println("Enter your password");
        Scanner s = new Scanner(System.in);
        pwd = s.nextInt();
        if (pwd == 123) {
            System.out.println("Total balance: " + bal);
        } else {
            System.out.println("inccorect password");
        }
    }
}
     class Bank extends Bankk{
    public void ser(){
        int ch;
        System.out.println("1. Deposite");
        System.out.println("2. Withdraw");
        System.out.println("3. Checkbal");

        System.out.println("\nEnter your choice:");
        Scanner s=new Scanner(System.in);
        ch=s.nextInt();
        switch (ch)
        {
            case 1: Deposite();
                break;
            case  2: Withdraw();
                break;
            case  3: Checkbal();
                break;
            default:
                System.out.println("incorrct choice");
        }
    }
     public static void main(String[] args) {
     }
 }



