import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import HW.Task1;
import HW.Task2;

public class App {
    public static void main(String[] args) throws Exception {
        // task1();
        // task2();

    }

    private static void task2() {
        int[] array = { 5, 6, 3, 6, 7, 3, 7, 8, 45, 3 };
        Task2.heapSort(array, array.length);
    }

    private static void task1() {

        System.out.println("Сколько контактов будет в книге? ");
        Scanner iScanner = new Scanner(System.in);
        int sizePhoneBook = Integer.parseInt(iScanner.nextLine());
        String[] phones = Task1.inputPhones(sizePhoneBook); // {"Иванов 772733","Сидоров 123312","Сидоров 12333","Петров
                                                            // 123"}; //
        HashMap<String, List<Integer>> book = Task1.generatePb(phones);
        System.out.println("Полный список контактов ниже:");
        Task1.printPb(book);
        iScanner.close();
    }
}
