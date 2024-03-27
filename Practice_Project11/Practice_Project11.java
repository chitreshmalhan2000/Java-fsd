package Practice_Project11;
public class Practice_Project11 {
 public static void main(String[] args) {
     MyThread thread1 = new MyThread();
     thread1.start();
     MyRunnable myRunnable = new MyRunnable();
     Thread thread2 = new Thread(myRunnable);
     thread2.start();
 }
}
