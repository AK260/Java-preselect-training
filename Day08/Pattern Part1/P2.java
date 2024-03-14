/*
***** ***** *****
*   * *   * *   *
*   * *   * *   *
*   * *   * *   *
***** ***** *****
*/
import java.util.Scanner;
public class P2 {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of rows :");
    int rows = sc.nextInt();
    System.out.print("pattern repeat rowwise? :");
    int noOfTimes = sc.nextInt();
    for(int i = 1; i <= rows; i++) {
        if(i == 1 || i == rows) {
            for(int h=1;h<=noOfTimes;h++) {
            for(int j = 1; j <= rows; j++) {
              System.out.print("*");
            }
          } 
          
          System.out.println();
          }
          else if(i >= 2 && i < rows) { 
            for(int h=1;h<=noOfTimes;h++) {
            for(int j = 1; j <= rows; j++) {
              if(j == 1 || j == rows) {
                System.out.print("*");
              }
              else {
                System.out.print(" ");
              }
            }
            
          }         
	  System.out.println(); 
          }
        }
      }
    }
