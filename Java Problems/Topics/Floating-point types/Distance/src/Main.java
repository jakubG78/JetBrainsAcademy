import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int distance = scanner.nextInt();
        int travelTime = scanner.nextInt();
        double travelSpeed = (1.0 * distance) / travelTime;
        System.out.println(travelSpeed);
    }
}