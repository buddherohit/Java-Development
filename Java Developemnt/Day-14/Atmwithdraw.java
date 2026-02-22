import java.util.Scanner;
public class Atmwithdraw {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        float balace=sc.nextFloat();
        float amount=10000;
        if(amount<0){
            System.out.println("No Balance found at your account");
        }
        else{
            System.out.println(amount);
        }
    }
    
}
