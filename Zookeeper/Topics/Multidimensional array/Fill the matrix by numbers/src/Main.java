import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int matrixDimension = scanner.nextInt();
        int[][] matrix = new int[matrixDimension][matrixDimension];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = Math.abs(j - i);
                System.out.printf(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}