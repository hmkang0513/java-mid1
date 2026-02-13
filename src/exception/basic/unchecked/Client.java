package exception.basic.unchecked;

public class Client {
    //throws를 적지 않아도 됨
    public void call() {
        throw new MyUncheckedException("ex");
    }
}
