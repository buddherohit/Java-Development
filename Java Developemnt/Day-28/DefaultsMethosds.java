interface A{
    void show();
    private void Greet(){
        System.out.println("Good Morning");
    }
    default void display(){
        
        System.out.println("This is  display default method");
            Greet();
    }
}
interface B extends A{
    void print();
    
}
class Tests implements  B{
    public void show(){
        System.out.println("This is show message");
    }
    public void print(){
        System.out.println("Print the message");
        
        
    }
}
public class DefaultsMethosds {
    public static void main(String[] args) {
        Tests t1=new Tests();
        t1.show();
        t1.print();
        t1.display();
        
    }
}
