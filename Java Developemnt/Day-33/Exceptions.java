
public class Exceptions {
    public static void main(String[] args) {
        int a = 400;
        int b = 0;
        try {
            int c = a / b;
        } catch (Exception n) {
            System.out.println("cannot divide the number because it is zero change the number");
            System.out.println(n);
        }

        System.out.println("continue the program");
    }
}