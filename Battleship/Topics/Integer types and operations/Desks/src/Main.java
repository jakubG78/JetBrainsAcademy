import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int firstGroupStudents = scanner.nextInt();
        int secondGroupStudents = scanner.nextInt();
        int thirdGroupStudents = scanner.nextInt();
        System.out.println(firstGroupStudents / 2 + firstGroupStudents % 2
                + secondGroupStudents / 2 + secondGroupStudents % 2
                + thirdGroupStudents / 2 + thirdGroupStudents % 2);
    }
}