import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNumber = scanner.nextInt();
        System.out.println(((inputNumber + 1) * inputNumber + 2) * inputNumber + 3);
    }
}