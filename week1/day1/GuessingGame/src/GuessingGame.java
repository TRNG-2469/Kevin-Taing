import java.util.Scanner;

public class GuessingGame {
    void main() {
        int targetNumber = (int) (Math.random() * 50) + 1;
        int maxAttempts = 5;
        int attemptCount = 0;
        boolean hasGuessedCorrectly = false;
        Scanner scanner = new Scanner(System.in);

        while(attemptCount < maxAttempts && !hasGuessedCorrectly) {
            attemptCount++;
            System.out.print("Attempt [" + attemptCount + "/5] - Enter your guess: ");
            int guess = scanner.nextInt();
            if(guess < 1 || guess > 50) {
                System.out.println("Invalid input (1-50). Try Again.");
                attemptCount--;
                continue;
            } else if(guess == targetNumber) {
                hasGuessedCorrectly = true;
                break;
            } else if (guess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Too high! Try again.");
            }
        }

        scanner.close();

        if(hasGuessedCorrectly) {
            System.out.println("Congratulations! You guessed the secret number!");
        } else {
            System.out.println("Game over! You've run out of attempts. The secret number was " + targetNumber + ".");
        }
    }
}
