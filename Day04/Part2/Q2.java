/*Write a program to print the roll number and average marks of 8 students in three subjects (each out of 100). The marks are entered by user.*/


import java.util.Scanner;

class Student {
    int rollNumber;
    int[] marks = new int[3];

    public Student(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public void setMarks(int subjectIndex, int marks) {
        this.marks[subjectIndex] = marks;
    }

    public double calculateAverage() {
        int totalMarks = 0;
        for (int mark : marks) {
            totalMarks += mark;
        }
        return (double) totalMarks / marks.length;
    }
}

public class Q2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Student[] students = new Student[8];

        for (int i = 0; i < 8; i++) {
            System.out.println("Enter details for Student " + (i + 1) + ":");
            System.out.print("Roll Number: ");
            int rollNumber = scanner.nextInt();

            students[i] = new Student(rollNumber);

            for (int j = 0; j < 3; j++) {
                System.out.print("Enter marks for Subject " + (j + 1) + ": ");
                int marks = scanner.nextInt();
                students[i].setMarks(j, marks);
            }
        }

        System.out.println("\nRoll Number\tAverage Marks");
        for (Student student : students) {
            System.out.println(student.rollNumber + "\t\t" + student.calculateAverage());
        }
    }
}
