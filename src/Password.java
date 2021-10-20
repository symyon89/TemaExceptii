import exceptii.*;
import java.util.Scanner;

public class Password implements PasswordMinimumRequirements{
    String password;
    public void insertPassword(){
        Scanner scannerText = new Scanner(System.in);
        System.out.println("Introdu parola");
        password = scannerText.nextLine();
        checkPassword();
    }
    public void checkPassword(){
        try {
            checkMinimumLength();
            checkIfHasSpaces();
            checkIfContainsACapitalLetter();
            checkIfContainsASmallLetter();
            checkIfContainsANumber();
        }catch (MinimumLengthException | PasswordMinOneCapitalLetterException |
                PasswordMinOneNumberException | PasswordMinOneSmallLetterException |
                PasswordNoSpacesException e){
            System.out.println(e.getMessage());
            insertPassword();
        }
    }
    @Override
    public void checkMinimumLength() throws MinimumLengthException {
        if(password.length() < 6){
            throw new MinimumLengthException("Parola nu poate avea mai putin de 6 caractere");
        }
    }

    @Override
    public void checkIfContainsACapitalLetter() throws PasswordMinOneCapitalLetterException {
        if(password.matches("[^A-Z]+")){
            throw new PasswordMinOneCapitalLetterException();
        }
    }

    @Override
    public void checkIfContainsASmallLetter() throws PasswordMinOneSmallLetterException {
        if(password.matches("[^a-z]+")){
            throw new PasswordMinOneSmallLetterException();
        }
    }

    @Override
    public void checkIfContainsANumber() throws PasswordMinOneNumberException {
        if(password.matches("[^0-9]+")){
            throw new PasswordMinOneNumberException();
        }
    }

    @Override
    public void checkIfHasSpaces() throws PasswordNoSpacesException {
        if(password.contains(" ")){
            throw new PasswordNoSpacesException();
        }
    }

    public String getPassword() {
        return password;
    }
}
