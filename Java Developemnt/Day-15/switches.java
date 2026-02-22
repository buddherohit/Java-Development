import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your age");
        int age = sc.nextInt();
        switch (age) {
            case 18:
                System.out.println("Adult");
                break;
            case 36:
                System.out.println("Peak time");
                break;
            case 50:
                System.out.println("Take a rest");
                break;
            case 60:
                System.out.println("Retired");
                break;
            default:
                System.out.println("Unkonwn");

        }

    }
}
