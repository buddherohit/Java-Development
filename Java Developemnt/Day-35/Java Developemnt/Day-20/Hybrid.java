
public class Hybrid {
    public void All(){
        System.out.println("apply to all");
    }
}
class A extends Hybrid{
    public void A(){
        System.out.println("Single inheritance");
    }
}
class C extends Hybrid{
    public void C(){
        System.out.println("multilevel inheritance");
    }
}
class D extends C{
    public void D(){
        System.out.println("Inherit from C");
    }
}
class E extends Hybrid{
    public void E(){
        System.out.println("Hirarchical inheritance");
    }
}
class F extends Hybrid{
    public void F(){
        System.out.println("Hirarchical");
    }
}
class main{
    public static void main(String[] args) {
        A a1=new A();
        Hybrid h1= new Hybrid();
        C c1=new C();
        D d1=new D();
    }
}