import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rowDim = scanner.nextInt();
        int colDim = scanner.nextInt();
        int[][] seats = new int[rowDim][colDim];
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                seats[x][y] = scanner.nextInt();
            }
        }

        int howManyInRow = scanner.nextInt();
        int counter = 0;
        for (int x = 0; x < seats.length; x++) {
            for (int y = 0; y < seats[x].length; y++) {
                if(seats[x][y] == 0){

                }
            }

        }
    }
}