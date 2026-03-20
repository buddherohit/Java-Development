
 class Animals {
   public static  void move(){
        System.out.println("Animal is moving");
    }
}
class Dog extends Animals{
   public static void move(){
        System.out.println("Dog is moving");
    }
    void bark(){
        System.out.println("Dog is Barking ");
    }
}
public class Animal{
    public static void main(String[] args) {
        Dog d1=new Dog();
        d1.move();
    }
}