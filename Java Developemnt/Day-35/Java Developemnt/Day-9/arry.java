import java.util.Scanner;
public class arry{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int n=sc.nextInt();
        int marks[]=new int[n];
        for(int i=0; i<n; i++){
            System.out.println("Enter marks of student " + (i+1) + ":");
            marks[i]=sc.nextInt();
            
        }

    }
}