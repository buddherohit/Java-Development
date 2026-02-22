// PROBLEM:-  Take a input from user search a given number x and print the index at which it occur !!


import java.util.Scanner;
public class findnum {
    public static void main(String args[]) {
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the size of array:");
            int n = sc.nextInt(); // sixe of array
            int number[] = new int[n]; // array is created
            System.out.println("Enter numbers:");
            for (int i = 0; i < n; i++) { // take a input from user
                number[i] = sc.nextInt();
            }
            System.out.println("Enter value to Find:");
            int x = sc.nextInt(); // searching value store on x
            for (int i = 0; i < number.length; i++) {
                if (number[i] == x) {
                    System.out.println(x + " found at index: " + i);
                }

            }

        } while (true);

    }

}
