import java.util.Scanner;
public class inttypefun {
    public static int Addition(int x, int y){
        return x+y;
    }
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.println(Addition(x, y));
    }
}
