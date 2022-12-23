
public class NewThread extends Thread {
    String symbol;

    NewThread(String symbol) {
        this.symbol = symbol;
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            System.out.println(symbol);
        }
    }

}