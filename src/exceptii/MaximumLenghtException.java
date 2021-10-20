package exceptii;

public class MaximumLenghtException extends BussinessException{
    public MaximumLenghtException() {
        super("Userul nu poate depasi 15 caractere");
    }
}
