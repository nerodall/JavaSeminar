import java.util.Scanner;

import javax.naming.spi.DirStateFactory.Result;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner iScanner = new Scanner(System.in);

        // task1 start

        // System.out.println("Введите число ");
        // int number = Integer.parseInt(iScanner.nextLine());
        // int result = task1(number);
        // System.out.println("Сумма чисел от 0 до " + number + "= " + result);

        // task2 start

        // System.out.println("Список простых чисел");
        // for (int i = 2; i <= 1000; i++) {
        // if (primeTest(i)) {
        // System.out.print(" " + i);
        // }
        // }

        // task3 start
        
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(iScanner.nextLine());
        System.out.println("Введите арифметическую операцию +,-,*,/");
        String action = iScanner.nextLine();
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(iScanner.nextLine());
        int result = calculator(num1, num2, action);
        System.out.println("Результат " + result);

    }

    private static int calculator(int num1, int num2, String action) {
        int result = 0;
        switch (action) {
            case ("+"):
                result = num1 + num2;
                break;
            case ("-"):
                result = num1 - num2;
                break;
            case ("*"):
                result = num1 * num2;
                break;
            case ("/"):
                result = num1 / num2;
                break;
            default:
                result = 0;
        }
        return result;
    }

    private static boolean primeTest(int number) {
        boolean result = true;
        for (int i = 2; i < 1000; i++) {
            if (number >= i && number % i == 0) {
                if (i != number) {
                    result = false;
                    break;
                }

            }
        }

        return result;
    }

    private static int task1(int number) {

        int result = 0;
        for (int i = result; i < number; i++) {
            result += i;
        }

        return result;

    }

}
