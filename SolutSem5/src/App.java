import java.util.HashMap;
import java.util.TreeMap;

import HashMapTest.Test;
import HashMapTest.Valid;
import TreeMapTest.Task;

public class App {
    public static void main(String[] args) throws Exception {

        /// 1
        // HashMap<Integer, String> map = Test.fill();
        // Test.printHM(map,"Иванов");

        // HashMap<String, Integer> open = new HashMap<>();
        // HashMap<String, Integer> close = new HashMap<>();
        // open.put("(", 0);
        // open.put("[", 1);
        // open.put("{", 2);
        // open.put("<", 3);

        // close.put(")", 0);
        // close.put("]", 1);
        // close.put("}", 2);
        // close.put(">", 3);

        /// 2
        // System.out.println(Valid.validation(open, close, "a+(d*3)"));
        // System.out.println(Valid.validation(open, close, "[a+(1*3)"));
        // System.out.println(Valid.validation(open, close, "[6+(3*3)]"));
        // System.out.println(Valid.validation(open, close, "{a}[+]{(d*3)}"));
        // System.out.println(Valid.validation(open, close, "<{a}+{(d*3)}>"));
        // System.out.println(Valid.validation(open, close, "{a+]}{(d*3)}"));

        ///// 3

        String line = "Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись";
        String[] sLine = line.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : sLine) {
            map.put(s, s.length());
        }

        TreeMap sortMap = TreeMapTest.Task.sortHashMap(map);
        sortMap.entrySet().forEach(System.out::println);
    }
}
