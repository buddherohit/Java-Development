class Phones{
    void show(){
        System.out.println("Good mornign");
    }
    void music(){
        System.out.println("Playing a music");
    }
    void on(){
System.out.println("Mobile is on...");
    }
    void touch(){
        
    }

}
class Smartphone extends Phones{
    void on(){
        System.out.println("Smartphone is on...");
    }
    void touch(){
        System.out.println("It is a touch screen Smartphone");
    }
}
 public class Phone {
    public static void main(String[] args) {
        Phones p1=new Smartphone();
        p1.on();
        p1.show();
        p1.touch();
        
    }
}
