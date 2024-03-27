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