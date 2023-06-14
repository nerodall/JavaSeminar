package Solution;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task2 {
    
    public static void planetArray(){
        String[] pl = {"Меркурий","Венера","Венера","Марс","Земля","Юпитер","Сатурн","Уран","Нептун"};
        List <String> plList = Arrays.asList(pl);
        System.out.println(plList);
        Set<String> plSet = new HashSet<>(plList);
        for(String plan: plSet){
            System.out.println(plan + " " + Collections.frequency(plList,plan));
        }
    }
}
