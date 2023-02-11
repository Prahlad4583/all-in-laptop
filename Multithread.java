public class Multithread extends Thread{
    public void run(){
        System.out.println("this is multiThread class");
        System.out.println(Thread.currentThread().getName());
        System.out.println("prahld");
    }
    public static void main(String[] args) {
        Multithread m=new Multithread();
        Multithread m1=new Multithread();
        m.start();
                System.out.println("this is main thread ");
                try{
                    m.join(1);
                }catch (Exception e){
                    System.out.println(e);
                }

        m1.start();
    }
}
