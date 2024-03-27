package Practice_Project12;
class Practice_Project12 {
    public static void main(String[] args) {
        final Object lock = new Object();
        Thread sleepThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("SleepThread: Sleeping for 3 seconds.");
                    Thread.sleep(3000);
                    System.out.println("SleepThread: Woke up after 3 seconds.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });
        Thread waitThread = new Thread(() -> {
            synchronized (lock) {
                try {
                    System.out.println("WaitThread: Waiting...");
                    lock.wait(); 
                    System.out.println("WaitThread: Resumed.");
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        });

        sleepThread.start();
        waitThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        synchronized (lock) {
            lock.notify();
        }
    }
}
