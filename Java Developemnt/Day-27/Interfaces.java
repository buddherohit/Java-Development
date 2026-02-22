interface Animal{
    void sound();
}
class Dog implements Animal{
    public void sound(){
        System.out.println("Dog are Barking");
    }
}
public class Interfaces {
    public static void main(String[] args) {
    Animal a1=new Dog();
    a1.sound();
    }
}
