import java.util.Scanner;
public class printdetails {
    public static int printdetails(int BankAcoout){
        return BankAcoout;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your BankAcoout:");
        int BankAcoout=sc.nextInt();
        printdetails(BankAcoout);
    }
}
