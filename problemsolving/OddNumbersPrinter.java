/*Print all the Odd numbers of a 2d integer array Using Loop*/

public class OddNumbersPrinter {

    public static void main(String[] args) {
        int[][] array = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12}
           
        };

        System.out.println("Odd Numbers in the 2D array:");
        printOddNumbers(array);
    }

    public static void printOddNumbers(int[][] array) {
        for (int row = 0; row < array.length; row++) {
            for (int col = 0; col < array[row].length; col++) {
                if (array[row][col] % 2 != 0) {
                    System.out.print(array[row][col] + " ");
                }
            }
        }
    }
}
