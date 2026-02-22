
 class Dynamicmethod {
    public void Greet(){
        System.out.println("Goood Morning");
    }
    public void name(){
        System.out.println("My name is java");
    }
}
class Dynamics extends Dynamicmethod{
    public void Swagat(){
        System.out.println("Welcome");

    }
    public void name(){
        System.out.println("my name is java of class 2");
    }
}
public class Show{
    public static void main(String[] args) {
        Dynamicmethod d1=new Dynamics();
        d1.Greet();
        d1.name();
    }
}