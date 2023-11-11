package multi_threading;

public class ThreadGroupDemo implements Runnable {
    public static void main(String[] args) {
        ThreadGroupDemo threadGroupDemo = new ThreadGroupDemo();
        ThreadGroup threadGroup = new ThreadGroup("download");

        Thread t1 = new Thread(threadGroup, threadGroupDemo, "first");
        Thread t2 = new Thread(threadGroup, threadGroupDemo);
        Thread t3 = new Thread(threadGroup, threadGroupDemo);

        t1.start();
        t2.start();
        t3.start();

        System.out.println("Thread group name: " + threadGroup.getName());
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}
