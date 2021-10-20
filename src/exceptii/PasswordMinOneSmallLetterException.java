package exceptii;

public class PasswordMinOneSmallLetterException extends BussinessException {
    public PasswordMinOneSmallLetterException() {
        super("Parola trebuie sa contina cel putin o litera mica");
    }
}
