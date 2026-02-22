import java.util.Scanner;
public class Default {
    int id;
    String name;
    int rollno;
    Default(){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the id");
        id=sc.nextInt();
        
        System.out.println("Enter the roll no");
        rollno=sc.nextInt();
        System.out.println("Enter the name");
        name=sc.next();

    }
    public static void main(String[] args) {
        
        Default d1=new Default();
        System.out.println(d1.name);
        System.out.println(d1.id);
        System.out.println(d1.rollno);
    }
}
