package HashMapTest;
import java.util.HashMap;
import java.util.Map;

public class Test {
    public static HashMap<Integer, String> fill() {
        HashMap<Integer, String> outMap = new HashMap<>();
        outMap.put(123456, "Иванов");
        outMap.put(321456, "Васильев");
        outMap.put(654321, "Петрова");
        return outMap;
    }

    public static void printHM(HashMap<Integer, String> map, String value) {

        for (Map.Entry<Integer, String> item : map.entrySet()) {
            if (item.getValue()==value) {
                System.out.println(item.getKey() + " " + item.getValue());
            }
        }
    }
}
