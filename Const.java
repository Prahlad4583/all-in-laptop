import java.util.concurrent.Callable;

public class Const {

    int a;
    String  b;
    public Const(int c,String d)    {
         a= c;
         b= d;
    }

    public static void main(String[] args) {
        Const obj=new Const(10,"prahlad");
        Const obj1 = new Const(20,"Aarti");
        System.out.println(obj.a+" "+obj.b);
        System.out.println(obj1.a+" "+obj1.b);
    }
}
