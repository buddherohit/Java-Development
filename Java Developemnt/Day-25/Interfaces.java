interface Car {
void start();
void stop();
    
}
class BMW implements Car{
    public void start(){
        System.out.println("BMW Is starting");
    }
    public void stop(){
        System.out.println("BMW Is Stopping");
    }
}
public class Interfaces {
    public static void main(String[] args) {
        BMW b=new BMW();
        b.start();
        b.stop();
    }
}
