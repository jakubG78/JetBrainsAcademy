import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxX = scanner.nextInt();
        int maxY = scanner.nextInt();
        int[][] twoDimArray = new int[maxX][maxY];
        fillInArray(scanner, twoDimArray);
        int[][] rotatedArray = getRotatedArray(twoDimArray);
        printArray(rotatedArray);
    }

    private static int[][] getRotatedArray(int[][] arrayToRotate) {
        int rotX = arrayToRotate.length;
        int rotY = arrayToRotate[0].length;
        int[][] rotatedArray = new int[rotY][rotX];
        for (int x = 0; x < rotX; x++) {
            for (int y = 0; y < rotY; y++) {
                rotatedArray[y][rotX - 1 - x] = arrayToRotate[x][y];
            }
        }
        return rotatedArray;
    }

    private static void fillInArray(Scanner scanner, int[][] arrayToPrint) {
        for (int x = 0; x < arrayToPrint.length; x++) {
            for (int y = 0; y < arrayToPrint[x].length; y++) {
                arrayToPrint[x][y] = scanner.nextInt();
            }
        }
    }

    private static void printArray(int[][] twoDimArray) {
        for (int x = 0; x < twoDimArray.length; x++) {
            for (int y = 0; y < twoDimArray[x].length; y++) {
                System.out.print(twoDimArray[x][y] + " ");
            }
            System.out.println();
        }
    }
}