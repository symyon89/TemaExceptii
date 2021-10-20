public class Account {
    Password password;
    User user;

    public Account(Password password, User user) {
        this.password = password;
        this.user = user;
        System.out.println("Contul a fost creat");
    }
}
