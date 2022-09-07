package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] playBoard = new char[3][3];

        // initial variables values

        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                playBoard[rowIndex][columnIndex] = ' ';
            }
        }
        String whoIsWinner = "D";
        char whoPlays = 'X';

        printBoard(playBoard);
        while (gameNotFinished(playBoard)) {
            move(scanner, playBoard, whoPlays);
            if (whoPlays == 'X') {
                whoPlays = 'O';
            } else {
                whoPlays = 'X';
            }
            printBoard(playBoard);
            if (checkWinner(playBoard, 'X')) {
                whoIsWinner = "X";
                break;
            } else if (checkWinner(playBoard, 'O')) {
                whoIsWinner = "O";
                break;
            }
        }
        switch (whoIsWinner) {
            case "X":
                System.out.println("X wins");
                break;
            case "O":
                System.out.println("O wins");
                break;
            default:
                System.out.println("Draw.");
                break;
        }
    }

    private static void move(Scanner scanner, char[][] playBoard, char whoPlays) {
        int xMove;
        int yMove;
        while (true) {
            while (true) {
                try {
                    xMove = scanner.nextInt();
                    yMove = scanner.nextInt();
                    break;
                } catch (InputMismatchException e) {
                    System.out.println("You should enter numbers!");
                    scanner.nextLine();
                }
            }

            if (xMove <= 3 && yMove <= 3) {
                if (playBoard[xMove - 1][yMove - 1] != ' ') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    playBoard[xMove - 1][yMove - 1] = whoPlays;
                    break;
                }
            } else {
                System.out.println("Coordinates should be from 1 to 3!");
            }
        }
    }

    private static void printBoard(char[][] playBoard) {
        System.out.println("---------");
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            System.out.print("| ");
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                if (playBoard[rowIndex][columnIndex] == '_') {
                    System.out.print("  ");
                } else {
                    System.out.print(playBoard[rowIndex][columnIndex] + " ");
                }
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }

    public static boolean gameNotFinished(char[][] playBoard) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (playBoard[i][j] == ' ') return true;
            }
        }
        return false;
    }

    public static boolean checkWinner(char[][] playBoard, char toBeChecked) {
        return (playBoard[0][0] == toBeChecked && playBoard[0][1] == toBeChecked && playBoard[0][2] == toBeChecked)
                | (playBoard[1][0] == toBeChecked && playBoard[1][1] == toBeChecked && playBoard[1][2] == toBeChecked)
                | (playBoard[2][0] == toBeChecked && playBoard[2][1] == toBeChecked && playBoard[2][2] == toBeChecked)
                | (playBoard[0][0] == toBeChecked && playBoard[1][1] == toBeChecked && playBoard[2][2] == toBeChecked)
                | (playBoard[0][2] == toBeChecked && playBoard[1][1] == toBeChecked && playBoard[2][0] == toBeChecked)
                | (playBoard[1][0] == toBeChecked && playBoard[1][1] == toBeChecked && playBoard[1][2] == toBeChecked)
                | (playBoard[0][0] == toBeChecked && playBoard[1][0] == toBeChecked && playBoard[2][0] == toBeChecked)
                | (playBoard[0][1] == toBeChecked && playBoard[1][1] == toBeChecked && playBoard[2][1] == toBeChecked)
                | (playBoard[0][2] == toBeChecked && playBoard[1][2] == toBeChecked && playBoard[2][2] == toBeChecked);
    }
}

