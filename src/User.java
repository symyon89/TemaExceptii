import exceptii.MaximumLenghtException;
import exceptii.MinimumLenghtException;

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
            checkMinimulLenght();
            checkMaximumLenght();
        }catch (MinimumLenghtException | MaximumLenghtException min){
            System.out.println(min.getMessage());
            insertUser();
        }
    }

    @Override
    public void checkMinimulLenght() throws MinimumLenghtException {
         if(user.length() < 4){
             throw new MinimumLenghtException();
         }
    }

    @Override
    public void checkMaximumLenght() throws MaximumLenghtException {
        if(user.length() > 15){
            throw new MaximumLenghtException();
        }
    }
}
