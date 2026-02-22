import java.util.Scanner;
public class percentagecal{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter total marks");
        double totalmarks=sc.nextDouble();
        System.out.println("Enter marks obtained");
        double obtained=sc.nextDouble();
        System.out.println("percentage is:"+ (obtained/totalmarks)*100);
    
    }
}