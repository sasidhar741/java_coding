package multi_threading;

public class ThreadCreation extends Thread {

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        try {
            ThreadCreation threadCreation = new ThreadCreation();
            threadCreation.setName("Adform Thread");
            threadCreation.start();

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
