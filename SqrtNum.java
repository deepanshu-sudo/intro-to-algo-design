import java.util.Scanner;

/*
Question:  Write an algorithm to find the square root of a given number. Also write the pseudo code and draw 
flow chart.

Answer: 
Algorithm - Using Babylon Method of Finding Square Root

Step 1: Start with a positive number for which you want to find the square root.
Step 2: Initialize two variables, g1 and g2, with arbitrary positive values (e.g., g1 = number and g2 = 1.0).
Step 3: Set a small positive value for e (e.g., 0.00001) to determine the desired level of accuracy.
Step 4: Repeat the following steps until the absolute difference between g1 and g2 is less than e:
a. Update g1 with the current value of g2.
b. Update g2 with the average of g1 and number/g1.
Step 5: When the loop ends, g2 will be a good approximation of the square root of the input number.
Step 6: Output the value of g2 as the square root of the original number.

Pseudocode - Using Babylon Method of Finding Square Root

function findSquareRoot(number):
    # Initialize the variables
    g1 = number
    g2 = 1.0
    e = 0.00001  # Desired level of accuracy
    countIter = 0

    # Repeat until the absolute difference is less than e
    while absolute(g1 - g2) > e:
        g1 = g2
        g2 = (g1 + number / g1) / 2
        countIter = countIter + 1

    # g2 is a good approximation of the square root
    return g2

FlowChart URL: https://mermaid.ink/svg/pako:eNplUdtugkAQ_ZXNPGnKXS5CU5Mq1T420aZJwYdVFiWBxS5LelH-vbuAlaTzxJw5e86Z4Qz7MiEQQJqXn_sjZhxtwvuYIlGPo2jNBbIdI1WdoXmkrwhHtC70bc-Yt4NF1HWyDjWpKhM9SJrSdZboTM24cQhjJROgoRmiTAVlnDDMs5JWEu2IV4tFaxGeb8_fjllOEN5VqEz_Gau9520w6_w6oOlVw1b1smE1uaDlML_Mfhg8fz0lmBMBSdxEd3KxHWFIl52OBsxr4mWXeOh0WeK8Ek6rSH9hGeV9Wr2_D65Q9SEu_3fXVSvxPIqeaLIdCxAUKAgrcJaIX9XeIgZ-JAWJIRCfCUlxnfMYYtoIKq55uf6mewi4WFCBut0hzPCB4QKCVIZR4IQpBGf4gsB0Tc22TcdwJ1Pb9SzHUeAbAtX0NN_yLH_q2J7rOm6jwE9ZCgVD87uyjYnvTBzHauXe26H0bH4BxMSknw

 */

public class SqrtNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number to find its Square Root: ");
        double number = sc.nextDouble();

        double g1 = 1.0;
        double g2 = number/2;

        double e = 0.00001;
        int countIter = 0;

        while(Math.abs(g1 - g2) > e) {
            g1 = g2;
            g2 = ((g1 + (number/g1)))/2;
            countIter++;
        }

        System.out.println("The square root of "+number+" is : "+g2+" with "+countIter+" iterations.");
    }
}