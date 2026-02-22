import java.util.Scanner;
public class username {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        String name= sc.next();
        int age=sc.nextInt();
        long number=sc.nextLong();
        System.out.println("Hellow " + name);
        System.out.println("The age of person is:" + age);
        System.out.println("Enter your number"  +  number);
    }
}
