/*
        clasa Error si clasele care extind Error intra in categoria
        exceptiilor neverificate si se numesc erori (dpdv tehnic java)          Errors

        tot in categoria unchecked exception intra si
        exceptia RuntimeException (si toate clasele care o extind)              Runtime exceptions

        *unchecked exceptions*

        toate celelalte exceptii se numesc exceptii verificate                  Exceptions

        *checked exceptions*

     */
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
