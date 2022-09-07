package tictactoe;

import java.util.InputMismatchException;
import java.util.Scanner;

import static java.lang.Math.abs;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char[][] playBoard = new char[3][3];
        String input = scanner.nextLine();
        int charIndex = 0;
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                playBoard[rowIndex][columnIndex] = input.charAt(charIndex);
                charIndex++;
            }
        }
        printBoard(playBoard);

/*        if (Impossible(input)) {
            System.out.println("Impossible");
        } else if (XWin(input)) {
            System.out.println("X wins");
        } else if (OWin(input)) {
            System.out.println("O wins");
        } else if (GameNotFinished(input)) {
            System.out.println("Game not finished");
        } else {
            System.out.println("Draw");
        }*/
        move(scanner, playBoard);
        printBoard(playBoard);
    }

    private static void move(Scanner scanner, char[][] playBoard) {
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
                if (playBoard[xMove - 1][yMove - 1] != '_') {
                    System.out.println("This cell is occupied! Choose another one!");
                } else {
                    playBoard[xMove - 1][yMove - 1] = 'X';
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

    public static boolean GameNotFinished(String input) {
        return input.contains("_");
    }

    public static boolean XWin(String input) {
        return input.substring(3, 6).equals("XXX") | input.startsWith("XXX") | input.endsWith("XXX")
                | (input.charAt(0) == 'X' && input.charAt(4) == 'X' && input.charAt(8) == 'X')
                | (input.charAt(0) == 'X' && input.charAt(3) == 'X' && input.charAt(6) == 'X')
                | (input.charAt(1) == 'X' && input.charAt(4) == 'X' && input.charAt(7) == 'X')
                | (input.charAt(2) == 'X' && input.charAt(5) == 'X' && input.charAt(8) == 'X')
                | (input.charAt(2) == 'X' && input.charAt(4) == 'X' && input.charAt(6) == 'X');
    }

    public static boolean OWin(String input) {
        return input.substring(3, 6).equals("OOO") | input.startsWith("OOO") | input.endsWith("OOO")
                | (input.charAt(0) == 'O' && input.charAt(4) == 'O' && input.charAt(8) == 'O')
                | (input.charAt(0) == 'O' && input.charAt(3) == 'O' && input.charAt(6) == 'O')
                | (input.charAt(1) == 'O' && input.charAt(4) == 'O' && input.charAt(7) == 'O')
                | (input.charAt(2) == 'O' && input.charAt(5) == 'O' && input.charAt(8) == 'O')
                | (input.charAt(2) == 'O' && input.charAt(4) == 'O' && input.charAt(6) == 'O');
    }

    public static boolean Impossible(String input) {
        int Xs = 0;
        int Os = 0;
        for (int i = 0; i < input.length(); ++i) {
            if (input.charAt(i) == 'X') {
                ++Xs;
            } else if (input.charAt(i) == 'O') {
                ++Os;
            }
        }
        return abs(Xs - Os) > 1 || (OWin(input) && XWin(input));
    }

}

