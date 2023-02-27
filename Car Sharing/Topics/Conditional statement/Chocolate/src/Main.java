import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int withInSegments = scanner.nextInt();
        int heightInSegments = scanner.nextInt();
        int segmentsToSeparate = scanner.nextInt();
        if (withInSegments * heightInSegments > segmentsToSeparate
                && (segmentsToSeparate % withInSegments == 0 || segmentsToSeparate % heightInSegments == 0)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }
    }
}