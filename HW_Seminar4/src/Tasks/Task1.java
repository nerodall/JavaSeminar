package Tasks;

import java.util.LinkedList;

public class Task1 {
    public static void Task (LinkedList<String> list)
    {
        System.out.println("Исходная очередь " + list);
        enqueue(list,"bbb");
        System.out.println("Добавлен новый элемент в конец " + list);
        dequeue(list);
        System.out.println("Удален первый элемент " + list);
        System.out.println("Первый элемент в очереди " + first(list));

    }
    private static void enqueue(LinkedList<String> list, String element){
        list.add(element);
    }
    private static void dequeue(LinkedList<String> list){
        System.out.println(list.get(0));
        list.remove(0);
    }

    private static String first(LinkedList<String> list){
        String result = list.get(0);
        return result;
    }
}
