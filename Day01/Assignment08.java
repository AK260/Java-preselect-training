/*Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/


import java.util.Scanner;
class Assignment08{
    public static void main(String[] args) {
       	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter a 5-digit number: ");
        int number = scanner.nextInt();
	int firstDigit = number / 10000;  
        int secondLastDigit = (number % 100) / 10;
	int sum = firstDigit + secondLastDigit;
	System.out.println("Sum of the first and second last digit: " + sum);
        }
}

