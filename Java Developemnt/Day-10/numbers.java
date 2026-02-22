import java.util.Scanner;
public class numbers {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of array: ");
        int n=sc.nextInt();
        int num[]=new int[n];
        System.out.println("Enter the " + n + " number "  );
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        System.out.println("The number is: ");


        
        for(int i=0; i<n; i++){
            System.out.println(num[i]);
        }
    }
}
