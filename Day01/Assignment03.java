/*Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/

class Assignment03{
	public static void main(String[] args){
		int number = 2345;
        	int result1 = number+8;
        	int result2 = result1/3;
        	int result3 = result2%5;
        	int finalResult = result3*5;
        	System.out.println("Final Result: " + finalResult);
    }
}