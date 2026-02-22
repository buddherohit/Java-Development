import java.util.Scanner;
public class reverse {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the number");
        for(int i=0;i<n; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("Reverse elements is" );
        for(int i=n; i>0; i--){
            System.out.println(i);
        }


    }
    
}




