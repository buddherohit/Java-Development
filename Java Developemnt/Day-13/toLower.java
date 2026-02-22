import java.util.Scanner;
public class toLower {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String str=sc.nextLine();
        System.out.println("The lowercase string is: "+ str.toLowerCase() );
        System.out.println(str.charAt(0)+str.toLowerCase());
        System.out.println(str.replace(" ", "_"));

    }
    
}
