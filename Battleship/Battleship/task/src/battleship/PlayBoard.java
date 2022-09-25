package battleship;

import java.util.Scanner;

import static java.lang.Character.getNumericValue;

public class PlayBoard {
    protected char[][] board;

    public PlayBoard() {
        this.board = new char[10][10];
        for (int rowIndex = 0; rowIndex < board[0].length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < board.length; columnIndex++) {
                board[columnIndex][rowIndex] = '~';
            }
        }
    }

    protected void printBoard() {
        System.out.print("\n ");
        for (int columnIndex = 0; columnIndex < this.board.length; columnIndex++) {
            System.out.printf(" %d", columnIndex + 1);
        }
        System.out.println();
        for (int rowIndex = 0; rowIndex < this.board[0].length; rowIndex++) {
            char row = 'A';
            System.out.print((char) (row + rowIndex));
            for (int columnIndex = 0; columnIndex < this.board.length; columnIndex++) {
                System.out.print("\s" + this.board[columnIndex][rowIndex]);
            }
            System.out.println();
        }
    }

    protected void setupShip(Scanner scanner) {
        String startField = scanner.next();
        String endField = scanner.next();
        int startX = getNumericValue(startField.charAt(1)) - 1;
        int startY = startField.charAt(0) - 65;
        int endX = getNumericValue(endField.charAt(1)) - 1;
        int endY = endField.charAt(0) - 65;
        if (startX == endX) {
            System.out.println("vertical");
        } else if (startY == endY) {
            System.out.println("horizontal");
        } else {
            System.out.println("Error! Wrong ship location! Try again:");
        }
    }

    protected boolean isEmpty(int x, int y) {
        return this.board[x][y] == '~';
    }
}
