package exercise;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

    @Test
    public void testAddSimpleNumbers() {
        // Arrange
        StringCalculator calc = new StringCalculator();

        // Act
        int result = calc.add("5, 3");

        // Assert
        assertEquals(8, result);
    }

    @Test
    public void testMulSimpleNumbers() {
        // Arrange
        StringCalculator calc = new StringCalculator();

        // Act
        int result = calc.mul("2, 3, 4");

        // Assert
        assertEquals(24, result);
    }

    @Test
    public void testMulEdgeEmpty() {
        // Arrange
        StringCalculator calc = new StringCalculator();

        // Act
        int result = calc.mul("");

        // Assert
        assertEquals(0, result);
    }

    @Test
    public void testDivSimpleNumbers() {
        // Arrange
        StringCalculator calc = new StringCalculator();

        // Act
        double result = calc.div("10, 2");

        // Assert
        assertEquals(5, result);
    }

    @Test
    public void testDivEdgeZero() {
        // Arrange
        StringCalculator calc = new StringCalculator();

        // Act
        double result = calc.div("10, 0");

        // Assert
        assertEquals(0, result);
    }
}