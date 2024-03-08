/*Write a program to print the area of a rectangle by creating a class named 'Area' taking the values of its length and breadth as parameters of its constructor and having a method named 'returnArea' which returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.*/

import java.util.Scanner;

class Area {
    double length, breadth;

    public Area(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    public double returnArea() {
        return length * breadth;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double length, breadth;

        System.out.print("Enter the length of the rectangle: ");
        length = scanner.nextDouble();

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = scanner.nextDouble();

        Area rectangle = new Area(length, breadth);
        double area = rectangle.returnArea();

        System.out.println("Area of the rectangle: " + area);
    }
}
