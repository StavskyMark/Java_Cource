package OOP_Java.seminar1_homework;

import java.util.ArrayList;
import java.util.List;

public class Hot_drink_machine implements machine {

    private final List<hot_drink> list;

    public Hot_drink_machine() {
        list = new ArrayList<>();
    }

    public void addDrink(drink drink) {
        list.add((hot_drink) drink);
    }

    public drink getDrink(String name) {
        for (drink product : list) {
            if (name.equals(product.getName())) {
                return product;
            }
        }
        return null;
    }

    public hot_drink getDrink(String name, Integer volume, Integer temp) {
        for (hot_drink product : list) {
            if (name.equals(product.getName())
                    && volume.equals(product.getVolume())
                    && temp.equals(product.getTemp())) {
                return product;
            }
        }
        return null;
    }

    public hot_drink getDrink(String name, Integer volume) {
        for (hot_drink product : list) {
            if (name.equals(product.getName())
                    && volume.equals(product.getVolume())) {
                return product;
            }
        }
        return null;
    }

}