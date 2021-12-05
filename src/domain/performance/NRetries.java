package domain.performance;

import java.util.concurrent.Callable;

public class NRetries <T> extends BasicRetry<T>{

    private final int backoffMillis;
    private final int numRetries;

    public NRetries(Callable<T> func, int numRetries, int backoffMillis) {
        super(func);
        this.numRetries = numRetries;
        this.backoffMillis = backoffMillis;
    }

    public NRetries(Callable<T> func) {
        super(func);
        this.numRetries = 3;
        this.backoffMillis = 20;
    }

    @Override
    public boolean retry() throws Exception {
        for (int i=0;i<numRetries;i++) {
            try {
                System.out.println("Calling func");
                this.func.call();
                System.out.println("Func success");
                return true;
            } catch (Exception e) {
                System.out.println(String.format("Function call failed, backing off for %d and waiting for possible success",
                        (long) backoffMillis*i));
                Thread.sleep((long) backoffMillis * i);
            }
        }

        throw new Exception("Function call failed too many times!");

    }
}
