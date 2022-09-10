package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        int premiumSeatsPrice = 10;
        int normalSeatsPrice = 8;
        Scanner scanner = new Scanner(System.in);
        char[][] seatsSetup = createCinemaRoom(scanner);
        menuInterface(premiumSeatsPrice, normalSeatsPrice, seatsSetup, scanner);

    }

    private static void buyTicket(int premiumSeatsPrice, int normalSeatsPrice, Scanner scanner, char[][] seatsSetup) {
        while (true) {
            System.out.println("\n" +
                    "Enter a row number:");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong input!");
                scanner.next();
            }
            int chosenRowNumber = scanner.nextInt();
            System.out.println("Enter a seat number in that row:");
            while (!scanner.hasNextInt()) {
                System.out.println("Wrong input!");
                scanner.next();
            }
            int chosenColumnNumber = scanner.nextInt();
            if (chosenRowNumber > 0 && chosenColumnNumber <= seatsSetup.length
                    && chosenColumnNumber > 0 && chosenRowNumber <= seatsSetup[0].length) {
                if (seatsSetup[chosenColumnNumber - 1][chosenRowNumber - 1] == 'B') {
                    System.out.println("That ticket has already been purchased!\n");
                } else {
                    seatsSetup[chosenColumnNumber - 1][chosenRowNumber - 1] = 'B';
                    System.out.printf("\nTicket price: $%d \n", checkTicketPrice(premiumSeatsPrice, normalSeatsPrice, seatsSetup, chosenRowNumber));
                    break;
                }
            } else {
                System.out.println("Wrong input!\n");
            }
        }
    }

    private static char[][] createCinemaRoom(Scanner scanner) {
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = scanner.nextInt();
        char[][] seatsSetup = new char[columns][rows];
        for (int rowIndex = 0; rowIndex < seatsSetup[0].length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < seatsSetup.length; columnIndex++) {
                seatsSetup[columnIndex][rowIndex] = 'S';
            }
        }
        return seatsSetup;
    }

    private static int checkTicketPrice(int premiumSeatsPrice, int normalSeatsPrice, char[][] seatsSetup, int chosenRowNumber) {
        int ticketPrice;
        if (seatsSetup.length * seatsSetup[0].length < 60) {
            ticketPrice = premiumSeatsPrice;
        } else if (chosenRowNumber <= seatsSetup[0].length / 2) {
            ticketPrice = premiumSeatsPrice;
        } else {
            ticketPrice = normalSeatsPrice;
        }
        return ticketPrice;
    }

    private static void printSeatsSetup(char[][] seats) {
        System.out.println("\nCinema:");
        System.out.print(" ");
        for (int columnIndex = 0; columnIndex < seats.length; columnIndex++) {
            System.out.printf(" %d", columnIndex + 1);
        }
        System.out.println();
        for (int rowIndex = 0; rowIndex < seats[0].length; rowIndex++) {
            System.out.print(rowIndex + 1);
            for (int columnIndex = 0; columnIndex < seats.length; columnIndex++) {
                System.out.print("\s" + seats[columnIndex][rowIndex]);
            }
            System.out.println();
        }
    }

    private static void statistics(int premiumSeatsPrice, int normalSeatsPrice, char[][] seatsSetup) {
        int soldTicketsCounter = 0;
        int totalIncome = 0;
        int currentIncome = 0;
        for (int rowIndex = 0; rowIndex < seatsSetup[0].length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < seatsSetup.length; columnIndex++) {
                totalIncome += checkTicketPrice(premiumSeatsPrice, normalSeatsPrice, seatsSetup, rowIndex + 1);
                if (seatsSetup[columnIndex][rowIndex] == 'B') {
                    currentIncome += checkTicketPrice(premiumSeatsPrice, normalSeatsPrice, seatsSetup, rowIndex + 1);
                    soldTicketsCounter++;
                }
            }
        }
        double percentage;
        if (seatsSetup.length * seatsSetup[0].length != 0) {
            percentage = (double) soldTicketsCounter * 100 / (seatsSetup.length * seatsSetup[0].length);
        } else {
            percentage = 0;
        }

        System.out.printf("%nNumber of purchased tickets: %d\n", soldTicketsCounter);
        System.out.printf("Percentage: %.2f%%%n", percentage);
        System.out.printf("Current income: $%d%n", currentIncome);
        System.out.printf("Total income: $%d%n", totalIncome);
    }

    private static void menuInterface(int premiumSeatsPrice, int normalSeatsPrice, char[][] seatsSetup, Scanner scanner) {
        boolean isNotOver = true;
        while (isNotOver) {
            System.out.println("\n" +
                    "1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("3. Statistics");
            System.out.println("0. Exit");

            int inputCommand = scanner.nextInt();

            switch (inputCommand) {
                case 1:
                    printSeatsSetup(seatsSetup);
                    break;
                case 2:
                    buyTicket(premiumSeatsPrice, normalSeatsPrice, scanner, seatsSetup);
                    break;
                case 3:
                    statistics(premiumSeatsPrice, normalSeatsPrice, seatsSetup);
                    break;
                case 0:
                    isNotOver = false;
                    break;
                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }
    }
}