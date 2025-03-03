import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
        long quantity = inputString.trim().toLowerCase().chars()
                .filter(t -> t == 'g' || t == 'c')
                .count();
        double percentageOfGC = 100.0 * quantity / inputString.length();
        System.out.println(percentageOfGC);
    }
}