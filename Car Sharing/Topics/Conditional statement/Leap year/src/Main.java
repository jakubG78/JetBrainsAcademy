import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = scanner.nextInt();
        if (inputYear % 4 == 0 && inputYear % 100 != 0 || inputYear % 400 == 0) {
            System.out.println("Leap");
        } else {
            System.out.println("Regular");
        }
    }
}