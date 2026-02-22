import java.util.Scanner;

public class calculator {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("Enter Your Choice");
           int num=sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();

            switch (num) {
                case 1:
                    System.out.println("The Addition is:" + (a + b));
                    break;
                case 2:
                    System.out.println(a - b);
                    break;
                case 3:
                    System.out.println("Multiplication" + (a * b));
                    break;
                case 4:
                    System.out.println("Division" + (a / b));
                    break;
                case 5:
                    System.out.println("Modulo" + (a % b));

                default:
                    System.out.println("Invalid Choice");
                    break;
            }

        } while (true);
    }

}
