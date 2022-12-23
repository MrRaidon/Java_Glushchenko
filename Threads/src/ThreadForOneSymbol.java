
public class ThreadForOneSymbol extends Thread{

    volatile StringBuilder stBuilder;
    ThreadForOneSymbol(StringBuilder stBuilder){
        this.stBuilder = stBuilder;
    }
    @Override
    public void run() {
        for (int i = 1; i <= 100; i++){
            System.out.println(Thread.currentThread().getName() +" " + i +": "+ stBuilder);
        }
        stBuilder.append('a');
        super.run();
    }
}