import java.lang.*;
import java.util.Scanner;
public class Stringbuilder {
    public static void main(String []arguments) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your string");
        String name=sc.nextLine();
        StringBuilder sb=new StringBuilder(name);
        System.out.println("The user input string is :"+ sb);
        //StringBuilder str=new StringBuilder("Hello");
       // System.out.println("The string is" + str);
        //str.append("World");
        //System.out.println(str);
       // str.reverse();
        //System.out.println(str);
        sb.append("Buddhe");
        System.out.println(sb);
        sb.insert(0, "Hello" );
        System.out.println(sb);
        sb.setCharAt(0, 'R' );
        System.out.println(sb);
        sb.delete(0, 5);
        System.out.println(sb);
        System.out.println(sb.replace(0, 5, "Manish"));

    
}
}