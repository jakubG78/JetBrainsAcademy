package lastpencil;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("How many pencils would you like to use:");
        int amountOfPencils = scanner.nextInt();
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

    private static void printPencils(int amountOfPencils) {
        for (int i = 0; i < amountOfPencils; i++) {
            System.out.print("|");
        }
    }
}
