import java.util.Scanner;
public class twoDarray {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Rows");
        int row=sc.nextInt();
        System.out.println("Enter number of columns");
        int col=sc.nextInt();
        int numbers[][]=new int[row] [col];
        for(int i=0; i<row; i++){
            for(int j=0; i<col; j++){
                numbers[i][j]=sc.nextInt();
                
            }
            
                }for(int i=0; i<row; i++){
                for(int j=0; j<col; j++){
                    System.out.print(numbers[i][j] + " ");
            }
        }System.out.println();
    }
    
}

