import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfInputNumbers = 0;
        while (true) {
            int inputNumber = scanner.nextInt();
            if (inputNumber == 0) {
                break;
            }
            sumOfInputNumbers += inputNumber;
        }
        System.out.println(sumOfInputNumbers);
    }
}