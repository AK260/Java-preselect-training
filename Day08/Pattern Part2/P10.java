/*

    1
   12
  123
 1234
12345
*/

public class P10 {
    public static void main(String[] args) {
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
                 for (int j = 1; j <= rows - i; j++) {
                System.out.print(" ");
            }
         
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
                   System.out.println();
        }
    }
}

