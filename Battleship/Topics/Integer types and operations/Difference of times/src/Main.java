import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int first = scanner.nextInt() * 3600;
        first += scanner.nextInt() * 60;
        first += scanner.nextInt();
        int second = scanner.nextInt() * 3600;
        second += scanner.nextInt() * 60;
        second += scanner.nextInt();
        System.out.println(Math.abs(first - second));
    }
}