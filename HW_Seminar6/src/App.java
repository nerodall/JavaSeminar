import java.util.HashSet;

import Store.Laptop;

public class App {
    public static void main(String[] args) throws Exception {

        // добавляем экземпляры класса
        Laptop firstL = new Laptop("Lenovo", "x61", 8, 256, null, "black", 0);
        Laptop secondL = new Laptop("MSI", "x500", 32, 1024, null, "red", 1);
        Laptop thirdL = new Laptop("HP", "1298", 4, 128, null, "white", 2);
        Laptop fourthL = new Laptop("Lenovo", "x61", 8, 256, null, "black", 3);

        // создаем набор и добавляем экземпляры
        HashSet<Laptop> storeCell = new HashSet<>();
        storeCell.add(firstL);
        storeCell.add(secondL);
        storeCell.add(secondL);
        storeCell.add(thirdL);
        storeCell.add(fourthL);

        // Поиск элемента в наборе и вывод при нахождении совпадений
        Store.Laptop.searchLaptop(storeCell, "HP");

        // Печать экземпляра класса
        System.out.println(firstL);

        // Сравнение нескольких элементов, в расчет не берется id
        System.out.println(firstL.equals(secondL));
        System.out.println(firstL.equals(fourthL));

        //Печать HashCode элементов в наборе
        System.out.println();
        Store.Laptop.prntHash(storeCell);
        //Печать всего множества
        System.out.println();
        System.out.println(storeCell);

    }

}
