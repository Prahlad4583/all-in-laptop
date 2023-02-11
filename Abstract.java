abstract class animal{
    void legs(){
        System.out.println("all animal are 4 legs");
            }
    abstract void sound();
    abstract void eat();
}
class Dog extends animal{
    @Override
    void sound() {
        System.out.println("Bho...Bho");
    }

    @Override
    void eat() {
        System.out.println("meet");
    }
}
class Cow extends animal{
    @Override
    void sound() {
        System.out.println("aa...aa");
    }

    @Override
    void eat() {
        System.out.println("grass");
    }
}
public class Abstract {
    public static void main(String[] args) {
        Dog a=new Dog();
        a.legs();
        a.sound();
        a.eat();
        Cow c=new Cow();
        c.legs();
        c.sound();
        c.eat();

    }
}