package exceptii;

public class BussinessException  extends Exception{
    public BussinessException() {
        super();
    }

    public BussinessException(String message) {
        super(message);
    }
}
