
class Animals {
    public void Sound() {
        System.out.println("Animal makes a sound");
    }
    public void Colors() {
        System.out.println("Colors");
    }
}
class Dog extends Animals { // single
    public void Sound() {
        System.out.println("Dog barks");
    }
}
class Cat extends Dog { // multilevel
    public void Voice() {
        System.out.println("Meowww");
    }
}
public class Geeks {
    public static void main(String[] args) {
        Animals a = new Animals();
        // a.Sound();
        Dog d1 = new Dog();
        d1.Sound();
        d1.Colors();
        Cat c1 = new Cat();
        c1.Sound();
        c1.Colors();
        c1.Voice();
        
    }
}
