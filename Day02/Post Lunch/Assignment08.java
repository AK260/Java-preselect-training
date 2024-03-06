/*Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest
*/

import java.util.Scanner;

public class Assignment08{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();
        int[] array = new int[size];
	for (int i = 0; i < size; i++) {
            System.out.print("Enter element " + (i + 1) + ": ");
            array[i] = sc.nextInt();
        }
        int maxDiffIndex1 = 0;
        int maxDiffIndex2 = 1;
        int minDiffIndex1 = 0;
        int minDiffIndex2 = 1;
        for (int i = 1; i < size; i++) {
            if (array[i] > array[maxDiffIndex2]) {
                maxDiffIndex1 = maxDiffIndex2;
                maxDiffIndex2 = i;
            } else if (array[i] < array[minDiffIndex2]) {
                minDiffIndex1 = minDiffIndex2;
                minDiffIndex2 = i;
            }
        }
        int maxDifference = array[maxDiffIndex2] - array[maxDiffIndex1];
        int minDifference = array[minDiffIndex2] - array[minDiffIndex1];
        System.out.println("Pair with maximum difference: (" + array[maxDiffIndex1] + ", " + array[maxDiffIndex2] + ")");
        System.out.println("Maximum Difference: " + maxDifference);

        System.out.println("Pair with minimum difference: (" + array[minDiffIndex1] + ", " + array[minDiffIndex2] + ")");
        System.out.println("Minimum Difference: " + minDifference);
    }
}
