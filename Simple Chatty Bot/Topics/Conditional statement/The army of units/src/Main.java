import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int armyUnitsCount = scanner.nextInt();
        if (armyUnitsCount < 1) {
            System.out.println("no army");
        } else if (armyUnitsCount < 20) {
            System.out.println("pack");
        } else if (armyUnitsCount < 250) {
            System.out.println("throng");
        } else if (armyUnitsCount < 1000) {
            System.out.println("zounds");
        } else {
            System.out.println("legion");
        }
    }
}