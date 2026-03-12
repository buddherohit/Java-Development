public class HotelBooking {
    String name;
    String roomType;
    int numberOfDays;
    double BillAmount;
    HotelBooking(String name){
        this.name=name;
        roomType="Standard";
        numberOfDays=1;
        BillAmount=1000;

    }

HotelBooking(String name, String roomType){
    this.name=name;
    this.roomType=roomType;
    numberOfDays=1;
    BillAmount=2000;
}
HotelBooking(String name, String roomType, int numberOfDays){
    this.name=name;
    this.roomType=roomType;
    this.numberOfDays=numberOfDays;
    BillAmount=numberOfDays*2000;
}
}
 Void display(){
        System.out.println("name"+ " " +name);
        System.out.println("roomType"+ " " +roomType);
        System.out.println("numberOfDays"+ " " +numberOfDays);
        System.out.println("BillAmount"+ " " +BillAmount);

    }
    class Booking{
        public static void main(String[] args) {
            HotelBooking h1=new HotelBooking("Rohit");
            h1.display();
            HotelBooking h2=new HotelBooking("Rohit", "Deluxe");
            h2.display();
            HotelBooking h3=new HotelBooking("Rohit", "Suite", 5);
            h3.display();
        }
    }
}
