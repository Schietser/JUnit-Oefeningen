import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void sum() throws NotANumberException {
        Calculator calculator = new Calculator();
        Double expected = 30.0;
        Double actual = calculator.sum(10.0, 20.0);
        assertEquals(expected, actual);
    }

    @Test
    void subtract() {
        Calculator calculator = new Calculator();
        Double expected = 10.0;
        Double actual = calculator.subtract(20.0, 10.0);
        assertEquals(expected, actual);
    }

    @Test
    void divide() throws CalculatorException {
        Calculator calculator = new Calculator();
        Double expected = 2.0;
        Double actual = calculator.divide(20.0, 10.0);
        assertEquals(expected, actual);
    }

    @Test
    void multiply() {
        Calculator calculator = new Calculator();
        Double expected = 200.0;
        Double actual = calculator.multiply(20.0, 10.0);
        assertEquals(expected, actual);
    }

    @Test
    void testCalculatorException() {
        CalculatorException thrown = Assertions.assertThrows(CalculatorException.class, () -> {
            Calculator calculator = new Calculator();
            calculator.divide(10.0,0.0);
        });

        Assertions.assertEquals("Can't divide by 0", thrown.getMessage());

    }

    @Test
    void testNotANumberException() {
        NotANumberException thrown = Assertions.assertThrows(NotANumberException.class, () -> {
            Calculator calculator = new Calculator();
            calculator.sum(10.0, Double.NaN);
        });

        Assertions.assertEquals("You can only use numbers", thrown.getMessage());

    }


}
