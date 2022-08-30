import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int counterA = 0;
        int counterB = 0;
        int counterC = 0;
        int counterD = 0;
        int gradesCounter = scanner.nextInt();

        for (int i = 0; i <= gradesCounter; i++) {
            String inputGrade = scanner.nextLine();
            if (inputGrade.equals("A")) {
                counterA++;
            } else if (inputGrade.equals("B")) {
                counterB++;
            } else if (inputGrade.equals("C")) {
                counterC++;
            } else if (inputGrade.equals("D")) {
                counterD++;
            }
        }
        System.out.print(counterD + " " + counterC + " " + counterB + " " + counterA);
    }
}