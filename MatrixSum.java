import java.util.Scanner;

public class MatrixSum {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Number of collums: ");
        int cols = scanner.nextInt();

        int[][] matrixA = new int[rows][cols];
        int[][] matrixB = new int[rows][cols];
        int[][] sumMatrix = new int[rows][cols];

        System.out.println("Matrix A: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("A[%d][%d] = ", i, j);
                matrixA[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix B: \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.printf("B[%d][%d] = ", i, j);
                matrixB[i][j] = scanner.nextInt();
            }
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                sumMatrix[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }

        System.out.println("Sum (A + B): \n");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(sumMatrix[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
