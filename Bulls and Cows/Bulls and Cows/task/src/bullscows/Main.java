package bullscows;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userInterface(scanner);
    }

    private static String generateCode(int secretCodeLength) {
        Long pseudoRandomNumber = 0L;
        String numbersPool = "";
        String generatedCode = "";
        ArrayList<Character> codeNumbers = new ArrayList<>();
        if (secretCodeLength < 10) {
            do {
                pseudoRandomNumber = System.nanoTime();
                numbersPool = pseudoRandomNumber.toString();
                for (int i = 0; i < secretCodeLength; i++) {
                    if (!codeNumbers.contains(numbersPool.charAt(i))) {
                        codeNumbers.add(numbersPool.charAt(i));
                    }
                }
            } while (codeNumbers.size() < secretCodeLength);
            StringBuilder stringBuilder = new StringBuilder();
            for (Character singleNumber : codeNumbers) {
                stringBuilder.append(singleNumber);
            }
            generatedCode = stringBuilder.toString();

        } else {
            System.out.println("Error - secret code, too long.");
        }
        return generatedCode;
    }

    private static void userInterface(Scanner scanner) {
        int secretCodeLength = Integer.valueOf(scanner.nextLine());
        String secretCode = generateCode(secretCodeLength);
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
