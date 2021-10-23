import exceptii.MaximumLengthException;
import exceptii.MinimumLengthException;
import exceptii.UserAlreadyExistsException;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class User implements UserMinimumRequirements {
    String user;
    Set<String> userList = new HashSet<>();

    public void insertUser(){
        Scanner scannerText = new Scanner(System.in);
        System.out.println("Introdu userul pe care doresti sa il creezi");
        user = scannerText.nextLine();
        checkUser();
        userList.add(user);
    }


    public void checkUser() {
        try{
            checkIfAllreadyExistUser();
            checkMinimulLength();
            checkMaximumLength();
        }catch (MinimumLengthException | MaximumLengthException | UserAlreadyExistsException e){
            System.out.println(e.getMessage());
            insertUser();
        }
    }

    private void checkIfAllreadyExistUser() throws UserAlreadyExistsException {
        if (userList.contains(user)){
            throw new UserAlreadyExistsException();
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

    public Set<String> getUserList() {
        return userList;
    }
}
