import java.util.Scanner;
public class website {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your website name");
        String web=sc.nextLine();
        if(web.endsWith(".com")){
            System.out.println("Commercial website");
        }
        else if(web.endsWith(".org")){
            System.out.println("Organizational website");
        }
        else if(web.endsWith(".in")){
            System.out.println("Indian website");
        }
        else{
            System.out.println("Unknown website");
        }
    }
}
