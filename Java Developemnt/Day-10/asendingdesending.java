import java.util.Scanner;
public class asendingdesending {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size");
        int n=sc.nextInt(); //size of array
        int num[]=new int [n]; // size array created
        System.out.println("Enter the value");
        for(int i=0; i<n; i++){
            num[i]=sc.nextInt();
        }
        for(int i=0; i<n; i++){
            System.out.println( i);
        }
        for(int i=n;i>0;i--){
            System.out.println(i);
        }

    }
}
