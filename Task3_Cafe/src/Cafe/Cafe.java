package Cafe;

import java.util.*;

public class Cafe {
    private final ArrayList<Dish> MenuKitchen;
    private final ArrayList<Dish> MenuBar;
    private final Map<Dish, String> StopList;
    private final ArrayList<Order> orders;
    private final Scanner in;

    public Cafe() {
        this.MenuKitchen = new ArrayList<>();
        this.MenuBar = new ArrayList<>();
        this.StopList = new HashMap<>();
        this.orders = new ArrayList<>();
        this.in = new Scanner(System.in);
    }

    public void run() {
        while (true) {
            System.out.println("///////////////////////////");
            System.out.println("Выберите действие");
            System.out.println("1) Создать блюдо и добавить его в меню");
            System.out.println("2) Удалить блюдо из меню");
            System.out.println("3) Создать заказ");
            System.out.println("3) Добавить блюдо в исключение");
            System.out.println("5) Убрать блюдо из исключения");
            System.out.println("6) Изменить статус заказа");
            System.out.println("7) Информация");
            System.out.println("8) Выйти и перейти к заданию 2");
            String input = in.nextLine();
            switch (input) {
                case "1" -> {
                    this.createDish();
                }
                case "2" -> {
                    this.deleteDish();
                }
                case "3" -> {
                    this.createOrder();
                }
                case "4" -> {
                    this.removeDishFromStopList();
                }
                case "5" -> {
                    this.addDishToStopList();
                }
                case "6" -> {
                    this.changeOrderStatus();
                }
                case "7" -> {
                    this.printAllInfo();
                }
                case "8" -> {
                    return;
                }
            }
        }

    }

    private void createDish() {
        String name, unit, partCompos;
        ArrayList<String> composition = new ArrayList<>();
        Integer price;
        System.out.println("///////////////////////////");
        System.out.println("Создайте блюдо ");
        System.out.println("Введите название ");
        name = in.nextLine();
        System.out.println("Количество ");
        unit = in.nextLine();
        System.out.println("Цена ");
        price = in.nextInt();
        while (true) {
            System.out.println("Введите состав, 0 для выхода");
            partCompos = in.nextLine();
            if (Objects.equals(partCompos, "0")) break;
            composition.add(partCompos);
        }
        while (true) {
            String input = this.selectMenu();
            if (Objects.equals(input, "1")) {
                this.MenuKitchen.add(new Dish(name, price, unit, composition));
                break;
            } else if (Objects.equals(input, "2")) {
                this.MenuBar.add(new Dish(name, price, unit, composition));
                break;
            } else if (Objects.equals(input, "3")) {
                break;
            }

        }

    }

    private void deleteDish() {
        System.out.println("///////////////////////////");
        System.out.println("Удалить блюдо");
        while (true) {
            String input = this.selectMenu();
            if (Objects.equals(input, "1")) {
                System.out.println("Меню кухни:");
                for (Dish d : this.MenuKitchen) {
                    System.out.println(this.MenuKitchen.indexOf(d) + ") " + d);
                }
                System.out.println("Номер в меню");
                this.MenuKitchen.remove(in.nextInt());
                break;
            } else if (Objects.equals(input, "2")) {
                System.out.println("Меню бара:");
                for (Dish d : this.MenuBar) {
                    System.out.println(this.MenuBar.indexOf(d) + ") " + d);
                }
                System.out.println("Номер в баре");
                this.MenuBar.remove(in.nextInt());
                break;
            } else if (Objects.equals(input, "3")) {
                break;
            }
        }
    }

    private void addDishToStopList() {
        System.out.println("///////////////////////////");
        System.out.println("Добавить блюдо в исключение");
        while (true) {
            String input = this.selectMenu();
            if (Objects.equals(input, "1")) {
                System.out.println("Меню кухни");
                for (Dish d : this.MenuKitchen) {
                    System.out.println(this.MenuKitchen.indexOf(d) + ") " + d);
                }
                System.out.println("Введите номер в меню");
                Dish dish = this.MenuKitchen.get(in.nextInt());
                System.out.println("Причина");
                this.StopList.put(dish, in.nextLine());
                break;
            } else if (Objects.equals(input, "2")) {
                System.out.println("Меню бара:");
                for (Dish d : this.MenuBar) {
                    System.out.println(this.MenuBar.indexOf(d) + ") " + d);
                }
                System.out.println("Введите номер в меню");
                Dish dish = this.MenuBar.get(in.nextInt());
                System.out.println("Причина");
                this.StopList.put(dish, in.nextLine());
                break;
            } else if (Objects.equals(input, "3")) {
                break;
            }
        }
    }

