abstract class TV {
    abstract void turnOn();
    abstract void turnOff();
}
class TVRemote extends TV{
    void turnOn(){
        System.out.println("Turning on the tv");
    }
    void turnOff(){
        System.out.println("Tunrning off the tv");
    }
}
public class Ab{
    public static void main(String[] args) {
        TVRemote remote =new TVRemote();
        remote.turnOn();
        
    }

}