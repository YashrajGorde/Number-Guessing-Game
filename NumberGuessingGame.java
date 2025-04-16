import java.util.Scanner;
import java.util.Random;

public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int lowerBound = 1;
        int upperBound = 100;
        int numberToGuess = random.nextInt(upperBound - lowerBound + 1) + lowerBound;
        int numberOfTries = 0;
        boolean guessedCorrectly = false;

        System.out.println("🎯 Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between " + lowerBound + " and " + upperBound + ". Can you guess it?");

        while (!guessedCorrectly) {
            System.out.print("Enter your guess: ");

            // Check if input is a valid integer
            if (!scanner.hasNextInt()) {
                System.out.println("That's not a valid number. Try again.");
                scanner.next(); // clear invalid input
                continue;
            }

            int guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low! 🔽");
            } else if (guess > numberToGuess) {
                System.out.println("Too high! 🔼");
            } else {
                guessedCorrectly = true;
                System.out.println("🎉 Correct! You guessed the number in " + numberOfTries + " tries.");
            }
        }

        scanner.close();
    }
}

