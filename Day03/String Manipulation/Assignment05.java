/*Input a string which contains some palindrome substrings. Find out the position of palindrome substrings if exist and replace it by *. (For example if input string is “bob has a radar plane” then it should convert in “*** has a ***** plane”.
*/

import java.util.Scanner;

public class Assignment05 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        String[] words = inputString.split("\\s+");
        for (String word : words) {
            if (isPalindrome(word)) {
                System.out.print("*".repeat(word.length()) + " ");
            } else {
                System.out.print(word + " ");
            }
        }
    }
    private static boolean isPalindrome(String str) {
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left++) != str.charAt(right--)) {
                return false;
            }
        }
        return true; 
    }
}
