import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        // task1();

        // task2();

        // task3();

        // task5();

        // task8();

    }

    private static void task1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите число ");
        int number = Integer.parseInt(iScanner.nextLine());
        int result = sumNumbers(number);
        System.out.println("Сумма чисел от 0 до " + number + " = " + result);
        System.out.println();
    }

    private static void task2() {
        System.out.println("Список простых чисел");
        for (int i = 2; i <= 1000; i++) {
            if (primeTest(i)) {
                System.out.print(" " + i);
            }
        }
        System.out.println();
    }

    private static void task3() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int num1 = Integer.parseInt(iScanner.nextLine());
        System.out.println("Введите арифметическую операцию +,-,*,/");
        String action = iScanner.nextLine();
        System.out.println("Введите второе число");
        int num2 = Integer.parseInt(iScanner.nextLine());
        int result = calculator(num1, num2, action);
        System.out.println("Результат " + result);
        System.out.println();
    }

    private static void task8() {
        int[] array = { 1, 7, 3, 6, 5, 6 };
        int index = 1;
        while (lowSum(array, index) < hightSum(array, index)) {
            index++;
        }
        if (lowSum(array, index) == hightSum(array, index)) {
            System.out.println(index);
        } else {
            System.out.println(-1);
        }
        System.out.println();
    }

    private static int hightSum(int[] mas, int index) {
        int result = 0;
        for (int i = mas.length - 1; i > index; i--) {
            result += mas[i];
        }
        return result;
    }

    private static int lowSum(int[] mas, int index) {
        int result = 0;
        for (int i = 0; i < index; i++) {
            result += mas[i];
        }

        return result;
    }

    private static void task5() {

        String myString = "Добро пожаловать на курс по Java";
        System.out.println(myString);
        String[] stringArray = myString.split(" ");
        String resultString = "";
        for (int i = stringArray.length - 1; i >= 0; i--) {
            resultString = resultString + stringArray[i] + " ";
        }
        System.out.println(resultString);

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

    private static int sumNumbers(int number) {

        int result = 0;
        for (int i = result; i < number; i++) {
            result += i;
        }

        return result;

    }

}
