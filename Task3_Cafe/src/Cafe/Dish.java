package Cafe;

import java.util.ArrayList;

public class Dish {
    public String name;
    public Integer price;
    public String unit;
    public ArrayList<String> composition;

    public Dish(String name, Integer price, String unit, ArrayList<String> composition) {
        this.name = name;
        this.price = price;
        this.unit = unit;
        this.composition = composition;
    }

    public String toString() {
        return "Блюдо " + this.name + " по цене " + this.price +
                "\nСостав " + this.composition;
    }
}
