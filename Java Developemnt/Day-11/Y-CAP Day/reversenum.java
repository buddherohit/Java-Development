import java.util.Scanner;
public class reversenum {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a number to reverse");
        int num=sc.nextInt();
        int rev=0;int sum=0;
        while(num!=0){
            int digit=num%10;
            if (num%2==0) {
                sum=sum+digit;
            }
            rev=rev*10+digit;
            num=num/10;
        }
        System.out.println("Reversed Number is: " + rev);
        System.out.println("Addition of reverse num is "+sum);
        
    }
    
}
