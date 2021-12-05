import infrastructure.ApplicationProperties;

import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingletonExample {
    public static void main(String[] args) {
        System.out.println(String.format("ApplicationProperties instance 1: %s (should always be the same object)", ApplicationProperties.getInstance()));
        System.out.println(String.format("ApplicationProperties instance 2: %s (should always be the same object)", ApplicationProperties.getInstance()));
        System.out.println(String.format("ApplicationProperties instance 3: %s (should always be the same object)", ApplicationProperties.getInstance()));

        ExecutorService executor = Executors.newFixedThreadPool(5);

        for (int i=0;i< 10;i++) {
            int finalI = i;
            executor.submit(() -> {
                try {
                    Thread.sleep((long)(new Random().nextDouble()*2000));
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println(String.format("Concurrent ApplicationProperties instance %d: %s (should always be the same object)",
                        finalI, ApplicationProperties.getInstance()));
            });
        }
    }
}
