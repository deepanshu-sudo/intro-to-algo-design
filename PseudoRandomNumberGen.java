/**
 * Question: Write a program/algorithm to generate Pseudo Random Numbers
 * 
 * Approach: The linear congruential method is a way of generating a sequence of numbers that appear to be random, but are actually determined by a mathematical formula. The formula is:
 * 
 * Xn+1 = (aXn + c) mod m
 * 
 * where Xn is the nth number in the sequence, Xn+1 is the next number, a is multiplier and c is increment, and m is the modulus. The modulus is a positive number that defines the range of the possible values in the sequence. The first number in the sequence, X0, is called the seed.
 * 
 * Choosing Numbers Guidelines:
To choose the values for mod, multiplier, increment and seed, you can follow these guidelines:
- Mod: Choose a large prime number that covers the desired range of values. For example, 2^31 - 1 = 2147483647 is a common choice.
- Multiplier: Choose a number that is relatively prime to mod, meaning they have no common factors other than 1. For example, 16807 is a common choice.
- Increment: Choose a number that is coprime to mod, meaning they have no common factors other than 1. For example, 0 or 1 are common choices.
- Seed: Choose any number between 0 and mod - 1. For example, you can use the current time or a user input as the seed.

 * Algorithm:
        Start the program.
        Initialize the seed state as seed.
        Initialize an array randomNums to store random numbers.
        Set randomNums[0] to the value of the initial seed.
        Set i to 1, representing the current position in the array.
        Use a loop to generate noOfRandomNums random numbers.
        a. Calculate the next random number using the linear congruential method: randomNums[i] = ((randomNums[i-1] * multiplier) + increment) % modulus.
        b. Increment i.
        Repeat step 6 until i reaches noOfRandomNums.
        End the program.

 * Pseudocode:
        1. Procedure linearCongruentialMethod(seed, modulus, multiplier, increment, randomNums, noOfRandomNums)
        2.     Set randomNums[0] to the value of the initial seed
        3.     Set i to 1
        4.     While i < noOfRandomNums do
        5.         randomNums[i] = ((randomNums[i-1] * multiplier) + increment) % modulus
        6.         Increment i
        7.     End While
        8. End Procedure
 * 
 * Flowchart URL: https://mermaid.ink/svg/pako:eNpdUV1v2zAM_CsCnzrALezESWxvGLB8FRm6rWgKDJidB82WEwGyFMgS2jTJfx8le1lWPVG84_FIHqFUFYMMaqFeyh3VhjxPPxaS4Ptyk68NZjYfyO3tZzLNV5IbTgV_Y6RlrApIoyorbIuBFYbvBWc6IFyWmjVMmoBQWRGpftRPGKjmu23aTSc99YqzvIArTSoJ1ZoeiL7Qc1etr6qhF5h5gTkKrJm5Lgg3xChv78Kde-6i53KHRxdw4cHlsYDu797Ljgv278vJp3dTdFgB5y5Yeo3Ts7bsdJ__VZpRUVpBDbu2xzfEtlxuycPsG6mVxsXRjn5ZG_b7fUCHfY_e533n87-GSypadlrlC1zzT-e55648_NXnH7Xaatr0SCEhgIbphvIKj3502QLMDhsXkGFYsZriLd0MZ6RSa9T6IEvIDA4XgN1XONCcU6cJWe0MBLCnErIjvEIWxendeBgn6TiMxqMkSYcBHCCbJHfRII6SOJyESZxMhucA3pRChRDpaRyFgzgNB1EyiiMv98uDruf5DxYgzU4
 */
import java.util.Scanner;

public class PseudoRandomNumberGen {
    public static void linearCongruentialMethod(int seed, int modulus, int multiplier, int increment, int[] randomNums, int noOfRandomNums) {
        // Initialize the seed state
        randomNums[0] = seed;

        // Traverse to generate required numbers of random numbers
        for(int i = 1; i < noOfRandomNums; i++)
            //Follow the linear congruential method
            randomNums[i] = ((randomNums[i-1] * multiplier) + increment) % modulus;
    }

    //Driver Code
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Seed Value: ");
        int seed = sc.nextInt();

        System.out.print("Enter Modulus Parameter: ");
        int modulus = sc.nextInt();

        System.out.print("Enter Multiplier: ");
        int multiplier = sc.nextInt();

        System.out.print("Enter Increment: ");
        int increment = sc.nextInt();

        System.out.print("Enter No. of Random Numbers to generate: ");
        int noOfRandomNums = sc.nextInt();

        int[] randomNums = new int[noOfRandomNums];

        linearCongruentialMethod(seed, modulus, multiplier, increment, randomNums, noOfRandomNums);

        for(int i = 0; i < noOfRandomNums; i++)
            System.out.print(randomNums[i]+" ");
    }
}
