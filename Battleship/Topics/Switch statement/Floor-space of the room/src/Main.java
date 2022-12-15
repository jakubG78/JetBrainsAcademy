import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String shapeOfRoom = scanner.nextLine();
        double areaOfRoom = 0;
        switch (shapeOfRoom) {
            case "triangle":
                int a = scanner.nextInt();
                int b = scanner.nextInt();
                int c = scanner.nextInt();
                areaOfRoom = triangleArea(a, b, c);
                break;
            case "circle":
                int r = scanner.nextInt();
                areaOfRoom = circleArea(r);
                break;
            case "rectangle":
                a = scanner.nextInt();
                b = scanner.nextInt();
                areaOfRoom = rectangleArea(a, b);
                break;
            default:
                System.out.println("Invalid room shape input");
                break;
        }
        System.out.println(areaOfRoom);
    }

    public static double triangleArea(int a, int b, int c) {
        double p = (a + b + c) / 2.0;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static double circleArea(int r) {
        return 3.14 * Math.pow(r, 2);
    }

    public static double rectangleArea(int a, int b) {
        return a * b;
    }
}