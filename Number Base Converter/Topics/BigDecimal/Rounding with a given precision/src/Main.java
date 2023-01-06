import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal numberConvertedToBigDecimal = new BigDecimal(scanner.nextLine());
        int newScale = scanner.nextInt();

        numberConvertedToBigDecimal = numberConvertedToBigDecimal.setScale(newScale, RoundingMode.HALF_DOWN);
        System.out.println(numberConvertedToBigDecimal);
    }
}