package machine;

public class Machine {
    public int waterInMachine;
    public int milkInMachine;
    public int coffeeInMachine;
    public int cupsInMachine;
    public int money;

    public Machine(int waterInMachine, int milkInMachine, int coffeeInMachine, int cupsInMachine, int money) {
        this.waterInMachine = waterInMachine;
        this.milkInMachine = milkInMachine;
        this.coffeeInMachine = coffeeInMachine;
        this.cupsInMachine = cupsInMachine;
        this.money = money;
    }

    @Override
    public String toString() {
        return String.format("%nThe coffee machine has:%n" +
                        "%d ml of water%n" +
                        "%d ml of milk%n" +
                        "%d g of coffee beans%n" +
                        "%d disposable cups%n" +
                        "$%d of money%n%n", waterInMachine, milkInMachine,
                coffeeInMachine, cupsInMachine, money);
    }

    public boolean takeWater(int amount) {
        if (this.waterInMachine - amount >= 0) {
            this.waterInMachine -= amount;
            return true;
        } else {
            System.out.println("Sorry, not enough water!");
            return false;
        }
    }

    public boolean takeMilk(int amount) {
        if (this.milkInMachine - amount >= 0) {
            this.milkInMachine -= amount;
            return true;
        } else {
            System.out.println("Sorry, not enough milk!");
            return false;
        }
    }

    public boolean takeCoffeeBeans(int amount) {
        if (this.coffeeInMachine - amount >= 0) {
            this.coffeeInMachine -= amount;
            return true;
        } else {
            System.out.println("Sorry, not enough coffee beans!");
            return false;
        }
    }

    public boolean takeCoffeeCups(int amount) {
        if (this.cupsInMachine - amount >= 0) {
            this.cupsInMachine -= amount;
            return true;
        } else {
            System.out.println("Sorry, not enough cups!");
            return false;
        }
    }

    public int getMoney() {
        int money = this.money;
        this.money = 0;
        return money;
    }
}
