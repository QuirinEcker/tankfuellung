import java.util.Scanner;

public class Ecker_TankFuellung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] tankKilometers = input(scanner);
        double average = average(tankKilometers);
        printAverage(average, tankKilometers);
    }

    private static void printAverage(double average, int[] tankKilometers) {
        System.out.print("[");
        for (int i = 0; i < tankKilometers.length; i++) {
            System.out.printf("%d", tankKilometers[i]);
            if (i < tankKilometers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] --> ");
        System.out.print(average);
    }

    private static int[] input(Scanner scanner) {
        int[] tankKilometers = new int[4];

        for (int i = 0; i < tankKilometers.length; i++) {
            System.out.print(i + 1 + ": Tankwert: ");
            tankKilometers[i] = scanner.nextInt();
        }
        return tankKilometers;
    }

    public static double average(int[] tankKilometer) {
        double average = 0;
        double tankKilometerSum = 0;
        boolean isnull = tankKilometer.length == 0;

        for (int i = 0; i < tankKilometer.length; i++) {
            tankKilometerSum += tankKilometer[i];
        }

        if (isnull) {
            average = -1;
        } else {
            average = tankKilometerSum / tankKilometer.length;
        }

        return average;
    }


}
