abstract class Animals {
    public static void main(String[] args) {
        Dog d=new Dog();
        d.run();
    }

    abstract void run();
    
}
class Dog extends Animals{
    void run(){
        System.out.println("Dog is running");
    }
}


    



