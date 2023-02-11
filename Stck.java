import java.util.Scanner;

public class Stck {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a[]=new int[n];
    int top=-1;

    public void push() {
        for (int i = 0; i <= n; i++) {
            System.out.println("enter store number");
            int x = sc.nextInt();
            if (top == n-1) {
                System.out.println("stack overflow");
            } else {
                top = top + 1;
                a[top] = x;
              }
        }for(int j=0;j<=n-1;j++){
            System.out.println(a[top]);}
    }
    public void pop(){
        if(top==-1){
            System.out.println("stack empty");
        }else {
            int x=a[top];
            top -=1;
            System.out.println(x);
        }

    }

    public static void main(String[] args) {
        Stck s=new Stck();
       // s.push();
        s.pop();
    }
}
