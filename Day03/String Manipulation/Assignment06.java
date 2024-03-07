/*Write down the names of 10 of your friends in an array and then sort those in alphabetically ascending order.(HINT : USE the compareTo method of String)

*/

import java.util.Arrays;
import java.util.Scanner;

public class Assignment06{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] friends = new String[10];
        for (int i = 0; i < 10; i++) {
            System.out.print("Enter name of friend " + (i + 1) + ": ");
            friends[i] = sc.nextLine();
        }
        Arrays.sort(friends);
        System.out.println("\nSorted friends names in alphabetical order:");
        for (String friend : friends) {
            System.out.println(friend);
        }
    }
}
