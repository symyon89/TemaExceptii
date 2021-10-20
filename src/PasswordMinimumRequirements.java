import exceptii.*;

public interface PasswordMinimumRequirements {
    void checkMinimumLength() throws MinimumLengthException;
    void checkIfContainsACapitalLetter() throws PasswordMinOneCapitalLetterException;
    void checkIfContainsASmallLetter() throws PasswordMinOneSmallLetterException;
    void checkIfContainsANumber()throws PasswordMinOneNumberException;
    void checkIfHasSpaces() throws PasswordNoSpacesException;

}

