
public class GuessNumber {
    public static void main(String[] args) {
        int number=27;
        int guess=0;
        System.out.println("Welcome to the Number Guessing Game!");
        while(guess!=number){
            System.out.println("Enter your guess:");
            // For demonstration purposes, we'll simulate user input with a random number
            guess=(int)(Math.random()*50);
            System.out.println("You guessed: " + guess);
            if(guess<number){
                System.out.println("Too low! Try again.");
            } else if(guess>number){
                System.out.println("Too high! Try again.");
            } else {
                System.out.println("Congratulations! You've guessed the correct number: " + number);
            }
        }
    }
}
