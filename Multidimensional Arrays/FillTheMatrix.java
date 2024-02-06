import java.util.Scanner;

public class FillTheMatrix {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String input = scanner.nextLine();

        // Splitting the input into size and pattern
        String[] parts = input.split(", ");

        if (parts.length != 2) {
            return;
        }

        int N = Integer.parseInt(parts[0]);
        char patternType = parts[1].charAt(0);

        int[][] matrix;

        if (patternType == 'A') {
            matrix = fillMatrixPatternA(N);
        } else if (patternType == 'B') {
            matrix = fillMatrixPatternB(N);
        } else {
            return;
        }

        printMatrix(matrix);
    }

    // Method to fill matrix in Pattern A
    private static int[][] fillMatrixPatternA(int N) {
        int[][] matrix = new int[N][N];
        int value = 1;

        for (int col = 0; col < N; col++) {
            for (int row = 0; row < N; row++) {
                matrix[row][col] = value++;
            }
        }

        return matrix;
    }

    // Method to fill matrix in Pattern B
    private static int[][] fillMatrixPatternB(int N) {
        int[][] matrix = new int[N][N];
        int value = 1;

        for (int col = 0; col < N; col++) {
            if (col % 2 == 0) {
                for (int row = 0; row < N; row++) {
                    matrix[row][col] = value++;
                }
            } else {
                for (int row = N - 1; row >= 0; row--) {
                    matrix[row][col] = value++;
                }
            }
        }

        return matrix;
    }

    // Method to print the matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
        System.out.println();
    }
}