    private void removeDishFromStopList() {
        System.out.println("///////////////////////////");
        System.out.println("Убрать блюдо из исключения");
        ArrayList<Dish> temp = new ArrayList<>();
        int i = 0;
        while (true) {
            for (Map.Entry<Dish, String> entry : this.StopList.entrySet()) {
                System.out.println(i + ") " + entry.getKey() + " for reason " + entry.getValue());
                temp.add(entry.getKey());
                i++;
            }
            System.out.println("Введите номер в меню");
            this.StopList.remove(temp.get(in.nextInt()));
        }
    }

    private String selectMenu() {
        System.out.println("Какое меню вы хотите использовать?");
        System.out.println("1) Кухня");
        System.out.println("2) Бар");
        System.out.println("3) Не выбирать");
        return in.nextLine();
    }

    private boolean dishInStopList(Dish dish) {
        for (Map.Entry<Dish, String> entry : this.StopList.entrySet()) {
            if (Objects.equals(entry.getKey().name, dish.name)) {
                return true;
            }
        }
        return false;
    }


    public void createOrder() {
        System.out.println("///////////////////////////");
        System.out.println("Создать заказ");
        System.out.println("Выберите столик");
        Order newOrder = new Order(in.nextLine());
        while (true) {
            String input = this.selectMenu();
            if (Objects.equals(input, "1")) {
                System.out.println("Меню кухни");
                for (Dish d : this.MenuKitchen) {
                    System.out.println(this.MenuKitchen.indexOf(d) + ") " + d);
                }
                System.out.println("Введите номер в меню");
                Dish dish = this.MenuKitchen.get(in.nextInt());
                if (this.dishInStopList(dish)) {
                    System.out.println("Блюдо в исключении");
                    break;
                }
                System.out.println("Введите количество блюд");
                newOrder.addDishToOrder(dish, in.nextInt());
            } else if (Objects.equals(input, "2")) {
                System.out.println("Меню бара:");
                for (Dish d : this.MenuBar) {
                    System.out.println(this.MenuBar.indexOf(d) + ") " + d);
                }
                System.out.println("Введите номер в меню");
                Dish dish = this.MenuBar.get(in.nextInt());
                if (this.dishInStopList(dish)) {
                    System.out.println("Блюдо в исключении");
                    break;
                }
                System.out.println("Введите количество блюд");
                newOrder.addDishToOrder(dish, in.nextInt());
            } else if (Objects.equals(input, "3")) {
                break;
            }
        }
    }

    public void changeOrderStatus() {
        System.out.println("///////////////////////////");
        System.out.println("Изменить статус заказа");
        System.out.println("Выберите заказ");
        for (Order o: this.orders) {
            System.out.println(this.orders.indexOf(o) + ") " + o);
        }
        System.out.println("Введите номер в меню");
        Order order = this.orders.get(in.nextInt());
        System.out.println("Новый статус (1-4)");
        System.out.println(Arrays.toString(OrderStatus.values()));
        order.changeOrderStatus(OrderStatus.values()[in.nextInt()]);
    }
    public void printAllInfo() {
        System.out.println("Информация");
        System.out.println("Заказы:");
        for (Order o: this.orders) {
            System.out.println(this.orders.indexOf(o) + ") " + o);
        }
        System.out.println("Меню кухни");
        for (Dish d: this.MenuKitchen) {
            System.out.println(this.MenuKitchen.indexOf(d) + ") " + d);
        }
        System.out.println("Меню бара:");
        for (Dish d: this.MenuBar) {
            System.out.println(this.MenuBar.indexOf(d) + ") " + d);
        }
        System.out.println("Исключения:");
        for (Map.Entry<Dish, String> entry : this.StopList.entrySet()) {
            System.out.println(entry.getKey().name + "добавлено из-за " + entry.getValue());

        }
    }
}
