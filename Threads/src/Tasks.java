
import java.util.Scanner;

public class Tasks {
    Scanner scanner;
    Tasks() {
        this.scanner = new Scanner(System.in);
    }
    public void start() {
        
        System.out.println("1 - Задание 1");
        System.out.println("2 - Задание 2");
        System.out.println("3 - Задание 3");
        System.out.println("4 - Задание 4");
        System.out.println("0 - Выход");

        switch (this.scanner.nextLine()) {
            case "1": {
                 this.Task1();
                break;
            }
            case "2": {
                this.Task2();
                break;

            }
            case "3": {
                this.Task3();
                break;
            }
            case "4": {
                this.Task4();
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

    public void Task1() {
        System.out.println("Задание 1");

        NewThread tread = new NewThread("5");
        tread.start();

    }
    public void Task2() {
        System.out.println("Задание 2");

        RunnableForPrint thr1 = new RunnableForPrint();
        RunnableForPrint thr2 = new RunnableForPrint();
        RunnableForPrint thr3 = new RunnableForPrint();
        thr1.run();
        thr2.run();
        thr3.run();
    }
    public void Task3() {
        System.out.println("Задание 3");
        StringBuilder builder = new StringBuilder();
        builder.append('a');
        ThreadForOneSymbol t1 = new ThreadForOneSymbol(builder);
        t1.start();
        ThreadForOneSymbol t2 = new ThreadForOneSymbol(builder);
        t2.start();
        ThreadForOneSymbol t3 = new ThreadForOneSymbol(builder);
        t3.start();
    }
    public void Task4() {
        MyQueue myQueue = new MyQueue();

        Consumer consumer = new Consumer(myQueue);
        Consumer consumer2 = new Consumer(myQueue);
        Producer producer = new Producer(myQueue);

        Thread t1 = new Thread(consumer);
        Thread t2 = new Thread(producer);
        Thread t3 = new Thread(consumer2);

        t1.start();
        t3.start();
        t2.start();
    }
    }