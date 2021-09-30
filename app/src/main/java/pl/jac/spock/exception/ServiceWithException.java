package pl.jac.spock.exception;

public class ServiceWithException {

    public void run(String s) {
        throw new RuntimeException(s);
    }
}
