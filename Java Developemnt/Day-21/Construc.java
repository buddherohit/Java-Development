
 class InheritConstructor {
    InheritConstructor(int a){
        System.out.println("I am a base class constructor");
    }

}
class Derived extends InheritConstructor{
    Derived(int x){
        super(10);
        System.out.println("I am a derived class constructor");
    }
}
public class Construc{
    public static void main(String[] args) {
        InheritConstructor i1=new InheritConstructor(10);
        Derived d1= new Derived(10);
        System.out.println(d1);
    }
}