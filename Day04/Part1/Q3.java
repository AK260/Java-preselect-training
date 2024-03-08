/*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by creating a class named 'Triangle' with constructor having the three sides as its parameters.*/


class Triangle {
    double side1;
    double side2;
    double side3;

    public Triangle(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }

    public double calculateArea() {
        double s = (side1 + side2 + side3) / 2;
        return Math.sqrt(s * (s - side1) * (s - side2) * (s - side3));
    }

    public double calculatePerimeter() {
        return side1 + side2 + side3;
    }
}

public class Q3{
    public static void main(String[] args) {
        Triangle triangle = new Triangle(3, 4, 5);
        double area = triangle.calculateArea();
        System.out.println("Area of the triangle: " + area);
        double perimeter = triangle.calculatePerimeter();
        System.out.println("Perimeter of the triangle: " + perimeter);
    }
}
