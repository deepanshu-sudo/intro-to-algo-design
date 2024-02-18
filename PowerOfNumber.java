/**
 * Question: Find Power of a number given base and exponent
 * 
 * Algorithm:
        Start the program.
        Prompt the user to enter the base and exponent values.
        Calculate the power of the number using a divide-and-conquer approach:
        a. If the exponent is 0, return 1.
        b. Calculate halfPower by recursively calculating the power of the base with half of the exponent.
        c. If the exponent is even, return halfPower * halfPower.
        d. If the exponent is positive and odd, return base * halfPower * halfPower.
        e. If the exponent is negative and odd, return (halfPower * halfPower) / base.
        Display the result.
        End the program.
 * 
 * Pseudocode:
        Start the program.
        Prompt the user to enter the base and exponent values.
        Calculate the power of the number using a divide-and-conquer approach:
        a. If the exponent is 0, return 1.
        b. Calculate halfPower by recursively calculating the power of the base with half of the exponent.
        c. If the exponent is even, return halfPower * halfPower.
        d. If the exponent is positive and odd, return base * halfPower * halfPower.
        e. If the exponent is negative and odd, return (halfPower * halfPower) / base.
        Display the result.
        End the program.
 * 
 * Flowchart URL: https://mermaid.ink/svg/pako:eNqNkltP4zAQhf-KNU8tSotza0lWrASUllJo0cLTbvbB20xppNaOEqdc2v53bFM2sQQSfrI8Z853bM8W5iJFiGGxEk_zJSskeRj8SDg5rLPWnwTupTpP4G-bdDo_ybk6GfO8kuQfK5EwnhJ8zgVHrjV167lRXyj1sOJzmQkek1w8YdHSfc7_prbVdWG6BtuPKjk9JXRf1wemvnsoKtxdKu9fKKuCE7dLLZuDbMhWJe6G-g4oyZKtFnc6AZHi0yjkmHh2nKHxGdVxspLgBnkj0aiR6KpOVMOO6r3lPWpmHFuIXJSZzDbvryvStIEbN3DXNc78xdE3qOMmdWJROT6yL6iTBvWmprY-5bXVO-o8FnfS5N4qi0sF-ZgMS3lrlFMlmVVSz1mBZbWyh2tqNLPWweeuEI8FW-sZTTg4sMZizbJUzfVW9yQgl7hWeWK1TXHBjF3C90rKKinuX_gcYqku50CVp0ziIGPaEOKFzutAzjjEW3iG2HPdbkD7XkCjyHe9fuTAC8SdoNtzqUtD6vt-EAWuv3fgVQjl4HU996RH-xH1Qq93Eoahsfttipq5fwNpqA61
 */

import java.util.Scanner;

public class PowerOfNumber {
    public static double power(double base, int exponent) {
        if (exponent == 0) return 1.0;

        double halfPower = power(base, exponent / 2);
        if (exponent % 2 == 0) return halfPower * halfPower;
        else {
            if (exponent > 0) return base * halfPower * halfPower;
            else return (halfPower * halfPower) / base;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the base: ");
        double base = sc.nextDouble();

        System.out.print("Enter the exponent: ");
        int exponent = sc.nextInt(); // Change int to double

        double result = power(base, exponent);

        System.out.println(base + " raised to the power of " + exponent + " is: " + result);
    }
}
