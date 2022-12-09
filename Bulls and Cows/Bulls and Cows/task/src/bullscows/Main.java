package bullscows;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userInterface(scanner);
    }

    private static String generateCode(Scanner scanner) {
        String generatedCode;
        ArrayList<Character> codeChars = new ArrayList<>();
        while (true) {
            System.out.println("Please, enter the secret code's length:");
            int secretCodeLength = Integer.parseInt(scanner.nextLine());
            System.out.println("Input the number of possible symbols in the code:");
            int howManyLettersInCode = Integer.parseInt(scanner.nextLine());
            String codePool = "0123456789abcdefghijklmnopqrstuvwxyz";
            if (secretCodeLength < 36) {
                Random random = new Random();
                do {
                    char tempChar = codePool.charAt(random.nextInt(howManyLettersInCode - 1));
                    for (int i = 0; i < secretCodeLength; i++) {
                        if (tempChar == '0' && i == 0) {
                            break;
                        }
                        if (!codeChars.contains(tempChar)) {
                            codeChars.add(tempChar);
                        }
                        if (codeChars.size() == secretCodeLength) {
                            break;
                        }
                    }
                } while (codeChars.size() < secretCodeLength);
                StringBuilder stringBuilder = new StringBuilder();
                for (char singleNumber : codeChars) {
                    stringBuilder.append(singleNumber);
                }
                generatedCode = stringBuilder.toString();
                System.out.println("The secret is prepared: " + printStars(secretCodeLength) +
                        " (0-9, a-" + codePool.charAt(howManyLettersInCode - 1) + ").");
                break;
            } else {
                System.out.println("Error - secret code, too long. Try again.");
            }
        }
        return generatedCode;
    }

    private static void userInterface(Scanner scanner) {
        String secretCode = generateCode(scanner);
        int cowsCounter;
        int bullsCounter;
        int tunsCounter = 1;
        System.out.println("Okay, let's start a game!");
        while (true) {
            cowsCounter = 0;
            bullsCounter = 0;
            System.out.printf("Turn %d:\n", tunsCounter);
            char[] playerInput = scanner.nextLine().toCharArray();
            for (int i = 0; i < playerInput.length; i++) {
                if (secretCode.charAt(i) == playerInput[i]) {
                    bullsCounter++;
                } else if (secretCode.contains(String.valueOf(playerInput[i]))) {
                    cowsCounter++;
                }
            }
            System.out.print("Grade: ");
            if (bullsCounter != 0 || cowsCounter != 0) {
                if (bullsCounter != 0) {
                    System.out.printf("%d bull(s)", bullsCounter);
                }
                if (bullsCounter != 0 && cowsCounter != 0) {
                    System.out.print(" and ");
                }
                if (cowsCounter != 0) {
                    System.out.printf("%d cow(s)", cowsCounter);
                }
                System.out.print(".");
            }
            else{
                System.out.print("None.");
            }
            System.out.println();
            if (bullsCounter == secretCode.length()) {
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
            tunsCounter++;
        }
    }

    private static String printStars(int howManyStarsToPrint) {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < howManyStarsToPrint; i++) {
            stringBuilder.append("*");
        }
        return stringBuilder.toString();
    }
}
