import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String ticketNumber = scanner.nextLine();
        char[] partsOfNumber = ticketNumber.toCharArray();
        int sumOfFirstThree = 0;
        int sumOfLastThree = 0;
        for (int i = 0; i < partsOfNumber.length; i++) {
            if (i < 3) {
                sumOfFirstThree += Character.getNumericValue(partsOfNumber[i]);
            } else {
                sumOfLastThree += Character.getNumericValue(partsOfNumber[i]);
            }
        }
        if (sumOfFirstThree == sumOfLastThree) {
            System.out.println("Lucky");
        } else {
            System.out.println("Regular");
        }
    }
}