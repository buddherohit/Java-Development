import java.util.Scanner;
public class methodstatic {
    public static void show(String name){
        System.out.println("This is a static method");
    }
    public static void main (String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your name:");
        String name=sc.nextLine();
        show(name);
    }

    
}