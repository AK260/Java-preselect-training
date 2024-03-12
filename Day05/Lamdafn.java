/*create a method that takes in 3 parameters,1.num,2.num,3.operator(+,-,*),
create a lamba fn that pass a num and operator and perform some operation.
*/

import java.util.function.BinaryOperator;

public class Lamdafn {

    public static void main(String[] args) {
       
        double resultAddition = performOperation(5, 3, (num1, num2) -> num1 + num2);
        double resultSubtraction = performOperation(5, 3, (num1, num2) -> num1 - num2);
        double resultMultiplication = performOperation(5, 3, (num1, num2) -> num1 * num2);

        System.out.println("Result Addition: " + resultAddition);
        System.out.println("Result Subtraction: " + resultSubtraction);
        System.out.println("Result Multiplication: " + resultMultiplication);
    }

   
    public static double performOperation(double num1, double num2, BinaryOperator<Double> operation) {
        return operation.apply(num1, num2);
    }
}
