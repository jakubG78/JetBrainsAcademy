package cinema;

import java.util.Scanner;

public class Cinema {

    public static void main(String[] args) {

        int premiumSeatsPrice = 10;
        int normalSeatsPrice = 8;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of rows:");
        int rows = scanner.nextInt();
        System.out.println("Enter the number of seats in each row:");
        int columns = scanner.nextInt();
        char[][] seatsSetup = new char[columns][rows];

        createCinemaRoom(seatsSetup);
        menuInterface(premiumSeatsPrice, normalSeatsPrice, seatsSetup, scanner);

    }

    private static void buyTicket(int premiumSeatsPrice, int normalSeatsPrice, Scanner scanner, char[][] seatsSetup) {
        System.out.println("Enter a row number:");
        int chosenRowNumber = scanner.nextInt();
        System.out.println("Enter a seat number in that row:");
        int chosenColumnNumber = scanner.nextInt();
        seatsSetup[chosenColumnNumber - 1][chosenRowNumber - 1] = 'B';
        System.out.printf("\nTicket price: $%d\n", checkTicketPrice(premiumSeatsPrice, normalSeatsPrice, seatsSetup, chosenRowNumber));
    }

    private static void createCinemaRoom(char[][] seatsSetup) {
        for (int rowIndex = 0; rowIndex < seatsSetup[0].length; rowIndex++) {
            for (int columnIndex = 0; columnIndex < seatsSetup.length; columnIndex++) {
                seatsSetup[columnIndex][rowIndex] = 'S';
            }
        }
    }

    private static int checkTicketPrice(int premiumSeatsPrice, int normalSeatsPrice, char[][] seatsSetup, int chosenRowNumber) {
        int ticketPrice;
        if (seatsSetup.length * seatsSetup[0].length < 60) {
            ticketPrice = premiumSeatsPrice;
        } else if (chosenRowNumber <= (seatsSetup[0].length / 2)) {
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
        System.out.println();
    }

    private static void menuInterface(int premiumSeatsPrice, int normalSeatsPrice, char[][] seatsSetup, Scanner scanner) {
        boolean isNotOver = true;
        while (isNotOver) {
            System.out.println("1. Show the seats");
            System.out.println("2. Buy a ticket");
            System.out.println("0. Exit");

            int inputCommand = scanner.nextInt();

            switch (inputCommand) {
                case 1:
                    printSeatsSetup(seatsSetup);
                    break;
                case 2:
                    buyTicket(premiumSeatsPrice, normalSeatsPrice, scanner, seatsSetup);
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