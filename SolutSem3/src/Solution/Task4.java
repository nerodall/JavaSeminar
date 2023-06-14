package Solution;

import java.util.ArrayList;
import java.util.List;

public class Task4 {
    public static void libList(){
        List<List<String>> library = new ArrayList<>();
        List<String> gList = new ArrayList<>();
        gList.add("Проза");
        gList.add("Стругацкий");
        gList.add("Толстой");

                List<String> gList2 = new ArrayList<>();
        gList2.add("Роман");
        gList2.add("Каренина");
library.add(gList);
        library.add(gList2);
        System.out.println(library);
    }
}
