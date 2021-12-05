package infrastructure.performance;

import java.util.concurrent.Callable;

public class BasicRetry <T> implements Retry {
    Callable<T> func;

    public BasicRetry(Callable<T> func) {
        this.func = func;
    }

    @Override
    public boolean retry() throws Exception {
        for (int i=0;i<2;i++) {
            try {
                System.out.println("Calling func");
                func.call();
                System.out.println("Func success");
                return true;
            } catch (Exception e) {
                System.out.println("Function call failed");
            }
        }

        throw new Exception("Function call failed too many times!");
    }
}
