import exceptii.MaximumLengthException;
import exceptii.MinimumLengthException;
import java.util.Scanner;

public class User implements UserMinimumRequirements {
    String user;

    public void insertUser(){
        Scanner scannerText = new Scanner(System.in);
        System.out.println("Introdu userul pe care doresti sa il creezi");
        user = scannerText.nextLine();
        checkUser();
    }

    public void checkUser() {
        try{
            checkMinimulLength();
            checkMaximumLength();
        }catch (MinimumLengthException | MaximumLengthException e){
            System.out.println(e.getMessage());
            insertUser();
        }
    }

    @Override
    public void checkMinimulLength() throws MinimumLengthException {
         if(user.length() < 4){
             throw new MinimumLengthException("Userul nu poate avea mai putin de 4 caractere");
         }
    }

    @Override
    public void checkMaximumLength() throws MaximumLengthException {
        if(user.length() > 15){
            throw new MaximumLengthException();
        }
    }

    public String getUser() {
        return user;
    }
}
