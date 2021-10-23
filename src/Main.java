import java.util.Scanner;

public class Main {
    public static void main(String[] args) {



        User user = new User();
        user.insertUser();

        Password password = new Password();
        password.insertPassword();

        Account account = new Account(user, password);
        System.out.println(account);

       newAccount(user,password,account);

       account.showAccountList();
    }


    public static String newAccountMenu(){
        Scanner scannerText = new Scanner(System.in);

        System.out.println("Vrei sa adaugi un nou user ?");
        System.out.print("Da/Nu : ");

        return scannerText.nextLine();

    }
    public static void newAccount(User user,Password password,Account account){
        String newAccount = newAccountMenu();

        while (newAccount.equalsIgnoreCase("Da")){
            user.insertUser();
            password.insertPassword();
            account.setUser(user);
            account.setPassword(password);
            System.out.println(account);
            newAccount = newAccountMenu();
        }
    }
}
