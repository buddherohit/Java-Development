
abstract class Pen {
    abstract void write();
    abstract void refill();
}
class FountainPen extends Pen{
    void write(){
        System.out.println("Writing with fountain pen");
    }
    void refill(){
        System.out.println("Refilling fountain pen");
    }
    void changeNib(){
        System.out.println("Changing nib of fountain pen");
    }
}
public class Pens{
    public static void main(String[] args) {
        Pen p1=new FountainPen();
        p1.write();
        p1.refill();
    
    }
}
