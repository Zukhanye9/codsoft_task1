import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean playAgain;
        int totalRounds = 0;
        int totalAttempts = 0;

        System.out.println("Welcome to the Number Guessing Game!");

        do {
            
            totalRounds++;
            int attempts = playGame(scanner);
            totalAttempts += attempts;

            System.out.print("Do you want to play again? (yes/no)");
            String response = scanner.next();
            playAgain = response.equalsIgnoreCase("yes");
            
            
        } while (playAgain);

        System.out.println("Thank you for playing!");
        System.out.println("Total rounds played: " + totalRounds);
        System.out.println("Total attempts made: " + totalAttempts);
   }  

   private static int playGame(Scanner scanner) {
        Random random = new Random();
        int numberToGuess = random .nextInt(100) + 1;
        int maximumAttempts = 10;
        int attempts = 0;
        boolean guessedCorrectly = false;


        System.out.println("I have generated a number between 1 and 100. Can you guess it?");
        System.out.println("You have a maximum of " + maximumAttempts + "attempts.");

        while (attempts < maximumAttempts && !guessedCorrectly) {
            System.out.print("Enter your guess: ");
            int userGuess = scanner.nextInt();
            attempts++;

            if (userGuess == numberToGuess) {
                System.out.println("Well done! You guessed the correct number.");
                guessedCorrectly = true;
            } else if (userGuess < numberToGuess) {
                System.out.println("Your guess is too low.");
            }else {
                System.out.println("Your guess is too high.");
            }

            if (attempts == maximumAttempts && !guessedCorrectly) {
                System.out.println("Oops, you've used all your attempts. The correct number was " + numberToGuess);
            }
        }

        System.out.println("You used " +  attempts + "attempts to guess the number.");
        return attempts;
   } 
}
    
