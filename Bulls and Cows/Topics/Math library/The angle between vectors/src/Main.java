import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double v1 = scanner.nextDouble();
        double v2 = scanner.nextDouble();
        double u1 = scanner.nextDouble();
        double u2 = scanner.nextDouble();

        double vLength = Math.sqrt(Math.pow(v1, 2) + Math.pow(v2, 2));
        double uLength = Math.sqrt(Math.pow(u1, 2) + Math.pow(u2, 2));
        double scalarProductOfVectors = v1 * u1 + v2 * u2;
        double cosinus = scalarProductOfVectors / (vLength * uLength);

        System.out.println(Math.toDegrees(Math.acos(cosinus)));;
    }
}