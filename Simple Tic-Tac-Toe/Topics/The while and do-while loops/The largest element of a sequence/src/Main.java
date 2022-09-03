import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int maxNumber = 0;
        int inputNumber = -1;
        while (inputNumber != 0) {
            inputNumber = Integer.valueOf(scanner.nextLine());
            if (inputNumber > maxNumber) {
                maxNumber = inputNumber;
            }
        }
        System.out.print(maxNumber);
    }
}