import java.util.Scanner;
public class bazzinga {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        do{
            System.out.println("Enter the number");
        int num=sc.nextInt();
        if(num%2==0){
            System.out.println("Bezzinga ");
        }else{
            System.out.println("Not Bezzinga");
        }
    } while(true);
}

 }
       