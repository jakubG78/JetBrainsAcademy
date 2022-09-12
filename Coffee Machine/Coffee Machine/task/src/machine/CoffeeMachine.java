package machine;

import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write how many ml of water the coffee machine has:");
        int waterInMachine = scanner.nextInt();
        System.out.println("Write how many ml of milk the coffee machine has:");
        int milkInMachine = scanner.nextInt();
        System.out.println("Write how many grams of coffee beans the coffee machine has:");
        int coffeeInMachine = scanner.nextInt();
        System.out.println("Write how many cups of coffee you will need:");
        int howManyCups = scanner.nextInt();
        int cupsCanBeMade = getCupsCanBeMade(waterInMachine, milkInMachine, coffeeInMachine);
        if (howManyCups == cupsCanBeMade) {
            System.out.println("Yes, I can make that amount of coffee");
        } else if (howManyCups < cupsCanBeMade) {
            System.out.printf("Yes, I can make that amount of coffee " +
                    "(and even %d more than that)%n", cupsCanBeMade - howManyCups);
        } else {
            System.out.printf("No, I can make only %d cup(s) of coffee%n", cupsCanBeMade);
        }

        /*System.out.println("Starting to make a coffee");
        System.out.println("Grinding coffee beans");
        System.out.println("Boiling water");
        System.out.println("Mixing boiled water with crushed coffee beans");
        System.out.println("Pouring coffee into the cup");
        System.out.println("Pouring some milk into the cup");
        System.out.println("Coffee is ready!");*/
    }

    private static int getCupsCanBeMade(int waterInMachine, int milkInMachine, int coffeeInMachine) {
        int cupsCanBeMade = 0;
        while (true) {
            if (waterInMachine >= 200 && milkInMachine >= 50 && coffeeInMachine >= 15) {
                cupsCanBeMade++;
                waterInMachine -= 200;
                milkInMachine -= 50;
                coffeeInMachine -= 15;
            } else {
                break;
            }
        }
        return cupsCanBeMade;
    }

/*    private static int[] ingredientCalculator(int howManyCups) {
        int amountOfWater = howManyCups * 200;
        int amountOfMilk = howManyCups * 50;
        int amountOfCoffeeBeans = howManyCups * 15;
        return new int[]{amountOfWater, amountOfMilk, amountOfCoffeeBeans};
    }*/
}
