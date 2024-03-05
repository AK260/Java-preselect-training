/*Write a program to calculate the area and perimeter of the rectangle. Input Length and breadth using command line arguments*/

class Assignment01{
	public static void main(String[] args){
		double length = Double.parseDouble(args[0]);
        	double breath = Double.parseDouble(args[1]);
		double area=length*breath;
		double perimeter=2*(length+breath);
		System.out.println("Area of the rectangle is "+area);
		System.out.println("Perimeter of the rectangle is "+perimeter);
}
}