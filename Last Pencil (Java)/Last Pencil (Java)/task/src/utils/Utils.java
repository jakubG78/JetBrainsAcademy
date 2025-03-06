package utils;

import java.util.Arrays;
import java.util.Scanner;

public class Utils {
    public static class Messages {
        public static final String GET_PENCILS_AMOUNT = "How many pencils would you like to use:";
        public static final String NON_NUMERIC_PENCILS = "The number of pencils should be numeric";
        public static final String NUMBER_OF_PENCILS_ZERO = "The number of pencils should be positive";
        public static final String FIRST_PLAYER_MESSAGE = "Who will be the first (John, Jack):";
        public static final String PLAYER_NAME_NOT_FOUND = "Choose between 'John' and 'Jack'";
        public static final String MORE_PENCILS_THAN_AVAILABLE = "Too many pencils were taken";
        public static final String UNAVAILABLE_PENCIL_AMOUNT = "Possible values: '1', '2' or '3'";
        public static final String JOHN_WON = "John won!";
        public static final String JACK_WON = "Jack won!";
    }

    public enum Player {
        JOHN, JACK;

        @Override
        public String toString() {
            return this.name();
        }
    }

    public static boolean isValidPlayerName(String name) {
        return Arrays.stream(Player.values()).anyMatch(it -> it.toString().equalsIgnoreCase(name));
    }

    public static Player changePlayer(Player currentPlayer) {
        return currentPlayer == Player.JACK ? Player.JOHN : Player.JACK;
    }

    public static int getNumberOfPencils(Scanner sc) {
        System.out.println(Messages.GET_PENCILS_AMOUNT);
        int input = Integer.MIN_VALUE;
        while (input <= 0) {
            try {
                input = Integer.parseInt(sc.nextLine());
            } catch (NumberFormatException c) {
                input = Integer.MIN_VALUE;
            }
            if (input <= 0) {
                System.out.println(input == 0 ? Messages.NUMBER_OF_PENCILS_ZERO : Messages.NON_NUMERIC_PENCILS);
            }
        }
        return input;
    }

    public static Player getFirstPlayer(Scanner sc) {
        System.out.println(Messages.FIRST_PLAYER_MESSAGE);
        String name = sc.next();
        while (!isValidPlayerName(name)) {
            System.out.println(Messages.PLAYER_NAME_NOT_FOUND);
            name = sc.next();
        }
        return name.equalsIgnoreCase(Player.JACK.toString()) ? Player.JACK : Player.JOHN;
    }

    public static void printAvailablePencils(int availablePencils) {
        System.out.println("|".repeat(availablePencils));
    }

    public static boolean inputPencilsIsValid(String input, int availablePencils) {
        int pencils;
        try {
            pencils = Integer.parseInt(input);
            if (pencils < 1 || pencils > 3) {
                System.out.println(Messages.UNAVAILABLE_PENCIL_AMOUNT);
                return false;
            }
            if (pencils > availablePencils) {
                System.out.println(Messages.MORE_PENCILS_THAN_AVAILABLE);
                return false;
            }
        } catch (NumberFormatException c) {
            System.out.println(Messages.UNAVAILABLE_PENCIL_AMOUNT);
            return false;
        }
        return true;
    }
}