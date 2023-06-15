package Tasks;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Task2 {
    public static ArrayList<Integer> generateArray() {
        Random rd = new Random();
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            arrayList.add(rd.nextInt(1, 20));
        }
        return arrayList;
    }

    public static ArrayList<Integer> deleteEven(ArrayList<Integer> array) {

        Set<Integer> delList = new HashSet<>();
        for (Integer num : array) {
            if (num % 2 == 0) {
                delList.add(num);
            }
        }
        array.removeAll(delList);
        return array;
    }
}
