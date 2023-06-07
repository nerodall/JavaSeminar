import java.time.LocalTime;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        String[] lines = { "домк", "домовой", "домашний" };
        // task2();
        // task1();
        // task3();
        // task4();
        int result = finePefix(lines);
        System.out.println(result);
    }

    

    private static int finePefix(String[] lines) {
        int res = 0;
        boolean prfExist = true;
        while (prfExist) {
            res++;
            for (int i = 0; i < lines.length-1; i++) {
                if (lines[i].substring(0, res).compareTo(lines[i + 1].substring(0, res)) != 0) {
                    res--;
                    prfExist = false;
                    break;

                }
            }

        }

        return res;
    }

    private static void task4() {
        int[] mass = { 1, 1, 0, 3, 1, 3, 0, 1, 0, 3 };
        int[] resultMass = new int[mass.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] != 3) {
                resultMass[index++] = mass[i];

            } else {
                count++;
            }
        }
        for (int i = resultMass.length - count; i < resultMass.length; i++) {
            resultMass[i] = 3;
        }

        for (int i = 0; i < resultMass.length; i++) {
            System.out.print(resultMass[i] + " ");
        }
    }

    private static void task3() {
        int[] mass = { 1, 1, 0, 1, 1, 1 };
        int count = 0;
        int maxCount = 0;
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] == 1) {
                count++;
            } else {
                if (maxCount < count) {
                    maxCount = count;
                    count = 0;
                }
                if (maxCount < count) {
                    maxCount = count;
                }

            }

        }
        System.out.println(count);
    }

    private static void task2() {
        LocalTime timeOfDay = LocalTime.now();
        System.out.println(timeOfDay);
        if (timeOfDay.getHour() >= 18 && timeOfDay.getHour() < 23) {
            System.out.println("Добрый вечер");
        }
    }

    private static void task1() {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = iScanner.nextLine();
        System.out.println("Hello," + name);
    }
}
