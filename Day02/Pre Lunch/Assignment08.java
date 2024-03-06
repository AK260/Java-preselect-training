/*A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.
*/

import java.util.Scanner;
class Assignment08{
	public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int i = 100; i <= 500; i++) {
            int originalNum = i;
            int sum = 0;

            int temp = i;
            while (temp > 0) {
                int digit = temp % 10;
                sum += Math.pow(digit, 3);
                temp /= 10;
            }

            if (originalNum == sum) {
                System.out.println(originalNum);
            }
        }
    }
}

