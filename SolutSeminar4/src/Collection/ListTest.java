package Collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListTest {
    public static void TimeTest(int size) {
        List<Integer> simpleList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();
        long currentTime = System.currentTimeMillis();

        currentTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            simpleList.add(1);
        }
        System.out.println("Простой список " + (System.currentTimeMillis()-currentTime));
        currentTime = System.currentTimeMillis();
        for (int i = 0; i < size; i++) {
            linkedList.add(1);
        }
        System.out.println("Связанный список список " + (System.currentTimeMillis()-currentTime));
    }
}
