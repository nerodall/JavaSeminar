package Store;

import java.util.HashSet;
import java.util.Objects;

public class Laptop {
    public String brand;
    public String model;
    public long ram;
    public long memory;
    public String operationSystem;
    public String color;
    public int id;

    public Laptop(String brand, String model, long ram, long memory, String operationSystem, String color, int id) {
        this.brand = brand;
        this.model = model;
        this.ram = ram;
        this.memory = memory;
        this.operationSystem = operationSystem;
        this.color = color;
        this.id = id;
    }

    public static void searchLaptop(HashSet<Laptop> set, String serchingObject) {

        for (Object item : set) {
            if (item.toString().contains(serchingObject)) {
                System.out.println("Обнаружено совпадение");
                System.out.println(item);
            }
        }

    }

    public static void prntHash(HashSet<Laptop> set) {
        for (Object item: set){
            System.out.println(item.hashCode());
        }
    }

    @Override
    public String toString() {
        return "Laptop: \nbrand-" + brand + "\nmodel-" + model + "\nram-" + ram + "\nmemory-" + memory
                + "\noperationSystem-" + operationSystem + "\ncolor-" + color + "\nid-" + id + "\n";
    }

    @Override
    public int hashCode() {
        return Objects.hash(brand, model, ram, memory, operationSystem, color, id);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (brand == null) {
            if (other.brand != null)
                return false;
        } else if (!brand.equals(other.brand))
            return false;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (ram != other.ram)
            return false;
        if (memory != other.memory)
            return false;
        if (operationSystem == null) {
            if (other.operationSystem != null)
                return false;
        } else if (!operationSystem.equals(other.operationSystem))
            return false;
        if (color == null) {
            if (other.color != null)
                return false;
        } else if (!color.equals(other.color))
            return false;
        return true;
    }
}
