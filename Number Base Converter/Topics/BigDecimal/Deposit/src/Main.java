import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal startingAmount = new BigDecimal(scanner.next());
        BigDecimal tempValue = BigDecimal.ONE.add(new BigDecimal(scanner.nextInt())
                        .divide(new BigDecimal("100"))).pow(scanner.nextInt());
        BigDecimal finalAmount = startingAmount.multiply(tempValue).setScale(2, RoundingMode.CEILING);
        System.out.println("Amount of money in the account: " + finalAmount);
    }
}