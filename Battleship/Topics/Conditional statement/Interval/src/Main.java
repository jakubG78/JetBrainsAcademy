import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int checkedNumber = scanner.nextInt();
        if (checkedNumber > -15 && checkedNumber <= 12) {
            System.out.println("True");
        } else if (checkedNumber > 14 && checkedNumber < 17) {
            System.out.println("True");
        } else if (checkedNumber >= 19) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}