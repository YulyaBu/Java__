package Average;

import java.util.Scanner;

public class Average {

    public static void main(String[] args) {

        int a = 3;
        int b = 15;

        double average = getAverage(a, b);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Значение 1: ");
        String name = scanner.nextLine();

        System.out.println("Значение 2: ");
        String name2 = scanner.nextLine();

        System.out.println("Average.Average = " + getAverage(a, b));

    }
    public static double getAverage(int a, int b) {

        return (double) (a + b ) / 2;

    }

}
