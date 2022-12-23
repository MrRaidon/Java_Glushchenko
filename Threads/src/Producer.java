import java.util.LinkedList;
import java.util.Queue;

public class Producer implements Runnable {
    private MyQueue myQueue;

    public Producer(MyQueue myQueue) {
        this.myQueue = myQueue;
    }

    @Override
    public void run() {
        int i=0;
        while (true) {
            Queue<Integer> q = new LinkedList<>();
            q.add(i++);
            //myQueue.put(myQueue.get());
            myQueue.put(q);
        }
    }
}