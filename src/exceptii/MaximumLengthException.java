package exceptii;

public class MaximumLengthException extends BussinessException{
    public MaximumLengthException() {
        super("Userul nu poate depasi 15 caractere");
    }
}
