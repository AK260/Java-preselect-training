/*Write a program to calculate the perimeter of a triangle. Input the sides of triangle using command Line arguments*/

class Assignment02{
	public static void main(String[] args){
		double side1 = Double.parseDouble(args[0]);
        	double side2 = Double.parseDouble(args[1]);
		double side3 = Double.parseDouble(args[1]);
		double perimeter=side1+side2+side3;
		System.out.println("Perimeter of the traingle is "+perimeter);
}
}