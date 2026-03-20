
 class Vehicles {
    int speed=100;

}
class Car extends Vehicles{
    int speed=200;
    void show(){
        System.out.println("The speed is"+ super.speed);
    }
}
public class Gadi{
    public static void main(String[] args) {
        Car c1=new Car();
        c1.show();
    }
}