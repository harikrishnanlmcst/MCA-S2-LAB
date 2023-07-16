import java.util.Scanner;

public class MatrixSymmetry {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();

        System.out.print("Enter the number of columns: ");
        int columns = scanner.nextInt();

        int[][] matrix = new int[rows][columns];

        System.out.println("Enter the matrix elements:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        scanner.close();

        if (isSymmetric(matrix)) {
            System.out.println("The matrix is symmetric.");
        } else {
            System.out.println("The matrix is not symmetric.");
        }
    }

    public static boolean isSymmetric(int[][] matrix) {
        int rows = matrix.length;
        int columns = matrix[0].length;

        if (rows != columns) {
            return false; // Matrix must be square to be symmetric
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] != matrix[j][i]) {
                    return false; // If a mismatch is found, matrix is not symmetric
                }
            }
        }

        return true; // Matrix is symmetric
    }
}
