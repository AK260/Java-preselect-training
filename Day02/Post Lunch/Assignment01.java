/*Take 10 integer inputs from user and store them in an array and print them on screen.*/

import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[]numbers = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
        System.out.println("Elements are:");
	for (int i = 0; i < 10; i++) {
            System.out.println(numbers[i]);
        }
    }
}
