package skypro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static skypro.calculator.CalcServiceTestConstants.*;
import static skypro.calculator.CalcServiceTestConstants.CORRECT_DEF_RESULT2;

public class CalcServiceImplTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    public void shouldReturn8WhenSum6And2() {
        int result = out.plus(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, CORRECT_SUM_RESULT1);

    }

    @Test
    public void shouldReturn16WhenSum12And4() {
        int result = out.plus(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, CORRECT_SUM_RESULT2);
    }

    @Test
    public void shouldReturn4WhenMinus6And2() {
        int result = out.minus(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, CORRECT_DEF_RESULT1);

    }

    @Test
    public void shouldReturn8WhenMinus12And4() {
        int result = out.minus(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, CORRECT_DEF_RESULT2);
    }

    @Test
    public void shouldReturn12WhenMultiply6And2() {
        int result = out.multiply(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, CORRECT_MULTIPLY_RESULT1);

    }

    @Test
    public void shouldReturn48WhenMultiply12And4() {
        int result = out.multiply(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, CORRECT_MULTIPLY_RESULT2);
    }

    @Test
    public void shouldReturn3WhenDivide6And2() {
        int result = out.divide(NUMBER_1, NUMBER_2);
        Assertions.assertEquals(result, CORRECT_DIVIDE_RESULT1);

    }

    @Test
    public void shouldReturn3WhenDivide12And4() {
        int result = out.divide(NUMBER_3, NUMBER_4);
        Assertions.assertEquals(result, CORRECT_DIVIDE_RESULT2);
    }

    @Test
    public void shouldTrowIllegalArgumentExceptionWhenSecondNumberIsZero() {
        Assertions.assertThrows(CalcIllegalArgumentException.class, () -> out.divide(NUMBER_3, NUMBER_ZERO));
    }
}