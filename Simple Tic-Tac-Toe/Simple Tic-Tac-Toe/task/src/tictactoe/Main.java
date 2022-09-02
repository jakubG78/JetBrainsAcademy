package tictactoe;

public class Main {
    public static void main(String[] args) {
        char[][] playBoard = {
                {'X', 'X', 'O' },
                {'O', 'O', 'O' },
                {'O', 'O', 'O' }};

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                System.out.print(playBoard[rowIndex][columnIndex] + " ");
            }
            System.out.println();
        }
    }
}
