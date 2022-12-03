package bullscows;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int secretCodeLength = Integer.valueOf(scanner.nextLine());
        long pseudoRandomNumber = System.nanoTime();
        
    }

    private static void userInterface(Scanner scanner) {
        String secretCode = "9305";
        int cowsCounter = 0;
        int bullsCounter = 0;
        char[] playerInput = scanner.nextLine().toCharArray();
        for (int i = 0; i < playerInput.length; i++) {
            if (secretCode.contains(String.valueOf(playerInput[i]))) {
                if (secretCode.charAt(i) == playerInput[i]) {
                    bullsCounter++;
                } else {
                    cowsCounter++;
                }
            }
        }
        System.out.print("Grade: ");
        if (cowsCounter == 0 && bullsCounter == 0) {
            System.out.print(" None.");
        } else if (cowsCounter == 0) {
            System.out.print(bullsCounter + " bull(s).");
        } else if (bullsCounter == 0) {
            System.out.print(cowsCounter + " cow(s).");
        } else {
            System.out.print(bullsCounter + " bull(s) and " + cowsCounter + " cow(s).");
        }
        System.out.println(" The secret code is " + secretCode + ".");
    }
}
