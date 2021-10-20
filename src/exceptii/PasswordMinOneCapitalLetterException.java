package exceptii;

public class PasswordMinOneCapitalLetterException extends BussinessException {
    public PasswordMinOneCapitalLetterException() {
        super("Parola trebuie sa contina minimum 1 majuscula");
    }
}
