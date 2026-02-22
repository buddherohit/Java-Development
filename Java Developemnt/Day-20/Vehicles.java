
public class Vehicles {
    public void Rotating(){
        System.out.println("Rotating a tyres");
    }
}
class Car extends Vehicles{
    public void Gears(){
        System.out.println("5 gears in car");
    }
}
class Bus extends Vehicles{
    public void Seats(){
        System.out.println("Multiple seats");
    }
}
class main{
    public static void main(String[] args) {
        Car c1=new Car();
        Bus b1=new Bus();
        c1.Rotating();
        c1.Gears();
        b1.Rotating();
        b1.Seats();

    }
}