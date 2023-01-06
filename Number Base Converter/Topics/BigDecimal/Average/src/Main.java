import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal firstNumber = new BigDecimal(scanner.next());
        BigDecimal secondNumber = new BigDecimal(scanner.next());
        BigDecimal thirdNumber = new BigDecimal(scanner.next());
        System.out.println(firstNumber.add(secondNumber).add(thirdNumber)
                .divide(new BigDecimal(3), 0,RoundingMode.DOWN));
    }
}