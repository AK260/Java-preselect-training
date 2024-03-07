/*Write a program that takes your full name as input and displays the abbreviations of the first and middle names except the last name which is displayed as it is. For example, if your name is Robert Brett Roser, then the output should be R.B.Roser.*/

import java.util.Scanner;

public class Assignment02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();
        String[] splitname = fullName.split("\\s+");
        if (splitname.length > 1) {
            for (int i = 0; i < splitname.length - 1; i++) {
                System.out.print(splitname[i].charAt(0) + ".");
            }
            System.out.println(splitname[splitname.length - 1]);
        } else {
            System.out.println(fullName);
        }
    }
}
