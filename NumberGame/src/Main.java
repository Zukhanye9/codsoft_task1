import java.util.Random;
import java.util.Scanner;


public class Main {
    public static void main(String[] arg) {
       //Create instance of the Random class
       Random random = new Random();


       //Generate a random number between 1 and 100
       int minumum = 1;
       int maximum = 100;
       int randomNumber = random.nextInt(maximum - minumum + 1) + minumum;


       //Print the Random Number
       System.out.println("Generated random number: " + randomNumber);

       //Create a Scanner object to read input from the user
       Scanner scanner = new Scanner(System.in);

       //Set the maximum number of attempts
       int maximumAttempts = 10;
       int attempts = 0;
       boolean guessedCorrectly = false;
       int userGuess = 0;
       

       // Loop to prompt the user to enter their guess until they guess correctly or run out of attempts
       while (attempts < maximumAttempts && !guessedCorrectly) {
        System.out.print("Enter your guess(between 1 and 100): ");
        int userGuess = scanner.nextInt();
        attempts++;
       
        //Compare the user's guess with the generated number and provide feedback
       if (userGuess == randomNumber) {
        System.out.println("Well done! You guessed the correct number.");
        guessedCorrectly = true;
       } else if (userGuess < randomNumber) {
        System.out.println("Your guess is too low.");
       } else {
        System.out.println("Your guess is too high.");
       }

       //Inform the user about the remaining attempts
       if (!guessedCorrectly) {
        System.out.println("You have " + (maximumAttempts - attempts) + " attempts left.");
       }
    }
       //If the user did not guess the number reveal the correct number
        if (!guessedCorrectly) {
            System.out.println("Oops, you've used all your attempts. The correct number is " + randomNumber + ".");
        }

       //Close the scanner
       scanner.close();
    }
}
