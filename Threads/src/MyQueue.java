import java.util.Queue;

public class MyQueue<T> {
    private int n;
    private Queue<T> que;
    boolean valueSet = false;

    public synchronized Queue<Integer> get() {
        while (!valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //System.out.println("Пoлyчeнo: " + n);
        System.out.println("Пoлyчeнo: " + que);
        valueSet = false;
        notify();
        return (Queue<Integer>) que;
    }

    public synchronized void put(Queue que) {
        while (valueSet) {
            try {
                wait();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        valueSet = true;
        this.que = que;
        System.out.println("Oтпpaвлeнo: " + que);
        notify();
    }


}