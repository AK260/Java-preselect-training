/*Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the value of roll_no as '2' and that of name as "John" by creating an object of the class Student. Assign and print the roll number, phone number and address of two students having names "Sam" and "John" respectively by creating two objects of class 'Student'.*/

class Student {
    String name;
    int roll_no;
    public Student(String name, int roll_no) {
        this.name = name;
        this.roll_no = roll_no;
    }
}

public class Q2{
    public static void main(String[] args) {
        Student student1 = new Student("John", 2);
        System.out.println("Details for Student 1:");
        System.out.println("Name: " + student1.name);
        System.out.println("Roll Number: " + student1.roll_no);
        System.out.println(); 
        Student student2 = new Student("Sam", 3);
        Student student3 = new Student("John", 4);
        System.out.println("Details for Student 2:");
        System.out.println("Name: " + student2.name);
        System.out.println("Roll Number: " + student2.roll_no);
        System.out.println();
        System.out.println("Details for Student 3:");
        System.out.println("Name: " + student3.name);
        System.out.println("Roll Number: " + student3.roll_no);
    }
}
