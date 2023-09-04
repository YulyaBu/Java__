package Numbers;

import java.util.Scanner;

public class Numbers2 {

    public static void main(String[] args) {

        int i = 0;
        int sum = 0;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int n = scanner.nextInt();

        while (n != 0) {
            sum += (n % 10);
            n /= 10;
        }
        System.out.println("Сумма цифр числа: " + sum + " ");


    }
}
