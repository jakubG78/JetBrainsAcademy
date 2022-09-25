package battleship;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        PlayBoard playBoard = new PlayBoard();
        Scanner scanner = new Scanner(System.in);
        playBoard.printBoard();
        System.out.println(playBoard.isEmpty(1, 1));
        playBoard.setupShip(scanner);
        playBoard.printBoard();
        // Write your code here
    }
}
