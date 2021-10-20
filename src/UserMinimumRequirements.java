import exceptii.MaximumLenghtException;
import exceptii.MinimumLenghtException;

public interface UserMinimumRequirements {
    void checkMinimulLenght() throws MinimumLenghtException;
    void checkMaximumLenght() throws MaximumLenghtException;
}
