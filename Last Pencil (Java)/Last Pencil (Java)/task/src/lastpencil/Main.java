package lastpencil;

import utils.Utils.Player;

import java.util.Random;
import java.util.Scanner;
import static utils.Utils.*;

public class Main {
    Scanner sc = new Scanner(System.in);
    Player player;
    int numOfPencil;
    Random random;

    public static void main(String[] args) {
        Main game =  new Main();
        game.initialize();
        game.startGame();
    }

    void initialize() {
        sc = new Scanner(System.in);
        numOfPencil = getNumberOfPencils(sc);
        player = getFirstPlayer(sc);
        random =  new Random();
    }

    void startGame() {
        while (numOfPencil != 0) {
            printAvailablePencils(numOfPencil);
            if (player == Player.JACK) {
                playBot();
            } else {
                playPlayer();
            }
        }
        System.out.println(player == Player.JACK ? Messages.JACK_WON : Messages.JOHN_WON);
        sc.close();
    }

    void playBot() {
        int takenPencils;
        if (isWinningPosition()) {
            takenPencils = numOfPencil % 4 == 0 ? 3 : numOfPencil % 4 ==  2 ? 1 : 2;
        } else {
            takenPencils = numOfPencil == 1 ? 1 : random.nextInt(1, 4);
        }
        numOfPencil -= takenPencils;
        System.out.println("Jack's turn:");
        System.out.println(takenPencils);
        player = changePlayer(player);
    }

    boolean isWinningPosition() {
        return numOfPencil != 1 && numOfPencil % 4 != 1;
    }

    void playPlayer() {
        System.out.println("John's turn");
        String input = sc.next();
        while (!inputPencilsIsValid(input, numOfPencil)) {
            input = sc.next();
        }
        numOfPencil -= Integer.parseInt(input);
        player = changePlayer(player);
    }
}