import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class EmailValidator {
    public boolean isValidEmail(String email) {
        return testContainsSymbol(email);
    }

    public boolean testContainsSymbol(String input) {
        boolean containsSymbol = false;
        char symbolToCheck = '@';
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == symbolToCheck) {
                containsSymbol = true;
                break;
            }
        }
        return containsSymbol;
    }
}

class EmailValidatorTest {
    private EmailValidator emailValidator = new EmailValidator();

    @ParameterizedTest
    @ValueSource(strings = {"test@.com", "kate.aras@gmail.com", "angelina@gmail.com", "invalid.email@"})
    void testIsValidEmail(String email) {
        boolean result = emailValidator.isValidEmail(email);
        assertEquals(true, result, "Invalid email: " + email);
    }
}

