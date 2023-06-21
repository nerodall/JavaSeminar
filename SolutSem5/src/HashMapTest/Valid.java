package HashMapTest;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashMap;

public class Valid {
    public static boolean validation(HashMap<String, Integer> openBr, HashMap<String, Integer> closeBr, String line) {
        Deque<String> stack = new ArrayDeque<>();
        for (int i = 0; i < line.length(); i++) {
            char bufChar = line.charAt(i);
            String symbol = Character.toString(bufChar);
            if (openBr.containsKey(symbol)) {
                stack.push(symbol);
            } else if (closeBr.containsKey(symbol)) {
                if (!stack.isEmpty()) {
                    Integer v1 = closeBr.get(symbol);
                    String last = stack.pop();
                    Integer v2 = openBr.get(last);
                    if (!v1.equals(v2)) {
                        return false;
                    } else {
                        return false;
                    }
                }
                return false;
            }
        }
        return true;
    }
}
