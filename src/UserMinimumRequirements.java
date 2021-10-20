import exceptii.MaximumLengthException;
import exceptii.MinimumLengthException;

public interface UserMinimumRequirements {
    void checkMinimulLength() throws MinimumLengthException;
    void checkMaximumLength() throws MaximumLengthException;
}
