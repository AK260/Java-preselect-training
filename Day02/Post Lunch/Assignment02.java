/*Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
       	Scanner sc = new Scanner(System.in);
	int[] numbers = new int[10];
	for (int i = 0; i < 10; i++) {
            System.out.print("Enter integer " + (i + 1) + ": ");
            numbers[i] = sc.nextInt();
        }
	System.out.print("Enter a number to be searched: ");
        int searchNumber = sc.nextInt();
	int i;
        for (i = 0; i < 10; i++) {
            if (numbers[i] == searchNumber) {
                break;
            }
        }
	if (i < 10) {
            System.out.println(searchNumber + " is present in the array.");
        } else {
            System.out.println(searchNumber + " is not present in the array.");
        }
    }
}
