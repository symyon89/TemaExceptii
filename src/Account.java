import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Account {
    Password password;
    User user;
    Map<String,String> accountList= new HashMap<>();

    public Account(User user, Password password) {
        this.password = password;
        this.user = user;
        System.out.println("Contul a fost creat");
        accountList.put(user.getUser(), password.getPassword());
    }

    public void setPassword(Password password) {
        this.password = password;
        System.out.println("Contul a fost creat");
        accountList.put(user.getUser(), password.getPassword());
    }

    public void setUser(User user) {
        this.user = user;
    }

    public  void showAccountList() {
        System.out.println("lista de useri si parole este : ");
       Set<String> userList = user.getUserList();
        for (String userKey : userList) {
            String userPassword = accountList.get(userKey);
            System.out.println("User : " + userKey + " Parola : " + userPassword);
        }
    }


    @Override
    public String toString() {
        return "Datele tale sunt :" +
                "user=" + user.getUser() +
                ", parola=" + password.getPassword();
    }
}
