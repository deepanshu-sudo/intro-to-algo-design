/*
 * Question: 
 *  Given two positive non-zero integers n and m, write an algorithm for finding their greatest common devisor (gcd). Also write the Pseudo code and draw the flow chart
 * 
 * Answer: 
 * Algorithm:
 *  Step 1: Input two positive integers, num1 and num2.
    Step 2: While num2 is not equal to 0:
    a. Set temp to num2.
    b. Update num2 to the remainder of num1 divided by num2.
    c. Update num1 to temp.

    Step 3: When the loop ends, num1 will contain the GCD of the two input numbers.
    Step 4: Output the value of num1 as the GCD.
 * 
 * PseudoCode:
 *  Input: num1 (a positive integer), num2 (a positive integer)
    Output: GCD (the Greatest Common Divisor of num1 and num2)

    WHILE num2 is not equal to 0 DO
        temp = num2
        num2 = num1 % num2
        num1 = temp
    END WHILE

    GCD = num1  // The final value of num1 is the GCD

    Output GCD  // Output the GCD

 * FlowChart URL:
 * https://mermaid.ink/svg/pako:eNplUF1rwjAU_St3FwYKVZOudTbgYLbq60BBWOtDsHEW2lRqyuZq__vysTHG7kM-zjn3npN0eKhzgQyPZf1-OPFGwTbJJOh6HqQbpYH9EEajJ1ikk7VQINuKemb1J3unW1g67nanohQOMjTczYH07h5byW3btOIGSepAU0pUZ5hb_S9ouy1I4f4_RzVn-hz4HSKxDhD_8Vvx8qINl-nkpSmkyw78Aus4gZ_0SytdDdKlzPdD9LASTcWLXH9JZxQZqpOoRIZMH3Nx5G2pMsxkr6W8VfXmKg_IlH6Zh-0550okBX9reIXsaOw9PHOJrMMPZDSKxjQIomnw8BjO9BZ6eEUWjgNCQkoDSgihxPd7Dz_rWk8g48jVLIwonfqzqR33aknj2X8BnYF9Gw
 * 
 * Example Working:
*   //num1 = 60, num2 = 24
    //temp = 24, num2 = 12, num1 = 24
    //temp = 12, num2 = 0, num1 = 12
    //return num1 as gcd

    //num1 = 24, num2 = 60
    //temp = 60, num2 = 24, num1 = 60
    //temp = 24, num2 = 12, num1 = 24
    //temp = 12, num2 = 0, num1 = 12
    //return num1 as gcd
 */

import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Number #1: ");
        int num1 = sc.nextInt();

        System.out.print("Enter Number #2: ");
        int num2 = sc.nextInt();

        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
        }

        System.out.println("The GCD is: " + num1);
    }
}

