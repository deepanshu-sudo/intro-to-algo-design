import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MastermindGame {

    private static final int CODE_LENGTH = 4;

    private int[] secretCode;

    public MastermindGame() {
        secretCode = generateSecretCode();
    }

    public static void main(String[] args) {
        MastermindGame game = new MastermindGame();
        game.playGame();
    }

    private int[] generateSecretCode() {
        Random random = new Random();
        int[] code = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            code[i] = random.nextInt(10);
        }
        return code;
    }

    private void playGame() {
        System.out.println("Welcome to Mastermind!");
        System.out.println("Try to guess the 4-digit code.");

        Scanner scanner = new Scanner(System.in);
        int[] guess;

        do {
            guess = getGuessFromUser();
            int[] feedback = provideFeedback(guess);

            System.out.println("Sinks: " + feedback[0]);
            System.out.println("Hits: " + feedback[1]);
        } while (!isCorrectGuess(guess));

        System.out.println("Congratulations! You guessed the correct code.");
    }

    private int[] getGuessFromUser() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your 4-digit guess: ");
        String guessStr = scanner.nextLine();

        int[] guess = new int[CODE_LENGTH];
        for (int i = 0; i < CODE_LENGTH; i++) {
            guess[i] = Character.getNumericValue(guessStr.charAt(i));
        }

        return guess;
    }

    private int[] provideFeedback(int[] guess) {
        int[] feedback = new int[2];
        int[] secretCount = new int[10];
        int[] guessCount = new int[10];

        for (int i = 0; i < CODE_LENGTH; i++) {
            if (guess[i] == secretCode[i]) {
                feedback[0]++;
            } else {
                secretCount[secretCode[i]]++;
                guessCount[guess[i]]++;
            }
        }

        for (int i = 0; i < 10; i++) {
            feedback[1] += Math.min(secretCount[i], guessCount[i]);
        }

        return feedback;
    }

    private boolean isCorrectGuess(int[] guess) {
        return Arrays.equals(guess, secretCode);
    }
}
