package Practice_Project13;
public class WorkerThread extends Thread {
    private Counter counter;
    private boolean increment;

    public WorkerThread(Counter counter, boolean increment) {
        this.counter = counter;
        this.increment = increment;
    }

    public void run() {
        if (increment) {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        } else {
            for (int i = 0; i < 1000; i++) {
                counter.decrement();
            }
        }
    }
}
