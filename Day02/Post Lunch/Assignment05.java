/*Write a program to find the sum and product of all elements of an array.
*/

import java.util.Scanner;

public class Assignment05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        int product = 1;
        for (int num : array) {
            product *= num;
        }
        System.out.println("Sum of all elements: " + sum);
        System.out.println("Product of all elements: " + product);
    }
}
