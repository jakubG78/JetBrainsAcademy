import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int minSleepHours = scanner.nextInt();
        int maxSleepHours = scanner.nextInt();
        int actualSleepHours = scanner.nextInt();
        if (actualSleepHours < minSleepHours) {
            System.out.println("Deficiency");
        } else if (actualSleepHours > maxSleepHours) {
            System.out.println("Excess");
        } else {
            System.out.println("Normal");
        }
    }
}