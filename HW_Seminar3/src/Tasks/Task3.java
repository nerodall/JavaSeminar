package Tasks;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void maxElemenOfArray(ArrayList<Integer> array){
        System.out.println("Максимальное значение " + Collections.max(array));
    }

        public static void minElemenOfArray(ArrayList<Integer> array){
        System.out.println("Минимальное значение " +Collections.min(array));
    }

    public static void middleElementofArray(ArrayList<Integer> array){
        double sum = 0 ;
        for(int item: array){
            sum +=item;
        }
        sum = sum /array.size(); 
        System.out.println("Среднее значение " + sum);
    }
}
