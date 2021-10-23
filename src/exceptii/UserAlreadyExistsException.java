package exceptii;

public class UserAlreadyExistsException extends BussinessException {
    public UserAlreadyExistsException(){
        super("Userul deja este utilizat !");
    }
}
