/*Define two methods to print the maximum and the minimum number respectively among three numbers entered by user.
*/


import java.util.Scanner;

public class Assignment01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = sc.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = sc.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = sc.nextInt();
        printMaximum(num1, num2, num3);
        printMinimum(num1, num2, num3);
    }
    static void printMaximum(int a, int b, int c) {
        int max = Math.max(Math.max(a, b), c);
        System.out.println("Maximum number: " + max);
    }
    static void printMinimum(int a, int b, int c) {
        int min = Math.min(Math.min(a, b), c);
        System.out.println("Minimum number: " + min);
    }
}
