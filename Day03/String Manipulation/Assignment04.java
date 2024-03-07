/*Write a program to check if a given string is a Palindrome*/

import java.util.Scanner;

public class Assignment04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String clean = input.replaceAll("\\s", "").toLowerCase();
        int i = 0;
        int j = clean.length() - 1;
        boolean isPallendrome = true;
        while (i < j) {
            if (clean.charAt(i) != clean.charAt(j)) {
                isPallendrome = false;
                break;
            }
            i++;
            j--;
        }
        if (isPallendrome) {
            System.out.println("The string is a palindrome.");
        } else {
            System.out.println("The string is not a palindrome.");
        }
    }
}
