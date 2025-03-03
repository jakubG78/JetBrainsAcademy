import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] nucleons = input.trim().toCharArray();
        for (int i = 0; i < nucleons.length; i++) {
            int nucleonCounter = 1;
            if (i + 1 < nucleons.length) {
                while (nucleons[i] == nucleons[i + 1]) {
                    nucleonCounter++;
                }
                System.out.print(nucleons[i] + nucleonCounter);
            }
        }
    }
}