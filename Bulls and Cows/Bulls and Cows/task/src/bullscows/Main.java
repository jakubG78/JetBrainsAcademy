package bullscows;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        userInterface(scanner);
    }

    private static String generateCode(Scanner scanner) {
        String generatedCode = "";
        ArrayList<Character> codeNumbers = new ArrayList<>();
        while(true) {
            System.out.println("Please, enter the secret code's length:");
            int secretCodeLength = Integer.valueOf(scanner.nextLine());
            if (secretCodeLength <= 10) {
                do {
                    long pseudoRandomNumber = System.nanoTime();
                    String numbersPool = String.valueOf(Long.parseLong(new StringBuilder(String.valueOf(pseudoRandomNumber))
                            .reverse()
                            .toString()));
                    for (int i = 0; i < secretCodeLength; i++) {
                        if (!codeNumbers.contains(numbersPool.charAt(i))) {
                            codeNumbers.add(numbersPool.charAt(i));
                        }
                        if (codeNumbers.size() == secretCodeLength) {
                            break;
                        }
                    }
                } while (codeNumbers.size() < secretCodeLength);
                StringBuilder stringBuilder = new StringBuilder();
                for (Character singleNumber : codeNumbers) {
                    stringBuilder.append(singleNumber);
                }
                generatedCode = stringBuilder.toString();
                break;

            } else {
                System.out.println("Error - secret code, too long. Try again.");
            }
        }
        return generatedCode;
    }

    private static void userInterface(Scanner scanner) {
        String secretCode = generateCode(scanner);
        int cowsCounter = 0;
        int bullsCounter = 0;
        int tunsCounter = 1;
        System.out.println("Okay, let's start a game!");
        while (true) {
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
            if(bullsCounter == secretCode.length()){
                System.out.println("Congratulations! You guessed the secret code.");
                break;
            }
            cowsCounter = 0;
            bullsCounter = 0;
            tunsCounter++;
        }
    }
}
