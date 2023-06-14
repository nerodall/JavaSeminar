package Solution;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Task1 {
    public static void generateList() {
        Random rnd = new Random();
        List<Integer> numL = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            numL.add(rnd.nextInt(1, 10));
        }
        System.out.println(numL);
        Collections.sort(numL);
        System.out.println(numL);
    }
}
