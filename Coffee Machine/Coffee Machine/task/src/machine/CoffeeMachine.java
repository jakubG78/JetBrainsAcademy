package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Machine coffeeMachine = new Machine(400, 540, 120, 9, 550);
        boolean isMachineOn = true;
        while (isMachineOn) {
            System.out.printf("Write action (buy, fill, take, remaining, exit):%n");
            String inputCommand = scanner.nextLine();
            switch (inputCommand) {
                case "buy":
                    System.out.println("What do you want to buy? 1 - espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
                    String whatCoffee = scanner.nextLine();
                    switch (whatCoffee) {
                        case "1":
                            if (coffeeMachine.takeWater(250) && coffeeMachine.takeCoffeeBeans(16)
                                    && coffeeMachine.takeCoffeeCups(1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                coffeeMachine.money += 4;
                            }
                            break;
                        case "2":
                            if (coffeeMachine.takeWater(350) && coffeeMachine.takeMilk(75)
                                    && coffeeMachine.takeCoffeeBeans(20) && coffeeMachine.takeCoffeeCups(1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                coffeeMachine.money += 7;
                            }
                            break;

                        case "3":
                            if (coffeeMachine.takeWater(200) && coffeeMachine.takeMilk(100)
                                    && coffeeMachine.takeCoffeeBeans(12) && coffeeMachine.takeCoffeeCups(1)) {
                                System.out.println("I have enough resources, making you a coffee!");
                                coffeeMachine.money += 6;
                            }
                            break;

                        case "back":
                            break;

                        default:
                            System.out.println("Unknown command try again!");
                            break;
                    }
                    break;

                case "fill":
                    System.out.println("Write how many ml of water you want to add:");
                    int input = scanner.nextInt();
                    coffeeMachine.waterInMachine += input;
                    System.out.println("Write how many ml of milk you want to add:");
                    input = scanner.nextInt();
                    coffeeMachine.milkInMachine += input;
                    System.out.println("Write how many grams of coffee beans you want to add:");
                    input = scanner.nextInt();
                    coffeeMachine.coffeeInMachine += input;
                    System.out.println("Write how many disposable cups you want to add:");
                    input = scanner.nextInt();
                    coffeeMachine.cupsInMachine += input;
                    break;

                case "take":
                    System.out.printf("I gave you $%d%n", coffeeMachine.getMoney());
                    break;

                case "remaining":
                    System.out.print(coffeeMachine);
                    break;

                case "exit":
                    isMachineOn = false;
                    break;

                default:
                    System.out.println("Unknown command try again!");
                    break;
            }
        }
    }
}
