/*Write a program to print the name, salary and date of joining of 10 employees in a company.
Use array of objects.*/

import java.util.Scanner;

class Employee {
    String name;
    double salary;
    String dateOfJoining;

    public Employee(String name, double salary, String dateOfJoining) {
        this.name = name;
        this.salary = salary;
        this.dateOfJoining = dateOfJoining;
    }

    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Salary: $" + salary);
        System.out.println("Date of Joining: " + dateOfJoining);
        System.out.println();
    }
}

public class Q1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Employee[] employees = new Employee[10];

        for (int i = 0; i < 10; i++) {
            System.out.println("Enter details for Employee " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = scanner.nextLine();
            
            System.out.print("Salary: $");
            double salary = scanner.nextDouble();
            scanner.nextLine(); 
            
            System.out.print("Date of Joining: ");
            String dateOfJoining = scanner.nextLine();

            employees[i] = new Employee(name, salary, dateOfJoining);
        }

        System.out.println("\nDetails of Employees:");
        for (Employee employee : employees) {
            employee.displayInfo();
        }
    }
}
