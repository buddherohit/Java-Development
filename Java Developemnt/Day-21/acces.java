
 class Modifiers {
    int a=45;
    public int b=54;
    protected int c=65;
    private int x=12;
    public void math1(){
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(x);
       
    }

}

public class acces{
    public static void main(String[] args) {
        Modifiers m1= new Modifiers();
        m1.math1();
       
        
    }
}
