import java.util.Scanner;

public class buttonswitchcase {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do{
            System.out.println("Enter Your Choice");
            int Button = sc.nextInt();
        switch (Button) {
            case 1:
                System.out.println("Hello");

                break;
            case 2:
                System.out.println("Namaste");
                break;
            case 3:
                System.out.println("Bonzoor");
                break;
            default:
                System.out.println("Invalid Choice");
                break;
        }
    }while(true);
}
        }
        