package calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int bubblegumIncome = 202;
        int toffeeIncome = 118;
        int iceCreamIncome = 2250;
        int milkChocolateIncome = 1680;
        int doughnutIncome = 1075;
        int pancakeIncome = 80;
        int totalIncome = bubblegumIncome + toffeeIncome + iceCreamIncome + milkChocolateIncome
                + doughnutIncome + pancakeIncome;

        System.out.println("Earned amount:");
        System.out.println("Bubblegum: $" + bubblegumIncome);
        System.out.println("Toffee: $" + toffeeIncome);
        System.out.println("Ice cream: $" + iceCreamIncome);
        System.out.println("Milk chocolate: $" + milkChocolateIncome);
        System.out.println("Doughnut: $" + doughnutIncome);
        System.out.println("Pancake: $" + pancakeIncome + "\n");
        System.out.print("Income: $" + totalIncome);
        System.out.println("Staff expenses:");
        int staffExpenses = scanner.nextInt();
        System.out.println("Other expenses:");
        int otherExpenses = scanner.nextInt();
        int netIncome = totalIncome - (staffExpenses + otherExpenses);
        System.out.print("Net income: $" + netIncome);
    }
}