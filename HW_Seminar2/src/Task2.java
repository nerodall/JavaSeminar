import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Task2 {
    public static int[] bubbleSort(int[] array) throws SecurityException, IOException {
        StringBuilder sb = new StringBuilder();
        for (int j = 0; j < array.length - 1; j++) {

            for (int i = 0; i < array.length - 1; i++) {

                if (array[i] > array[i + 1]) {
                    int temp = array[i];
                    array[i] = array[i + 1];
                    array[i + 1] = temp;

                }
                sb.append(writeArray(array) + "\n");

            }
        }
        writeArrayToFile(sb.toString());
        return array;
    }

    public static void showArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void writeArrayToFile(String array) throws IOException {
        try (PrintWriter pw = new PrintWriter(new FileWriter("Task2Log.txt"))) {
            pw.println(array);
        }
    }

    public static String writeArray(int[] array) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < array.length; i++) {
            sb.append(Integer.toString(array[i]) + " ");
        }

        String result = sb.toString();
        return result;
    }

}
