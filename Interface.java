interface vehical {

    int speed = 100;

    void start();

    void stop();
}
 class Interface implements vehical {

    public void start(){
        System.out.println("start(): insert key & press start button");
    }
    public void stop(){
        System.out.println("stop(): exit keys");
    }

     public static void main(String[] args) {
         Interface i=new Interface();
         i.start();
         i.stop();
     }
}
