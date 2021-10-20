
public class Main {
    public static void main(String[] args) {
        User user = new User();
        user.insertUser();
        Password password = new Password();
        password.insertPassword();
        Account account = new Account(user, password);
        System.out.println(account);
    }
}
