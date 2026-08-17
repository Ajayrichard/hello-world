import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CalculatorTest {

    @Test
    void testAddition() {
	Calculator calculator = new Calculator();
	int result = calculator.add(10, 20);
	assertEquals(30, result);
    }

    @Test
     void testMultiplication() {
        Calculator calculator = new Calculator();
        int result = calculator.multiply(10, 20);
        assertEquals(200, result);
    }
}


