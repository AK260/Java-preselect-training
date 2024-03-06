/*Initialize and print all elements of a 2D array.
*/

import java.util.Scanner;

public class Assignment06 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = sc.nextInt();
        int[][] twoDArray = new int[rows][columns];
        System.out.println("Enter elements of the 2D array:");
	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                twoDArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("2D Array:");
	for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
