import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int howManyDays = scanner.nextInt();
        int oneDayFoodCost = scanner.nextInt();
        int oneWayFlightCost = scanner.nextInt();
        int oneDayHotelCost = scanner.nextInt();

        int totalFoodCost = howManyDays * oneDayFoodCost;
        int totalTransportCost = oneWayFlightCost + oneWayFlightCost;
        int totalHotelCost = oneDayHotelCost * (howManyDays - 1);

        int totalVacationCost = totalFoodCost + totalTransportCost + totalHotelCost;

        System.out.println(totalVacationCost);

    }
}