import infrastructure.performance.BadClass;
import infrastructure.performance.NRetries;
import infrastructure.performance.Retry;

import java.util.concurrent.Callable;

public class DecoratorExample {
    public static void main(String[] args) throws Exception {
        Retry retryMechanism = new NRetries(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                return new BadClass().doNothing();
            }
        });
        System.out.println("Trying to call function that will fail");
        try {
            retryMechanism.retry();
        } catch (Exception e) {
            System.out.println("We expected this to fail");
        }

        retryMechanism = new NRetries(new Callable<Integer>() {

            @Override
            public Integer call() throws Exception {
                return new BadClass().doSomething();
            }
        });
        System.out.println("Trying to call function that will succeed");
        retryMechanism.retry();
        System.out.println("doSomething succeeded!");

    }
}
