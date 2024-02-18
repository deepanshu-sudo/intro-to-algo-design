/**
 * Question: Check whether a given number is prime or not
 * 
 * Algorithm:
        Start the program.
        Prompt the user to enter a positive number greater than 1.
        Read and store the entered number.
        If the entered number is less than or equal to 1, return false (the number is not prime).
        Iterate from 2 to the square root of the entered number:
        a. Check if the entered number is divisible by the current iteration value.
        b. If it is divisible, return false (the number is not prime).
        If no divisor is found in the previous step, return true (the number is prime).
        End the program.

 * Pseudocode:
        1. Start
        2. Display "Enter a positive number greater than 1: "
        3. Read num
        4. If num <= 1, return false
        5. For i from 2 to the square root of num:
        a. If num is divisible by i, return false
        6. Return true
        7. End
        
 * Flowchart URL: https://mermaid.ink/svg/pako:eNpVUNFugkAQ_JXNJk00QZHDaqXapAo-Nqb6oAIPFznqJXBYPGIt8u89DpPiPu3M7O5MtsRDFjF0ME6yy-FIcwkb9zUQoOq946-lYsIu9HpvMPfNT0YjEEVqhveRuVYWpeJgOgOrauiFpm-bvGC3nW9-ZBJWOU-ZGT7oS5qc2c31uZDAYQbkLrta9soG1XU58oT9Qw5TOH-rrFlcx2mEu7fX8oZl6wbXs_BUW81g8LC0bC9tffMhbSN67fO7Buw02Hd8T0Rht-G2DYcGpixPKY_Uc3WKAOWRpSxAR7URi2mRyAADUalRWshsfRUHdKSKYGBxiqhkLqdfOU3RietHGXiiAp0Sf9AhL6P-eDiyJ5ZNBoTYEwOviu0riljEJmRMngfj0bAy8DfL1AVLb-91X1tUf7wcjL4
 */
import java.util.Scanner;

public class IsPrime {
    public static boolean isPrime(int num) {
        if(num <= 1)            return false;

        for(int i = 2; i <= Math.sqrt(num); i++) {
            if(num % i == 0)    return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive number >2: ");
        int num = sc.nextInt();
        System.out.println("The given number "+num+" is Prime?: "+isPrime(num));
    }
}