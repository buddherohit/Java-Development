
public class Thorw {
    public static void main(String[] args) {
        int age=10;
        if (age<20) {
            throw new ArithmeticException("Age is less than 20");
        }
        System.out.println("Continue the program");
    }
}
