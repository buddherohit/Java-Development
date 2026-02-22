import java.util.Scanner;
public class fruits {
    public static void main(String args[]){
        do{
Scanner sc=new Scanner(System.in);
        System.out.println("Enter the size of string");
        int size=sc.nextInt();
        sc.nextLine();
        String fruits[]=new String[size];
        System.out.println("Enter fruits name");
        for(int i=0; i<size; i++){
            fruits[i]=sc.nextLine();
        }
        System.out.println("Enter name to find");
        String x=sc.nextLine();
        boolean found=false;
        for(int i=0; i<fruits.length; i++){
            if(fruits[i].equals(x)){
                System.out.println(x + " found in the string " + i);
                found=true;
                break;
                
            }
        }
        if(!found){
            System.out.println(x + " not found");
            sc.close();
        }
    }while(true);
}

        }
        