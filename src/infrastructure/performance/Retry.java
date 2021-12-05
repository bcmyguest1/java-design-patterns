package infrastructure.performance;

public interface Retry {
    public boolean retry() throws Exception;
}
