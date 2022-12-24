import java.util.ArrayList;
import java.util.Scanner;

public class Restourant {
    ArrayList<Order> orders;
    ArrayList<String> delishies;
    int id_table;
    int usage_table;
    Scanner scanner;

    Restourant() {
        this.orders = new ArrayList<>();
        this.delishies = new ArrayList<>();
        this.id_table = 0;
        this.usage_table = 0;
        this.scanner = new Scanner(System.in);
    }

    public void start() {
        while (true) {
            System.out.println("1 - Выбрать столик");
            System.out.println("2 - Добавить заказ");
            System.out.println("3 - Расчитать столик");
            System.out.println("0 - Выход");

            switch (this.scanner.nextLine()) {
                case "1": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.usage_table =  this.chooseTable();
                    break;
                }
                case "2": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.createOrder();
                    break;
                }
                case "3": {
                    System.out.println("//////////////////////////////////////////////////////");
                    this.closeTable();
                    break;
                }
                case "0": {
                    return;
                }
                default: {
                    System.out.println("Вы ввели неверную цифру");
                    break;
                }
            }
        }
    }

    private int chooseTable() {
        System.out.println("Введите номер столика");
        try {
            return Integer.parseInt(this.scanner.nextLine());
        } catch (NumberFormatException nfe) {
            System.out.println("Неверный ввод номера столика");
        }
        return 0;
    }

    public void createOrder() {
        System.out.println("Введите название блюда, для выхода нажмите 0:");
        String delishies = "";
        Integer summa = 0;
        Boolean flag = true;
        while (flag) {
            delishies = this.scanner.nextLine();
            if (delishies.equals("Суп")) {
                summa += 2000;
            } else if (delishies.equals("Салат")) {
                summa += 1000;
            } else if (delishies.equals("Компот")) {
                summa += 500;
            } else if (delishies.equals("12")) {
                summa += 1000;
                flag = false;
            }
            System.out.println(delishies);
            this.delishies.add(delishies);
        }
        this.orders.add(new Order(summa, this.usage_table, this.delishies, false));
        //this.orders.add(new Order(summa, this.usage_table, delishies, false));

        System.out.println("Задание добавлено");
    }

    public void closeTable() {
        System.out.println("Заказы:");
        for (Order ord : this.orders) {
            if (ord.table_number == this.usage_table) {
                System.out.println("Сумма заказа " + ord.summa + " Блюда: " + ord.delish);
                ord.Free = true;
            }
        }
    }

}
