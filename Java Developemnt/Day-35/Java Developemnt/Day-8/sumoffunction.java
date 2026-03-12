import java.util.Scanner;
public class sumoffunction {
    public static int sum(int a, int b){
        return a+b;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("Sum is:");
        System.out.println(sum(a,b)); // function call
    }
}
