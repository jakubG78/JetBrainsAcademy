import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        char[] nucleons = input.trim().toCharArray();
        int nucleonCounter = 1;
        for (int i = 0; i < nucleons.length; i++) {
            if (i + 1 < nucleons.length) {
                if (nucleons[i] == nucleons[i + 1]) {
                    nucleonCounter++;
                } else {
                    System.out.print(nucleons[i] + "" + nucleonCounter);
                    nucleonCounter = 1;
                }
            } else {
                System.out.print(nucleons[i] + "" + nucleonCounter);
                nucleonCounter = 1;
            }
        }
    }
}