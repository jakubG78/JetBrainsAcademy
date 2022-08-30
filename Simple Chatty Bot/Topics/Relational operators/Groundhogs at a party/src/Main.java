import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int peanutCups = scanner.nextInt();
        boolean isWeekend = scanner.nextBoolean();
        if (isWeekend) {
            System.out.println(peanutCups >= 15 && peanutCups <= 25);
        } else {
            System.out.println(peanutCups >= 10 && peanutCups <= 20);
        }
    }
}