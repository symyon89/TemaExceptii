package exceptii;

public class PasswordNoSpacesException extends BussinessException{
    public PasswordNoSpacesException() {
        super("Parola nu trebuie sa contina spatii");
    }
}
