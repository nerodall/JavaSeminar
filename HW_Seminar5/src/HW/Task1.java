package HW;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;
import java.util.Map.Entry;

public class Task1 {
    public static HashMap<String, List<Integer>> generatePb(String[] phoneBookUnsorted) {
        HashMap<String, List<Integer>> pb = new HashMap<String, List<Integer>>();

        for (String s : phoneBookUnsorted) {
            String[] sP = s.split(" ");
            if (!pb.containsKey(sP[0])) {
                List<Integer> pL = new ArrayList<Integer>();
                pL.add(Integer.parseInt(sP[1]));
                pb.put(sP[0], pL);
            } else {
                pb.get(sP[0]).add(Integer.parseInt(sP[1]));
            }
        }
        return pb;
    }

    public static String[] inputPhones(int size) {
        Scanner iScanner = new Scanner(System.in, "Cp866");
        String[] result = new String[size];
        for (int i = 0; i < result.length; i++) {
            System.out.println("Введите контакт №" + (i + 1));
            result[i] = iScanner.nextLine();
        }
        iScanner.close();
        return result;
    }

    public static void printPb(HashMap<String, List<Integer>> pb) {
        for (Entry<String, List<Integer>> item : pb.entrySet()) {

            System.out.println(item.getKey() + " " + item.getValue().toString().replaceAll("^\\[|\\]$", ""));
        }
    }
}
