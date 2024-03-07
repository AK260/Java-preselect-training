/*Print the multiplication table of 15 using recursion.
*/


public class Assignment03 {
    public static void main(String[] args) {
        int m = 15;
        System.out.println("Multiplication table of " + m + ":");
        printTable(m, 1);
    }
    static void printTable(int m, int n) {
        if (n <= 10) {
            int result = m * n;
            System.out.println(m + " * " + n + " = " + result);
            printTable(m, n + 1);
        }
    }
}
