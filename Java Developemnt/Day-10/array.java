import java.util.Scanner;
public class array {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of array");
        int size=sc.nextInt();
        int marks[]=new int[size];
        marks[0]=90;
        marks[1]=80;
        marks[2]=70;
        marks[3]=60;
        marks[4]=50;
        marks[5]=40;
        marks[6]=30;
        marks[7]=20;
            marks[8]=10;
            marks[9]=0;
            marks[0]=100;
        System.out.println("Marks of students are:");
        for(int i=0;i<size; i++){
            System.err.println(marks[i]);
        }
        
    }
}
