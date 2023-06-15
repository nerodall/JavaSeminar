import java.util.ArrayList;
import java.util.Arrays;

import Tasks.Task1;
import Tasks.Task2;
import Tasks.Task3;

public class App {
    public static void main(String[] args) throws Exception {

        task1();
        task2();
        task3();

    }

    private static void task2() {
        ArrayList<Integer> array = new ArrayList<>();
        array = Task2.generateArray();
        System.out.println("Исходный массив " + array);
        array = Task2.deleteEven(array);
        System.out.println("Удалены все четные элементы " + array);

    }

    private static void task3() {
        ArrayList<Integer> array = new ArrayList<>();
        array.add(1);
        array.add(3);
        array.add(4);
        array.add(10);
        array.add(9);

        Task3.maxElemenOfArray(array);
        Task3.minElemenOfArray(array);
        Task3.middleElementofArray(array);
    }

    private static void task1() {
        int[] sortArr = { 12, 6, 4, 1, 15, 10 };
        int[] result = Task1.mergeSort(sortArr);
        System.out.println(Arrays.toString(result));
    }

}
