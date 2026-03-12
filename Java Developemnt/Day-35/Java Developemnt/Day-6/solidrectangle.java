import java.util.Scanner;
public class solidrectangle {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Outer Loop Values:");
        int n=sc.nextInt();
        System.out.println("Enter the Inner loop Values:");
        int m=sc.nextInt();
        System.out.println("The Pattern Is:");
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                System.out.print("*");
            }System.out.println();
        }
        
    }
    
}
