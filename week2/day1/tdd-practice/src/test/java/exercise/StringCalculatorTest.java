package exercise;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

public class StringCalculatorTest {

//    @Test
//    public void testAddSimpleNumbers() {
//        // Arrange
//        StringCalculator calc = new StringCalculator();
//
//        // Act
//        int result = calc.add("5, 3");
//
//        // Assert
//        assertEquals(8, result);
//    }
//
//    @Test
//    public void testMulSimpleNumbers() {
//        // Arrange
//        StringCalculator calc = new StringCalculator();
//
//        // Act
//        int result = calc.mul("2, 3, 4");
//
//        // Assert
//        assertEquals(24, result);
//    }
//
//    @Test
//    public void testMulEdgeEmpty() {
//        // Arrange
//        StringCalculator calc = new StringCalculator();
//
//        // Act
//        int result = calc.mul("");
//
//        // Assert
//        assertEquals(0, result);
//    }
//
//    @Test
//    public void testDivSimpleNumbers() {
//        // Arrange
//        StringCalculator calc = new StringCalculator();
//
//        // Act
//        double result = calc.div("10, 2");
//
//        // Assert
//        assertEquals(5, result);
//    }
//
//    @Test
//    public void testDivEdgeZero() {
//        // Arrange
//        StringCalculator calc = new StringCalculator();
//        // Assert
//        assertThrows(IllegalArgumentException.class, () -> calc.div("10, 0"));
//    }

    private StringCalculator calc;

    @BeforeEach
    void setUp() {calc = new StringCalculator();}
    // ADD tests
    @Test    void add_emptyString_returnsZero() {        assertEquals(0, calc.add(""));    }
//    @Test    void add_null_throwsIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.add(null));    }
//    @Test    void add_negativeValues_throwIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.add("1,-2,3"));    }
//    @Test    void add_trailingComma_throwsIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.add("1,2,"));    }
    @Test    void add_handlesSpacesAndMixedFormatting() {        assertEquals(6, calc.add(" 1 , 2,3 "));    }
    // MULTIPLY tests
//    @Test    void multiply_emptyString_returnsOne() {        assertEquals(1, calc.mul(""));    }
//    @Test    void multiply_null_throwsIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.mul(null));    }
    @Test    void multiply_withZero_resultsInZero() {        assertEquals(0, calc.mul("5,0,2"));    }
    @Test    void multiply_handlesSpacesAndParsing() {        assertEquals(12, calc.mul(" 3 , 4 "));    }
//    @Test    void multiply_trailingComma_throwsIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.mul("2,3,"));    }
    // DIVIDE tests
    @Test    void divide_sequentialDivision_performsIntegerDivision() {        assertEquals(2, calc.div("8,2,2"));    }
//    @Test    void divide_byZero_throwsArithmeticException() {        assertThrows(ArithmeticException.class, () -> calc.div("8,0"));    }
//    @Test    void divide_nonIntegerResult_usesIntegerDivision() {        assertEquals(2, calc.div("5,2"));    }
    @Test    void divide_null_throwsIllegalArgumentException() {        assertThrows(IllegalArgumentException.class, () -> calc.div(null));    }
    @Test    void divide_handlesSpacesAndTrailingWhitespace() {        assertEquals(4, calc.div(" 16 , 2 , 2 "));    }
}