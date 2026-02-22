import java.util.Scanner;
public class functions {
    public static void pirntParameter(int age, String name, Float sallary, char section){
        return;
    } 
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age, name, sallary ");
        int age=sc.nextInt();
        String name=sc.next();
        Float sallary=sc.nextFloat();
        System.out.println(age+ sallary+ name);
    }
}
