interface Add{
    void add(int num1,int num2);

}
interface Sub extends Add{
    void sub(int num1,int num2);

}
class Operation implements  Sub{
    public void add(int num1,int num2){
        System.out.println("Addition of two num");
    }
    public void sub(int num1,int num2){
        System.out.println("Subtractio of two numbers");
    }
}

public class Multi {
    public static void main(String[] args) {
        Add a1=new Operation();
        Sub s1=new Operation();
        a1.add(10,20);
        s1.sub(20,30);
        s1.add(10,40);
        
    }
}
