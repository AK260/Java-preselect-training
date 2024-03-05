/*Write a program to convert Fahrenheit into Celsius. Input the value using scanner.
 */


import java.util.Scanner;
class Assignment06 {
    public static void main(String[] args) {
       	Scanner scanner = new Scanner(System.in);
	System.out.print("Enter temperature in Fahrenheit: ");
        double fahrenheit = scanner.nextDouble();
	double celsius = (fahrenheit - 32) * 5 / 9;
	System.out.println("Temperature in Celsius: " + celsius + " °C");

        
    }
}

