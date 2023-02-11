import java.util.Scanner;

public class Array {
    void view() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size");
        int size = sc.nextInt();
        int s=sc.nextInt();
        int a[] [][]= new int[size][s][2];
        for (int i = 0; i < size; i++)
            for(int j=0; j<a[i].length; j++)
                for(int k=0;k<a[i].length; k++){
            a[i][j][k] = sc.nextInt();
        }
        System.out.println("printed arrray");
         for (int i = 0; i < size; i++){
            for(int j=0; j<a[i].length; j++)
                for(int k=0;k<a[i].length; k++){
             System.out.print(a[i][j][k]+" ");}}
         System.out.println();//new line
    }

    public static void main(String[] args) {
        Array a=new Array();
        a.view();
    }
}
