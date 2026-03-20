
 class Supers {
    void show(){
        System.out.println("Show the ");
    }
}
class dog extends Supers{
    void show(){
        super.show();
        
        System.out.println("Show the super");
        
    }
}
public class main{
    public static void main(String[] args) {
        dog d1=new dog();
        d1.show();
    }
    
}