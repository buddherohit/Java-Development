import java.util.Scanner;
public class greaternum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter your number");
        int num= sc.nextInt();
        int num2=sc.nextInt();
        if(num<num2){
            System.out.println("The number is smaller");
        }
        else if (num>num2) {
            System.out.println("The number is Greater");
            
        }
        else{
            System.out.println("The number is equal");
        }
            
        }while(true);
    }


        }
       