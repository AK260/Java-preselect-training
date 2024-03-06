/*Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.
*/

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] originalArray = new int[10];
        int[] reversedArray = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            originalArray[i] = sc.nextInt();
        }
        for (int i = 0; i < 10; i++) {
            reversedArray[i] = originalArray[9 - i];
        }

        System.out.println("Original array:");
        for (int num : originalArray) {
            System.out.print(num + " ");
        }
        System.out.println("\nReversed array:");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
    }
}
