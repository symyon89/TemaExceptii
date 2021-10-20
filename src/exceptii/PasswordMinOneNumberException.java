package exceptii;

public class PasswordMinOneNumberException extends BussinessException {
    public PasswordMinOneNumberException() {
        super("Parola trebuie sa contina minimum un numar");
    }
}
