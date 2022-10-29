import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 0;
        for (int i = 0; i < 4; i++) {
            number = scanner.nextInt() - 1;
            System.out.print(number + " ");
        }
    }
}