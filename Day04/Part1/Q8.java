/*Create a class called 'Matrix' containing constructor that initializes the number of rows and number of columns of a new Matrix object. The Matrix class has the following information:
1 - number of rows of matrix
2 - number of columns of matrix
3 - elements of matrix in the form of 2D array
The Matrix class has methods for each of the following:
1 - get the number of rows
2 - get the number of columns
3 - set the elements of the matrix at given position (i,j)
4 - adding two matrices. If the matrices are not addable, "Matrices cannot be added" will be displayed.
5 - multiplying the two matrices
*/

import java.util.Scanner;

class Matrix {
    private int rows;
    private int columns;
    private int[][] elements;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        this.elements = new int[rows][columns];
    }

    public int getRows() {
        return rows;
    }

    public int getColumns() {
        return columns;
    }

    public void setElement(int i, int j, int value) {
        if (i >= 0 && i < rows && j >= 0 && j < columns) {
            elements[i][j] = value;
        } else {
            System.out.println("Invalid position to set element.");
        }
    }

    public void addMatrices(Matrix matrix2) {
        if (this.rows != matrix2.rows || this.columns != matrix2.columns) {
            System.out.println("Matrices cannot be added.");
        } else {
            Matrix resultMatrix = new Matrix(rows, columns);
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < columns; j++) {
                    resultMatrix.elements[i][j] = this.elements[i][j] + matrix2.elements[i][j];
                }
            }
            System.out.println("Sum of matrices:");
            resultMatrix.displayMatrix();
        }
    }

    public void multiplyMatrices(Matrix matrix2) {
        if (this.columns != matrix2.rows) {
            System.out.println("Matrices cannot be multiplied.");
        } else {
            Matrix resultMatrix = new Matrix(this.rows, matrix2.columns);
            for (int i = 0; i < this.rows; i++) {
                for (int j = 0; j < matrix2.columns; j++) {
                    for (int k = 0; k < this.columns; k++) {
                        resultMatrix.elements[i][j] += this.elements[i][k] * matrix2.elements[k][j];
                    }
                }
            }
            System.out.println("Product of matrices:");
            resultMatrix.displayMatrix();
        }
    }

    public void displayMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(elements[i][j] + " ");
            }
            System.out.println();
        }
    }
}

public class Q8{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows for the first matrix: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for the first matrix: ");
        int columns1 = scanner.nextInt();

        System.out.print("Enter the number of rows for the second matrix: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for the second matrix: ");
        int columns2 = scanner.nextInt();

        Matrix matrix1 = new Matrix(rows1, columns1);
        Matrix matrix2 = new Matrix(rows2, columns2);

        System.out.println("Enter the elements for the first matrix:");
        inputMatrixElements(matrix1, scanner);

        System.out.println("Enter the elements for the second matrix:");
        inputMatrixElements(matrix2, scanner);

        System.out.println("Matrix 1:");
        matrix1.displayMatrix();
        System.out.println("Matrix 2:");
        matrix2.displayMatrix();

        matrix1.addMatrices(matrix2);
        matrix1.multiplyMatrices(matrix2);

        scanner.close();
    }

    private static void inputMatrixElements(Matrix matrix, Scanner scanner) {
        for (int i = 0; i < matrix.getRows(); i++) {
            for (int j = 0; j < matrix.getColumns(); j++) {
                System.out.print("Enter element at position (" + i + ", " + j + "): ");
                int value = scanner.nextInt();
                matrix.setElement(i, j, value);
            }
        }
    }
}
