import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
}

class CalculatorTest {
    private Calculator calculator = new Calculator();

    @ParameterizedTest
    @CsvSource({"2, 3, 5", "0, 0, 0", "-5, 5, 0", "-10, -20, -30"})
    void testAdd(int a, int b, int expectedSum) {
        int result = calculator.add(a, b);
        assertEquals(expectedSum, result, "Incorrect sum");
    }
}
