package multi_threading;

import java.time.LocalDateTime;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ExecutorsDemo {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println(Thread.currentThread().getName());
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        executorService.execute(r);
        executorService.execute(r);

        ScheduledExecutorService scheduledExecutorService = Executors.newSingleThreadScheduledExecutor();
        System.out.println("Start time: " + LocalDateTime.now());
        Runnable r1 = () -> System.out.println("Task 1: " + LocalDateTime.now());
        Runnable r2 = () -> System.out.println("Task 2: " + LocalDateTime.now());
        Runnable r3 = () -> System.out.println("Task 3: " + LocalDateTime.now());

        scheduledExecutorService.schedule(r1, 10, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(r2, 20, TimeUnit.SECONDS);
        scheduledExecutorService.schedule(r3, 30, TimeUnit.SECONDS);

        //use synchronized keyword for the method to acheive synchronization:
        // Giving access to single thread for shared resource


    }


}
