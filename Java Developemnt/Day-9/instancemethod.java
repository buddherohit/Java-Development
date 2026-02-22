import java.util.Scanner;
public class instancemethod {
    public void show(String name){
        System.out.println("This is instance method");
    }
    public static void main(String args[])
{
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your name:");
    String name=sc.nextLine();
    instancemethod d=new instancemethod();
    d.show(name);
}}
