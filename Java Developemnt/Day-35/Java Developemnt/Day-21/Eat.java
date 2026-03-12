 class Inherit {
    public void show(){
        System.out.println("Parent class element");
    }
    
}
class Child extends Inherit{
    public void show(){
        System.out.println("Child class element");
    }
}
public class Eat{
    Inherit e1=new Inherit();
    
}