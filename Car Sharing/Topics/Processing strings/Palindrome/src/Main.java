import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        StringBuilder builder = new StringBuilder(input);
        if (input.equals(builder.reverse().toString())) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}