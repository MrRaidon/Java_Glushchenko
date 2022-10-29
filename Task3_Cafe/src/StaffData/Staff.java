package StaffData;

import java.io.Serializable;

public abstract class Staff implements Serializable {
    public Integer id;
    public String name;

    public Staff(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public abstract Double getMonthPayment();

    public String toString() {
        return "Номер:" + id + " - Имя: " + name + " - Зарплата: " + this.getMonthPayment() + "\n";
    }
}
