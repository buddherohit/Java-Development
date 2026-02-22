import java.util.Scanner;
public class maxnum {
    public void max(int a, int b, int c){
        
        if(a>b && a>c){
            System.out.println(a+" is maximum");
        }
        else if(b>c && b>a){
            System.out.println(b+" is maximum");
        }
        else{
            System.out.println(c+" is maximum");
        }

    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first number");
        int a=sc.nextInt();
        System.out.println("Enter second number");
        int b=sc.nextInt();
        System.out.println("Enter third number");
        int c=sc.nextInt();
        System.out.println("Finding maximum number among three numbers");
        maxnum obj=new maxnum();
        obj.max(a, b, c);
    }
}
