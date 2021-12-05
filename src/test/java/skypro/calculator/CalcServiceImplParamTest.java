package skypro.calculator;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static skypro.calculator.CalcServiceTestConstants.*;

class CalcServiceImplParamTest {
    private final CalcServiceImpl out = new CalcServiceImpl();

    public static Stream<Arguments> provideParamsForSumTests() {
        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, CORRECT_SUM_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, CORRECT_SUM_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, CORRECT_SUM_RESULT3)
        );
    }

    public static Stream<Arguments> provideParamsForDefTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, CORRECT_DEF_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, CORRECT_DEF_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, CORRECT_DEF_RESULT3)
        );
    }

    public static Stream<Arguments> provideParamsForMultiplyTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, CORRECT_MULTIPLY_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, CORRECT_MULTIPLY_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, CORRECT_MULTIPLY_RESULT3)
        );
    }

    public static Stream<Arguments> provideParamsForDivideTests() {

        return Stream.of(
                Arguments.of(NUMBER_1, NUMBER_2, CORRECT_DIVIDE_RESULT1),
                Arguments.of(NUMBER_3, NUMBER_4, CORRECT_DIVIDE_RESULT2),
                Arguments.of(NUMBER_5, NUMBER_6, CORRECT_DIVIDE_RESULT3)
        );
    }

    @ParameterizedTest
    @MethodSource("provideParamsForSumTests")
    public void shouldGenerateCorrectSumResult(int num1, int num2, int correctResult) {
        int result = out.plus(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDefTests")
    public void shouldGenerateCorrectDefResult(int num1, int num2, int correctResult) {
        int result = out.minus(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForMultiplyTests")
    public void shouldGenerateCorrectMultiplyResult(int num1, int num2, int correctResult) {
        int result = out.multiply(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

    @ParameterizedTest
    @MethodSource("provideParamsForDivideTests")
    public void shouldGenerateCorrectDivideResult(int num1, int num2, int correctResult) {
        int result = out.divide(num1, num2);
        Assertions.assertEquals(result, correctResult);
    }

}

