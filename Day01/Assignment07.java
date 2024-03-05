/*The total number of students in a class are 90 out of which 45 are boys. If 50% of the total students secured grade 'A' out of which 20 are boys, then write a program to calculate the total number of girls getting grade 'A'.*/


public class Assignment07 {
    public static void main(String[] args) {
        int totalStudents = 90;
        int boys = 45;
        double gradeAPercentage = 50.0;
        int boysWithGradeA = 20;
	double totalGradeAStudents = (gradeAPercentage / 100) * totalStudents;
	double girlsWithGradeA = totalGradeAStudents - boysWithGradeA;
	System.out.println("Total number of girls getting grade 'A': " + (int) girlsWithGradeA);
    }
}

