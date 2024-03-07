/*Write a program to find the number of vowels, consonents, digits and white space characters in a string.*/

import java.util.Scanner;

public class Assignment03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();
        int vowels = 0;
        int consonants = 0;
        int digits = 0;
        int whiteSpaces = 0;
        inputString = inputString.toLowerCase();
        for (int i = 0; i < inputString.length(); i++) {
            char currentChar = inputString.charAt(i);

            if (Character.isLetter(currentChar)) {
                if ("aeiou".indexOf(currentChar) != -1) {
                    vowels++;
                } else {
                    consonants++;
                }
            } else if (Character.isDigit(currentChar)) {
                digits++;
            } else if (Character.isWhitespace(currentChar)) {
                whiteSpaces++;
            }
        }
        System.out.println("Number of vowels: " + vowels);
        System.out.println("Number of consonants: " + consonants);
        System.out.println("Number of digits: " + digits);
        System.out.println("Number of white spaces: " + whiteSpaces);
    }
}
