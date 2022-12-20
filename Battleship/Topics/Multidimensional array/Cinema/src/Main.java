import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int columns = scanner.nextInt();
        int[][] seats = new int[rows][columns];
        for (int i = 0; i < seats.length; i++) {
            for (int j = 0; j < seats[0].length; j++) {
                seats[i][j] = scanner.nextInt();
            }
        }
        int seatsInLine = scanner.nextInt();
        int searchedRow = 0;
        for (int i = 0; i < seats.length; i++) {
            int freeSeatsCounter = 0;
            for (int j = 0; j < seats[0].length; j++) {
                if (seats[i][j] == 0) {
                    freeSeatsCounter++;
                    if (freeSeatsCounter >= seatsInLine) {
                        searchedRow = i + 1;
                        break;
                    }
                } else {
                    freeSeatsCounter = 0;
                }
            }
        }
        System.out.println(searchedRow);
    }
}