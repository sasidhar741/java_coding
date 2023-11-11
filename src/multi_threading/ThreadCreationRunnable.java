package multi_threading;

public class ThreadCreationRunnable implements Runnable {
    public static void main(String[] args) {
        try {
            ThreadCreationRunnable threadCreationRunnable = new ThreadCreationRunnable();

            Thread t1 = new Thread(threadCreationRunnable);
            Thread t2 = new Thread(threadCreationRunnable);
            t2.setPriority(7);
            t1.start();
            t1.join(); // makes the t2 to run only after t1
            t2.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        //default priority of thread is 5 : priority ranges from 1 to 10 (lowest to highest priority)

    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " Started");
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println(Thread.currentThread().getName() + " Ended");

    }
}
