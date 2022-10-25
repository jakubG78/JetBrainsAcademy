import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dimX = scanner.nextInt();
        int dimY = scanner.nextInt();
        int[][] matrix = new int[dimX][dimY];
        for (int x = 0; x < matrix.length; x++) {
            for (int y = 0; y < matrix[x].length; y++) {
                matrix[x][y] = scanner.nextInt();
            }
        }
        int[][] swappedMatrix = matrix.clone();

        int firstColumn = scanner.nextInt();
        int secondColumn = scanner.nextInt();

        for (int x = 0; x < dimX; x++) {
            int tempSwapValue = matrix[x][firstColumn];
            swappedMatrix[x][firstColumn] = matrix[x][secondColumn];
            swappedMatrix[x][secondColumn] = tempSwapValue;
        }

        for (int x = 0; x < dimX; x++) {
            for (int y = 0; y < dimY; y++) {
                System.out.print(swappedMatrix[x][y] + " ");
            }
            System.out.println();
        }
    }
}