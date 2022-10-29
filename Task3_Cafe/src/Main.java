
import Cafe.Cafe;
import StaffData.FixedPaymentStaff;
import StaffData.HourPaymentStaff;
import StaffData.Staff;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Main {

    public static void main(String[] args) {

        Cafe cafe = new Cafe();
        cafe.run();

        System.out.println("Задание 2");
        List<Staff> staff = new ArrayList<>();
        staff.add(new FixedPaymentStaff(11, "Иван", 25.2));
        staff.add(new FixedPaymentStaff(12, "Илья", 20.3));
        staff.add(new FixedPaymentStaff(13, "Игорь", 26.1));
        staff.add(new FixedPaymentStaff(14, "Валерий", 65.0));
        staff.add(new HourPaymentStaff(15, "Никита", 4.5));
        staff.add(new HourPaymentStaff(16, "Георгий", 6.2));
        staff.add(new HourPaymentStaff(17, "Павел", 7.5));

        System.out.println("Расчета среднемесячной зарплаты");
        staff.sort((o1, o2) -> {
            if (Objects.equals(o1.getMonthPayment(), o2.getMonthPayment())) {
                return o1.name.compareTo(o2.name);
            }
            return o2.getMonthPayment().compareTo(o1.getMonthPayment());
        });
        System.out.println(staff);
        // b)
        System.out.println("Почасовщики");
        for (int i = 0; i < 5; i++) {
            System.out.println(staff.get(i).name);
        }
        // c)
        System.out.println("Фиксированная ЗП");
        for (int i = staff.size() - 1; i > staff.size() - 4; i--) {
            System.out.println(staff.get(i).id);
        }

        System.out.println("Последовательность и чтение/запись");
        List<Staff> staffs_list;
        try { // обработка некоректного формата входного файла
            FileInputStream fis = new FileInputStream("StaffsList");
            ObjectInputStream ois = new ObjectInputStream(fis);
            staffs_list = (List<Staff>) ois.readObject();
            System.out.println(staffs_list);
            ois.close();
            fis.close();
        } catch (IOException | ClassNotFoundException ioe) {
            ioe.printStackTrace();
        }

    }
}
