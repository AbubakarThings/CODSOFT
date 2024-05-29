
import java.util.Random;
import java.util.Scanner;

public class Numbergame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int minRange = 1;
        int maxRange = 100;
        int attempts = 10;
        int rounds = 0;
        int score = 0;

        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("You have " + attempts + " attempts to guess the number between " + minRange + " and " + maxRange + ".");

        boolean playAgain = true;
        while (playAgain) {
            int targetNumber = random.nextInt(maxRange - minRange + 1) + minRange;
            int currentAttempts = 0;
            boolean roundWon = false;

            System.out.println("\nRound " + (rounds + 1));
            while (currentAttempts < attempts) {
                System.out.print("Attempt " + (currentAttempts + 1) + ": Enter your guess: ");
                int userGuess = scanner.nextInt();

                if (userGuess < minRange || userGuess > maxRange) {
                    System.out.println("Please enter a number within the valid range.");
                    continue;
                }

                if (userGuess == targetNumber) {
                    System.out.println("Congratulations! You guessed the correct number: " + targetNumber);
                    roundWon = true;
                    score++;
                    break;
                } else if (userGuess < targetNumber) {
                    System.out.println("Try a higher number.");
                } else {
                    System.out.println("Try a lower number.");
                }

                currentAttempts++;
            }

            if (!roundWon) {
                System.out.println("Sorry, you've used all your attempts. The correct number was: " + targetNumber);
            }

            System.out.print("Do you want to play again? (yes/no): ");
            String playAgainResponse = scanner.next().toLowerCase();
            if (!playAgainResponse.equals("yes")) {
                playAgain = false;
            }

            rounds++;
        }

        System.out.println("Game Over!");
        System.out.println("You played " + rounds + " rounds and scored " + score + " points.");
        scanner.close();
    }
}