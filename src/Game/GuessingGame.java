package Game;
/*
* By Samkelisiwe Maphumulo
*/
import java.util.Scanner;
import java.util.Random;

public class GuessingGame {

    public static void main(String[] args) {
        // Initialize Scanner and Random objects
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Generate a random number between 1 and 100 (inclusive) as the secret number
        int secretNumber = random.nextInt(100) + 1;
        // Initialize variables to store user's guess and the number of attempts
        int guess;
        int attempt = 0;

        // Flag to track whether the correct number has been guessed
        boolean correctGuess = false;

        // Display welcome message
        System.out.println("Welcome to the Guessing Game!  ");
        System.out.println("I'm thinking of a number 1 to 100. Can you guess it?   ");

        // Main game loop
        while (!correctGuess) {
            // Prompt user to enter their guess
            System.out.print("Enter your guess: ");
            // Read user input
            guess = scanner.nextInt();
            // Increment the attempt counter
            attempt++;

            // Check if the guess is correct
            if (guess == secretNumber) {
                // Set flag to true as the correct number has been guessed
                correctGuess = true;
                // Display congratulatory message
                System.out.println("Congratulations! You've guessed the number in " + attempt + " attempt(s).");
            } // If the guess is too low, provide feedback
            else if (guess < secretNumber) {
                System.out.println("Too low. Try again!");
            } // If the guess is too high, provide feedback
            else {
                System.out.println("Too high. Try again!");
            }
        }
        // Close scanner to prevent resource leak
        scanner.close();
    }
}
