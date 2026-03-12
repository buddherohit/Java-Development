import  java.util.Scanner;
public class calculation {
    public static void main(String args[]){
        Scanner num=new Scanner(System.in);
        int a=num.nextInt();
        int b=num.nextInt();
        int result=a*b /a-b;
        System.out.println("The result of calculation is:" + result);
    }
}
