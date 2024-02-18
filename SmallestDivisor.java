/**
 * Algorithm:
 * Step 1: Start with a number you want to find the smallest divisor of
 * Step 2: Start a loop from 2 to Square Root of that Number
 * Step 3: Check whether any number between the given range completely divides the number
 * Step 4: If there is a number found in step 3, print the number and break the loop
 * Step 5: If there is not a number found in step 3, print that the number is prime
 * 
 * Pseudocode:
        Start
        Read num
        i = 2
        While i * i <= num
            If num % i == 0
                Print "Smallest Divisor of num is: i"
                Stop
            End If
            i = i + 1
        End While
        Print "The given number num is prime."
        Stop
 * 
 * FlowChart URL: https://mermaid.ink/svg/pako:eNpdkGtrwjAUhv9KODDQUbWtvdiyDqb1BmMMFAZr_ZDZOMPSRtp0m9b-98VYx1wgkJzn4T0nqWDNEwI-bBj_Wm9xLtAyjDMk10MrWghZWLVRp3OPhlFvSgR6KtM3kvdWZ2eo0CiaZ1RQzOiBIBoEZkNHiobVy5YyCdCt3HdBE1GfnVA5x2VekiMaV2eGbqQZBEhvpPFfaRr1nnOaCbRIMWOkECikn7Tgv0NNlT2LhjnBH-iR810DZgrMW9E4S1btq-gJZoXMDq-GaoqTS8NmOFogeU_Jpd_kXyxokJI8xTSR_1qdnBjElqQkBl8eE7LBJRMxxFktVVwKvthna_CFfJ4G5S7BgoQUv-c4BX9zmkGDHc7Ar-AbfNvrdweePvA8y9I93TQ02IPfMfp613Ns0zU8S7cc1zZrDQ6cywiza-pqWa4z6LuGo-JeFTv1rH8AL5aXBg
 */

import java.util.Scanner;

public class SmallestDivisor {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter a number: ");
            int num = sc.nextInt();

            for(int i = 2; i <= Math.sqrt(num); i++) {
                if(num % i == 0) {
                    System.out.println("Smallest Divisor of "+num+" is: "+i);
                    return;
                }
            }

            System.out.println("The given number "+num+" is prime.");
        }
}
