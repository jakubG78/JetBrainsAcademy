import java.math.BigDecimal;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BigDecimal dwalinsGold = new BigDecimal(scanner.nextLine());
        BigDecimal balinsGold = new BigDecimal(scanner.nextLine());
        BigDecimal thorinsGold = new BigDecimal(scanner.nextLine());
        System.out.println(dwalinsGold.add(balinsGold).add(thorinsGold));
    }
}