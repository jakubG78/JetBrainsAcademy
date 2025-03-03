package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pencils would you like to use:");
        int amountOfPencils = getAmountOfPencils(scanner);
        String fistPlayerName = "John";
        String secondPlayerName = "Jack";
        System.out.println("Who will be the first (John, Jack):");
        String currentPlayer = scanner.next();
        while (amountOfPencils > 0) {
            printPencils(amountOfPencils);
            System.out.println(String.format("\n%s's turn:", currentPlayer));
            amountOfPencils -= scanner.nextInt();
            if (currentPlayer.equals(fistPlayerName)) {
                currentPlayer = secondPlayerName;
            } else {
                currentPlayer = fistPlayerName;
            }
        }
    }

    private static int getAmountOfPencils(Scanner scanner) {
        int amountOfPencils = Integer.MIN_VALUE;
        while (amountOfPencils <= 0) {
            try {
                amountOfPencils = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException c) {
                amountOfPencils = Integer.MIN_VALUE;
            }
            if (amountOfPencils <= 0) {
                System.out.println(amountOfPencils == 0 ? "The number of pencils should be positive" :
                        "The number of pencils should be numeric");
            }
        }
        return amountOfPencils;
    }

    private static void printPencils(int amountOfPencils) {
        for (int i = 0; i < amountOfPencils; i++) {
            System.out.print("|");
        }
    }
}
