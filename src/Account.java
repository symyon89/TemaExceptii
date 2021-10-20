public class Account {
    Password password;
    User user;

    public Account(User user, Password password) {
        this.password = password;
        this.user = user;
        System.out.println("Contul a fost creat");
    }

    @Override
    public String toString() {
        return "Datele tale sunt :" +
                "password=" + user.getUser() +
                ", user=" + password.getPassword();
    }
}
