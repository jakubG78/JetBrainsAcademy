import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimension = scanner.nextInt();
        int[][] matrix = new int[dimension][dimension];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }

        if (isMatixSymmetric(matrix)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }

    public static void transposeMatrix(int[][] inputMatrix, int[][] transposedMatrix) {
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                transposedMatrix[j][i] = inputMatrix[i][j];
            }
        }
    }

    public static boolean isMatixSymmetric(int[][] inputMatrix) {
        int[][] transposedMatrix = new int[inputMatrix.length][inputMatrix.length];
        transposeMatrix(inputMatrix, transposedMatrix);
        for (int i = 0; i < inputMatrix.length; i++) {
            for (int j = 0; j < inputMatrix[0].length; j++) {
                if (transposedMatrix[i][j] != inputMatrix[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }
}