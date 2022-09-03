package tictactoe;

import java.util.Scanner;

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
    }

    private static void printBoard(char[][] playBoard) {
        System.out.println("---------");
        for (int rowIndex = 0; rowIndex < 3; rowIndex++) {
            System.out.print("| ");
            for (int columnIndex = 0; columnIndex < 3; columnIndex++) {
                System.out.print(playBoard[rowIndex][columnIndex] + " ");
            }
            System.out.println("|");
        }
        System.out.println("---------");
    }
}

