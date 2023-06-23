import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

import CatPackage.Cat;

public class App {
    public static void main(String[] args) throws Exception {
        // task();
        SimpleDateFormat formater = new SimpleDateFormat("EEE, MMMM D, yyyy", Locale.ENGLISH);
        Cat myCat = new Cat(2000, "Барсик", 245, formater.parse("Sat, April 4, 1999"), false, 1);
        Cat yourCat = new Cat(2050, "Рыжий", 248, formater.parse("Sat, April 4, 1992"), false, 2);
        HashSet<Cat> catSet = new HashSet<Cat>();
        catSet.add(yourCat);
        catSet.add(myCat);
        System.out.println(myCat);
        System.out.println(yourCat);
        System.out.println(myCat.equals(yourCat));
        System.out.println(catSet.contains(yourCat));
        
    }

    private static void task() {
        int[] randomArray = OriginNumFinder.Finder.getRandomArray(1000);
        Set<Integer> randomSet = OriginNumFinder.Finder.uniques(randomArray);
        System.out.println(OriginNumFinder.Finder.percenter(randomArray, randomSet));
    }

}
