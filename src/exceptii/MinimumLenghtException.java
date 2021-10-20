package exceptii;

public class MinimumLenghtException extends BussinessException{
    public MinimumLenghtException() {
        super("Userul nu poate avea mai putin de 4 caractere");
    }
}
