/*Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.
 */

import java.util.Scanner;
class Assignment04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
	System.out.print("Enter marks for Subject 1");
        int subject1Marks = scanner.nextInt();
	System.out.print("Enter marks for Subject 2");
        int subject2Marks = scanner.nextInt();
	System.out.print("Enter marks for Subject 3");
        int subject3Marks = scanner.nextInt();
	int totalMarks = subject1Marks + subject2Marks + subject3Marks;
	double percentageMarks = (double)totalMarks/300*100;
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage Marks: " + percentageMarks + "%");  
    }
}
