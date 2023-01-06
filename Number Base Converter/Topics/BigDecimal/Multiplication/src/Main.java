import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal firstNumber = new BigDecimal(scanner.next());
        BigDecimal secondNumber = new BigDecimal(scanner.next());
        System.out.println(firstNumber.multiply(secondNumber));
    }
}