import java.util.Scanner;
public class addition {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value of a");
        int a=sc.nextInt();
        System.out.println("Enter value of b");
        int b=sc.nextInt();
        System.out.println("Addition of two numbers is:"+ (a+b));
        System.out.println("Before swapping:");
        System.out.println("A="+ a);
        System.out.println("B="+ b);
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("After swapping:");
        System.out.println("A="+ a);
        System.out.println("B="+ b);

    }
}
