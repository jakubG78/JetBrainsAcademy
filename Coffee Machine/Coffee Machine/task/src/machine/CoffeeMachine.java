package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int waterInMachine = 400;
        int milkInMachine = 540;
        int coffeeInMachine = 120;
        int money = 550;
        int cupsInMachine = 9;
        printMachineState(waterInMachine, milkInMachine, coffeeInMachine, cupsInMachine, money);
        System.out.printf("Write action (buy, fill, take):%n");
        String inputCommand = scanner.nextLine();
        switch (inputCommand) {
            case "buy":
                System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino:");
                int whatCoffee = scanner.nextInt();
                switch (whatCoffee) {
                    case 1:
                        if (waterInMachine >= 250 && coffeeInMachine >= 16 && cupsInMachine > 0) {
                            waterInMachine -= 250;
                            coffeeInMachine -= 16;
                            cupsInMachine--;
                            money += 4;
                        }
                        break;
                    case 2:
                        if (waterInMachine >= 350 && milkInMachine >= 75 && coffeeInMachine >= 20
                                && cupsInMachine > 0) {
                            waterInMachine -= 350;
                            milkInMachine -= 75;
                            coffeeInMachine -= 20;
                            cupsInMachine--;
                            money += 7;
                        }
                        break;
                    case 3:
                        if (waterInMachine >= 200 && milkInMachine >= 100 && coffeeInMachine >= 12
                                && cupsInMachine > 0) {
                            waterInMachine -= 200;
                            milkInMachine -= 100;
                            coffeeInMachine -= 12;
                            cupsInMachine--;
                            money += 6;
                        }
                        break;
                }
                break;

            case "fill":
                System.out.println("Write how many ml of water you want to add:");
                int input = scanner.nextInt();
                waterInMachine += input;
                System.out.println("Write how many ml of milk you want to add:");
                input = scanner.nextInt();
                milkInMachine += input;
                System.out.println("Write how many grams of coffee beans you want to add:");
                input = scanner.nextInt();
                coffeeInMachine += input;
                System.out.println("Write how many disposable cups you want to add:");
                input = scanner.nextInt();
                cupsInMachine += input;
                break;

            case "take":
                System.out.printf("I gave you $%d", money);
                money = 0;
                break;

            default:
                System.out.println("Unknown command try again!");
                break;
        }
        printMachineState(waterInMachine, milkInMachine, coffeeInMachine, cupsInMachine, money);

        /*System.out.println("Write how many cups of coffee you will need:");
        int howManyCups = scanner.nextInt();
        int cupsCanBeMade = 0;
        while (true) {
            if (waterInMachine > 200 && milkInMachine > 50 && coffeeInMachine > 15) {
                cupsCanBeMade++;
                waterInMachine -= 200;
                milkInMachine -= 50;
                coffeeInMachine -= 15;
            } else {
                break;
            }
        }
        if (howManyCups == cupsCanBeMade) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (howManyCups > cupsCanBeMade) {
            System.out.printf("Yes, I can make that amount of coffee " +
                    "(and even %d more than that)%n", howManyCups - cupsCanBeMade);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee%n", howManyCups);
        }
    }*/
    }

    private static void printMachineState(int waterInMachine, int milkInMachine, int coffeeInMachine, int cupsInMachine, int money) {
        System.out.printf("The coffee machine has:%n" +
                "%d ml of water%n" +
                "%d ml of milk%n" +
                "%d g of coffee beans%n" +
                "%d disposable cups%n" +
                "$%d of money%n%n", waterInMachine, milkInMachine, coffeeInMachine, cupsInMachine, money);
    }
}
