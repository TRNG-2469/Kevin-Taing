## Initial Code
```java
package com.rev.demo;

import org.junit.jupiter.api.*;

public class TestCalculator {
    Calculator calculator = null;

    @BeforeEach
    public void setUp() {
        calculator = new Calculator();
    }

    // positive test case

    @Test
    public void testPositiveAdd() {
        // AAA

        // Arrange
        // calculator = new Calculator();
        int a = 10;
        int b = 10;
        int expectedResult = 20;

        // Act
        int actualResult = calculator.add(a, b);

        // Assert
        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveSubtract() {
        int a = 20;
        int b = 10;
        int expectedResult = 10;

        int actualResult = calculator.subtract(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveMultiply() {
        int a = 10;
        int b = 10;
        int expectedResult = 100;

        int actualResult = calculator.multiply(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveDivision() {
        int a = 10;
        int b = 10;
        int expectedResult = 1;

        double actualResult = calculator.divide(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testPositiveSquare() {
        int a = 10;
        int expectedResult = 100;

        int actualResult = calculator.square(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    // negative test case

    @Test
    public void testNegativeAdd() {
        int a = -10;
        int b = -10;
        int expectedResult = -20;

        int actualResult = calculator.add(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeSubtract() {
        int a = -20;
        int b = -10;
        int expectedResult = -10;

        int actualResult = calculator.subtract(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeMultiply() {
        int a = 10;
        int b = -10;
        int expectedResult = -100;

        int actualResult = calculator.multiply(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeDivision() {
        int a = -10;
        int b = 10;
        int expectedResult = -1;

        double actualResult = calculator.divide(a, b);

        Assertions.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testNegativeSquare() {
        int a = -10;
        int expectedResult = 100;

        int actualResult = calculator.square(a);

        Assertions.assertEquals(expectedResult, actualResult);
    }
}
```
## Prompt to AI:
"can you generate edge cases for my 5 calculator methods"

## AI Generated Edge Cases for Calculator Methods
```java
@Test
public void testEdgeAddOverflow() {
    int a = Integer.MAX_VALUE;
    int b = 1;
    int expectedResult = Integer.MIN_VALUE;

    int actualResult = calculator.add(a, b);

    Assertions.assertEquals(expectedResult, actualResult);
}

@Test
public void testEdgeSubtractUnderflow() {
    int a = Integer.MIN_VALUE;
    int b = 1;
    int expectedResult = Integer.MAX_VALUE;

    int actualResult = calculator.subtract(a, b);

    Assertions.assertEquals(expectedResult, actualResult);
}

@Test
public void testEdgeMultiplyByZero() {
    int a = Integer.MAX_VALUE;
    int b = 0;
    int expectedResult = 0;

    int actualResult = calculator.multiply(a, b);

    Assertions.assertEquals(expectedResult, actualResult);
}

@Test
public void testEdgeDivisionByZero() {
    int a = 10;
    int b = 0;

    Assertions.assertThrows(IllegalArgumentException.class, () -> {
        calculator.divide(a, b);
    });
}

@Test
public void testEdgeSquareOverflow() {
    int a = Integer.MIN_VALUE;
    int expectedResult = 0;

    int actualResult = calculator.square(a);

    Assertions.assertEquals(expectedResult, actualResult);
}
```