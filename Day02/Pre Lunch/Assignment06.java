/*Print the following patterns using loop :
1010101
10101 
101  
1   
*/

class Assignment06{
	 public static void main(String[] args) {
         int rows = 4;
	 for (int i = 0; i < rows; i++) {
            for (int j = 0; j < (rows - i) * 2 - 1; j++) {
                System.out.print((j % 2 == 0) ? "1" : "0");
            }
	    System.out.println();
        }
    }
}


