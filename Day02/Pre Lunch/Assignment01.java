/*Take values of length and breadth of a rectangle from user and check if it is square or not.*/
import java.util.Scanner;
class Assignment01{
	public static void main(String []args){
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the length");
		double length=sc.nextDouble();
		System.out.println("enter the breadth");
		double breadth=sc.nextDouble();
		if (length == breadth) {
            		System.out.println("It is a square.");
        	} 
		else
		{
            		System.out.println("It is not a square.");
        	}
}
}
		