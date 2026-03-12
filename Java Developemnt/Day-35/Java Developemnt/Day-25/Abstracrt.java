abstract class Parent{
    public void Hello(){
        System.out.println("Hello Piyaaaa");
    }
    abstract void Greet();
}
class child extends Parent{
    void Greet(){
        System.out.println("Good Night Piyaaaa");
    }
}
public class Abstracrt {
    public static void main(String[] args) {
        child c=new child();
        c.Greet();
        c.Hello();
    }
}
