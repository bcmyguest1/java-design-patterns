package domain.performance;

public class BadClass {
    public Integer doNothing() throws Exception {
        throw new Exception("this always fails");
    }

    public Integer doSomething() throws Exception {
        return 1;
    }
}
