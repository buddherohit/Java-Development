interface Payment{
   void  pay();
   void refund( );
}
class CreditCard implements Payment{
 public void pay(){
    System.out.println("Paid 500 rs using credit card");
 }
 public void refund(){
    System.out.println("Refeund 200 rs using credit card");
 }
}
class UPI implements Payment{
    public void pay(){
        System.out.println("Pay using upi");
    }
   public void refund(){
        System.out.println("Refund using upi");
    }
}
class Paypal implements Payment{
  public  void pay(){
        System.out.println("Pay using paypal");
    }
   public void refund(){
        System.out.println("Refund using paypal");
    }
}
public class PaymentSystem {
    public static void main(String[] args) {
        Payment u1=new UPI();
        Payment c1=new CreditCard();
        Payment p1=new Paypal();
        u1.pay();
        u1.refund();
        p1.pay();
        p1.refund();
        c1.pay();
        c1.refund();
        
    }
}
