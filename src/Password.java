public class Password implements PasswordMinimumRequirements{
    @Override
    public boolean checkMinimulLenght() {
        return false;
    }

    @Override
    public boolean checkIfContainsACapitalLetter() {
        return false;
    }

    @Override
    public boolean checkIfContainsASmallLetter() {
        return false;
    }

    @Override
    public boolean checkIdContainsANumber() {
        return false;
    }
}
