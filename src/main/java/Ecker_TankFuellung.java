import java.util.Scanner;

public class Ecker_TankFuellung {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] tankKilometers = input(scanner);
        double average = average(tankKilometers);
        printAverage(average, tankKilometers);
    }

    private static void printAverage(double average, double[] tankKilometers) {
        System.out.print("[");
        for (int i = 0; i < tankKilometers.length; i++) {
            System.out.printf("%.0f", tankKilometers[i]);
            if (i < tankKilometers.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("] --> ");
        System.out.print(average);
    }

    private static double[] input(Scanner scanner) {
        double[] tankKilometers = new double[4];

        for (int i = 0; i < tankKilometers.length; i++) {
            System.out.print(i + 1 + ": Tankwert: ");
            tankKilometers[i] = scanner.nextInt();
        }
        return tankKilometers;
    }

    private static double average(double[] tankKilometer) {
        double average = 0;
        double tankKilometerSum = 0;

        for (int i = 0; i < tankKilometer.length; i++) {
            tankKilometerSum += tankKilometer[i];
        }

        average = tankKilometerSum / tankKilometer.length;
        return average;
    }


}
