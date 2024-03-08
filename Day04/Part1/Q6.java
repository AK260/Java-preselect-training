/*Write a program that would print the information (name, year of joining, salary, address) of three employees by creating a class named 'Employee'. The output should be as follows:
Name        Year of joining        Address
Robert            1994                64C- WallsStreet
Sam                2000                68D- WallsStreet
John                1999                26B- WallsStreet*/

class Employee {
    String name;
    int yearOfJoining;
    String address;

    public Employee(String name, int yearOfJoining, String address) {
        this.name = name;
        this.yearOfJoining = yearOfJoining;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name\t\tYear of Joining\tAddress");
        System.out.println(name + "\t\t" + yearOfJoining + "\t\t" + address);
    }
}

public class Q6 {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Robert", 1994, "64C- WallsStreet");
        Employee employee2 = new Employee("Sam", 2000, "68D- WallsStreet");
        Employee employee3 = new Employee("John", 1999, "26B- WallsStreet");

        System.out.println("Name\t\tYear of Joining\tAddress");
        employee1.displayInfo();
        employee2.displayInfo();
        employee3.displayInfo();
    }
}
