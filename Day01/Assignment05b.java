/*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
a - first program by using a third variable
b - second program without using any third variable
 */


class Assignment05b {
    public static void main(String[] args) {
        int a = 6;
        int b = 8;
        System.out.println("Original values: a = " + a + ", b = " + b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("Values after swapping: a = " + a + ", b = " + b);
    }
}

