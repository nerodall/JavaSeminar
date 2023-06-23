package OriginNumFinder;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Finder {
    public static int[] getRandomArray(int size) {
        int[] mylist = new int[size];
        Random r = new Random();
        for (int i = 0; i < size; i++) {
            mylist[i] = r.nextInt(0, 24);// заполняем линклист случайными значениями в диапазоне,
            // но вообще можно заполнить любым типом, мне инты нравятся больше всего
        }

        return mylist;

    }

    public static Set<Integer> uniques(int[] array) {
        Set<Integer> uniques = new HashSet<>();
        for (Integer integer : array) {
            uniques.add(integer);
        }
        return uniques;
    }

    public static double percenter(int[] array, Set<Integer> uniques) {
        double percent =(double) uniques.size() * 100 /(double) array.length;
        return percent;
    }
}
