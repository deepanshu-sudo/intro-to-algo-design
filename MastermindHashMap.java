// Java program to implement the mastermind game algorithm with random secret code and multiple guesses
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class MastermindHashMap {

    // Method to provide the correct feedback for the mastermind game
    public static int[] feedback(String secret, String guess) {
        // Initialize two variables, sinks and hits, to store the number of sinks and hits respectively
        int sinks = 0;
        int hits = 0;
        // Initialize two hash maps, one for the secret code digits and one for the guess code digits
        HashMap<Character, Integer> secretMap = new HashMap<>();
        HashMap<Character, Integer> guessMap = new HashMap<>();
        // Loop through the digits of the secret code and the guess code, and compare them one by one
        for (int i = 0; i < secret.length(); i++) {
            // Get the characters at the current positions
            char s = secret.charAt(i);
            char g = guess.charAt(i);
            // If the characters are equal and in the same position, increment sinks by one
            if (s == g) {
                sinks++;
            } else {
                // If the characters are not equal, update the frequency of each character in the respective hash maps
                secretMap.put(s, secretMap.getOrDefault(s, 0) + 1);
                guessMap.put(g, guessMap.getOrDefault(g, 0) + 1);
            }
        }
        // Loop through the keys of the hash maps and check if any character is present in both maps
        for (char c : secretMap.keySet()) {
            if (guessMap.containsKey(c)) {
                // If there is a common character, increment hits by the minimum of the values of that character in the two maps
                hits += Math.min(secretMap.get(c), guessMap.get(c));
            }
        }
        // Return sinks and hits as an array
        return new int[]{sinks, hits};
    }

    // Method to generate a random secret code of four digits
    public static String generateSecret() {
        // Initialize an empty string to store the secret code
        String secret = "";
        // Define an array of digits from 0 to 9
        char[] digits = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        // Create a random object to generate random numbers
        Random random = new Random();
        // Loop until the secret code has four digits
        while (secret.length() < 4) {
            // Get a random index from 0 to 9
            int index = random.nextInt(10);
            // Get the digit at the random index
            char digit = digits[index];
            // If the digit is not already in the secret code, append it to the secret code
            if (secret.indexOf(digit) == -1) {
                secret += digit;
            }
        }
        // Return the secret code
        return secret;
    }

    // Main method to test the program
    public static void main(String[] args) {
        // Create a scanner object to take input from the user
        Scanner sc = new Scanner(System.in);
        // Generate a random secret code
        String secret = generateSecret();
        // Initialize a boolean variable to store the status of the game
        boolean win = false;
        // Initialize an integer variable to store the number of guesses
        int guesses = 0;
        // Loop until the user wins or quits
        while (!win) {
            // Prompt the user to enter a guess code or Q to quit
            System.out.print("Enter a guess code or Q to quit: ");
            // Read the input as a string
            String guess = sc.next();
            // If the input is Q, break the loop and end the game
            if (guess.equalsIgnoreCase("Q")) {
                break;
            }
            // Increment the number of guesses by one
            guesses++;
            // Call the method to provide the feedback and print the result
            int[] result = feedback(secret, guess);
            System.out.println("The feedback for the guess code is: ");
            System.out.println("Sinks: " + result[0]);
            System.out.println("Hits: " + result[1]);
            // If the number of sinks is four, the user has won the game
            if (result[0] == 4) {
                win = true;
                System.out.println("You have cracked the secret code in " + guesses + " guesses!");
            }
        }
        // Close the scanner object
        sc.close();
    }
}
