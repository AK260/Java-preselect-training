/*Write a program to print the area of a rectangle by creating a class named 'Area' having two methods. First method named as 'setDim' takes length and breadth of rectangle as parameters and the second method named as 'getArea' returns the area of the rectangle. Length and breadth of rectangle are entered through keyboard.
*/

import java.util.Scanner;

class Area {
    double length;
    double breadth;
    void setDim(double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double getArea() {
        return length * breadth;
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Area rectangle = new Area();
        System.out.print("Enter the length of the rectangle: ");
        double length = scanner.nextDouble();
        System.out.print("Enter the breadth of the rectangle: ");
        double breadth = scanner.nextDouble();
        rectangle.setDim(length, breadth);
        double area = rectangle.getArea();
        System.out.println("Area of the rectangle: " + area);
    }
}
