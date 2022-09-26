package battleship;

import java.util.Scanner;

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
        System.out.println();
    }

    private boolean deployShipPart(int x, int y) {
        if (isEmpty(x, y)) {
            this.board[x][y] = 'O';
            return true;
        } else {
            return false;
        }
    }

    protected void setupShip(Scanner scanner) {
        String[] inputStringArray = scanner.next().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        int startX = Integer.valueOf(inputStringArray[1]) - 1;
        int startY = inputStringArray[0].charAt(0) - 65;
        inputStringArray = scanner.next().split("(?<=\\D)(?=\\d)|(?<=\\d)(?=\\D)");
        int endX = Integer.valueOf(inputStringArray[1]) - 1;
        int endY = inputStringArray[0].charAt(0) - 65;
/*      System.out.println(startX + ":" + startY);
        System.out.println(endX + ":" + endY); */
        if ((startX >= 0 && startX < this.board.length) &&
                (startY >= 0 && endY < this.board[0].length)) {
            if (startX == endX) {
                for (int i = startY; i <= endY; i++) {
                    if (!deployShipPart(startX, i)) {
                        System.out.println("Error! Wrong ship location! Try again:");
                        i = endY;
                    } else {
                        deployShipPart(startX, i);
                    }
                }
            } else if (startY == endY) {
                for (int i = startX; i <= endX; i++) {
                    if (!deployShipPart(i, startY)) {
                        System.out.println("Error! Wrong ship location! Try again:");
                        i = endY;
                    } else {
                        deployShipPart(i, startY);
                    }
                }
            } else {
                System.out.println("Error! Wrong ship location! Try again:");
            }
        } else {
            System.out.println("Error! Wrong ship location! Try again:");
        }
    }

    protected boolean isEmpty(int x, int y) {
        return this.board[x][y] == '~';
    }
}
