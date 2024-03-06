/*Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers
*/

import java.util.Scanner;
class Assignment07{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
	System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
	int min = (num1 < num2) ? num1 : num2;
	int gcd = 1;
	for (int i = 2; i <= min; i++) {

            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }
	System.out.println("Greatest Common Divisor (GCD): " + gcd);
    }
}

