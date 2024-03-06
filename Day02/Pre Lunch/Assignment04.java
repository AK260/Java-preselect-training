/*Take 10 integers from keyboard using loop and print their average value on the screen.*/


import java.util.Scanner;
class Assignment04{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	double sum = 0;
	for (int i = 1; i <= 10; i++) {
            System.out.print("Enter the integer " + i + ": ");
            int currentNumber = sc.nextInt();
            sum += currentNumber;
        }
	double average = sum / 10;
        System.out.println("Average value: " + average);

    }
}

		