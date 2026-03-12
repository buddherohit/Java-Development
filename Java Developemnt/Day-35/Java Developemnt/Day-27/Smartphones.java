interface Camera{
    void click();
    default void capture(){
        System.out.println("This is default method");
    }
}
interface GPS{
    void location();
}
class Nokia {
    void call(int num){
        System.out.println("Calling a number");
    }
}
class Mobiles extends Nokia implements Camera, GPS  {
    public void click(){
        System.out.println("Click a phonto");
    }
    public void location(){
        System.out.println("Track a location");
    }
   
}
public class Smartphones {
    public static void main(String[] args) {
        Mobiles m1=new Mobiles();
        m1.click();
        m1.location();
        m1.call(85);
        m1.capture();
        
    }
}
