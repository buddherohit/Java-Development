interface Demo{
   
    private void Greet(){
        System.out.println("Good morning");
        
        
    }
     default void display(){
        Greet();
    };
}
interface Demo2 extends Demo{
    void show();
}
class Test implements Demo2{
    public void show(){
        System.out.println("This is show method");
    }
    
}
public class Privates {
    public static void main(String[] args) {
        Test t1=new Test();
        t1.show();
        t1.display();
    }
}
