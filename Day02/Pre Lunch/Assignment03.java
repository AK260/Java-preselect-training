/*A student will not be allowed to sit in exam if his/her attendence is less than 75%.
Take following input from user
Number of classes held
Number of classes attended.
And print
percentage of class attended
Is student is allowed to sit in exam or not.
allow student to sit if he/she has medical cause. Ask user if he/she has medical cause or not ( 'Y' or 'N' ) and print accordingly.*/


import java.util.Scanner;
class Assignment03{
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter the number of classes held");
        int classesHeld = sc.nextInt();
	System.out.print("Enter the number of classes attended");
        int classesAttended = sc.nextInt();
	double attendancePercentage = (double) classesAttended / classesHeld * 100;
	System.out.println("Percentage of classes attended: " + attendancePercentage + "%");
	if (attendancePercentage >= 75) {
            System.out.println("You are allowed to sit in the exam.");
        } 
	else {
            System.out.print("Do you have a medical cause? (Enter 'Y' for Yes, 'N' for No): ");
            char medicalCause = sc.next().charAt(0);

            if (medicalCause == 'Y' || medicalCause == 'y') {
                System.out.println("You are allowed to sit in the exam due to a medical cause.");
            } else {
                System.out.println("You are not allowed to sit in the exam due to low attendance.");
            }
        }

    }
}

		