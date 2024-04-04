import java.util.Scanner;
import java.util.Random;

public class numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // create a scanner object to red to user input
        Random random = new Random(); // to generate random numbers
        

        //thisi are welcome messeges
        System.out.println("This is the Number Game!");
        System.out.println("I will generate a random number between 1 and 100.");
        System.out.println("Guess the number.\n");

        //initializing game score
        int score = 0;
        boolean playAgain = true;

        while (playAgain) {
            int randomNumber = random.nextInt(100) + 1; // generating random number between 0 to 100

            int attempts = 0; // initializing number of attempts

            System.out.println("Round begins...");
            System.out.println("You have only 5 attempts to guess the number.\n");

            //guessing loop
            while (attempts < 5) {
                attempts++;
                System.out.print("Attempt " + attempts + ": Enter your guess (1-100): ");
                int guess = scanner.nextInt();

                if (guess == randomNumber) {
                    System.out.println("Congratulations! You guessed the number.");
                    score++;
                    break;
                } else if (guess < randomNumber) {
                    System.out.println("Too low. Try again.");
                } else {
                    System.out.println("Too high. Try again.");
                }
            }

            if (attempts == 5) {
                System.out.print("\nDo you want to play again? (yes/no): ");
                String playChoice = scanner.next().toLowerCase();
                playAgain = playChoice.equals("yes") || playChoice.equals("y");
            }
        }

        System.out.println("\nGame over. Your total score is: " + score);
        scanner.close();
    }
}