import java.util.Scanner;

class MyException extends Exception{
    @Override
    public String toString(){
        return "This is my exception";
    } 
    @Override
    public String getMessage(){
        return "This is my exception message";
    }
}
public class UserDefindedExce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your age:");
        int age=sc.nextInt();
       try {
           if (age<18) {
               throw new MyException();
           }
       } catch (MyException e) {
        //System.out.println("this is  my custom  exception:");
           //System.out.println(e);
           System.out.println(e.getMessage());
           System.out.println(e.toString());
           //System.out.println(e);
           e.printStackTrace();
           System.out.println("Finished");
           System.out.println("Final Finished");
       }
        
    }
}
