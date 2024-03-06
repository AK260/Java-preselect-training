/*Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.
*/

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
	int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;
        for (int i = 0; i < 20; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            int inputNumber = sc.nextInt();
            if (inputNumber > 0) {
                positiveCount++;
            } else if (inputNumber < 0) {
                negativeCount++;
            }
            if (inputNumber % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
            if (inputNumber == 0) {
                zeroCount++;
            }
        }
        System.out.println("Number of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of 0s: " + zeroCount);
    }
}
