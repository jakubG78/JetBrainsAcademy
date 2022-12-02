import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] array = new int[rows][columns];
        int maxRowIndex = 0;
        int maxColumnIndex = 0;

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                array[x][y] = scanner.nextInt();
            }
        }

        int maxValue = array[0][0];

        for (int x = 0; x < array.length; x++) {
            for (int y = 0; y < array[0].length; y++) {
                if (array[x][y] > maxValue) {
                    maxValue = array[x][y];
                    maxRowIndex = x;
                    maxColumnIndex = y;
                }
            }
        }

        System.out.println(maxRowIndex + " " + maxColumnIndex);
    }
}