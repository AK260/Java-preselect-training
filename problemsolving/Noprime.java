/*Get two integer inputs from user representing the number of rows and columns and create two dimensional arrays for 2d-array with no duplicate values(Get inputs from the user for populating the array):*/

import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class NoDuplicate {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        populateArray(array);
        System.out.println("2D Array with Unique Values:");
        printArray(array);
    }
    public static void populateArray(int[][] array) {
        Set<Integer> uniqueValues = new HashSet<>();
        Scanner scanner = new Scanner(System.in);
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                int value;

                do {
                   
                    System.out.print("Enter a unique value for position (" + row + ", " + col + "): ");
                    value = scanner.nextInt();
                } while (!uniqueValues.add(value));

                array[row][col] = value;
            }
        }
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}
