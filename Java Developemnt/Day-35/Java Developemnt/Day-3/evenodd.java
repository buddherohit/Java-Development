import java.util.Scanner;
public class evenodd {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number:");
 int num=sc.nextInt();
        if(num%2==0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd");
        }
       
        }while(true);
    }
}
