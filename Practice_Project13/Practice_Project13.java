package Practice_Project13;
public class Practice_Project13 {
    public static void main(String[] args) {
        Counter counter = new Counter();

        WorkerThread incrementThread = new WorkerThread(counter, true);
        WorkerThread decrementThread = new WorkerThread(counter, false);

        incrementThread.start();
        decrementThread.start();

        try {
            incrementThread.join();
            decrementThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println("Final count: " + counter.getCount());
    }
}
public class Counter {
    private int count = 0;
    public synchronized void increment() {
        count++;
    }

    public synchronized void decrement() {
        count--;
    }

    public synchronized int getCount() {
        return count;
    }
}
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

