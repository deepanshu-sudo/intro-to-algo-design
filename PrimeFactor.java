    /*
 * Question:  Write an algorithm to compute all the prime factors of a given integer. Also write the pseudo code and draw flow chart.
 * 
 * Algorithm:
        1. Start
        2. Read the input number (num).
        3. Initialize a variable (factor) to 2.
        4. Print "Prime Factors are:".
        5. While num is divisible by 2 (num % 2 == 0), repeat steps 6-7.
        6. Print "2 ".
        7. Divide num by 2 (num = num / 2).
        8. Initialize a loop with a variable (j) starting from 3 up to the square root of num, incrementing by 2.
        9. While num is divisible by j (num % j == 0), repeat steps 10-11.
        10. Print "j ".
        11. Divide num by j (num = num / j).
        12. If num is greater than 1, print "num".
        13. End.
 * 
 * Pseudocode:
        Start
        Read num
        factor = 2
        Print "Prime Factors are:"
        While num % 2 == 0
            Print "2 "
            num = num / 2
        End While
        For j = 3 to sqrt(num) step 2
            While num % j == 0
                Print "j "
                num = num / j
            End While
        End For
        If num > 1
            Print num
        End If
        End

 * FlowChart URL: https://mermaid.ink/svg/pako:eNp9Um1L40AQ_ivDgKCQtDEx1g0XwZfWaqsc6qdLyrHXbOyWZFO3G7TW_vfb7raYIHcDIdmZZ54XsmucVhnDCF3XTYXiqmAR5FxkXLyAmjFYSF4yyOlUVZJ_UMUrAVUOFERd_mEyFWYxL6q36YxKBc_XqQBdF4fJk9KNyRG47jlcJt1HRrPtVndiEZdmcLW2p229zXjBvo4ae-BDHINnexv7ujJ7n8-yZp_QT7o_JRcKUvT1s-fuG8wg0RTQjcHftQdWssUzoMVSE90kc4gh2AFvzGz4b29z-BHD8lWq31qiZW9oVm__GwsONMG3YLctQ8NW06a9-0o7b6S9M5jRPu181x5ZJ01bO_Jxwx3PjaNzOG6ZGTd07_eyjb83bvI9HCZ9kU2O7OjejB7QwZLJkvJMXy8jmKK-USVLMdKfGctpXagUU7HRUFqr6mklphgpLelgvcioYtecvkhaYpRvdRxcUIHRGt8x8k9Jxw9JGAanvTPin_gOrjA6Jp0z4pHA6_W8MCBe2Ns4-FFVmsHrEFsnXkDCIAx9Q_fLDLeam786k9gd
 */

import java.util.Scanner;

public class PrimeFactor {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a Number: ");
        int num = sc.nextInt();

        System.out.println("Prime Factors are: ");

        //If the number is even, print how many times it will be divided by 2 and reduce it by /2
        while(num%2 == 0) {
            System.out.print("2 ");
            num /= 2;
        }

        //at this point the number is def off, so we run it from 3 by incrementing +2 until its sqrt as its the largest factor either way
        for(int j = 3; j <= Math.sqrt(num); j += 2) {
            //we keep checking if a number gets divided by any odd number and print its value
            while(num % j == 0) {
                System.out.print(j+" ");
                num /= j;
            }
        }

        //if the value of the num is still greater than 1, then it means its prime so we print the same as the last prime factor
        if(num > 1)     System.out.print(num);
    }
}