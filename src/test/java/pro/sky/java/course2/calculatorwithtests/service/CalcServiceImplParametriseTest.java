package pro.sky.java.course2.calculatorwithtests.service;

import org.jetbrains.annotations.NotNull;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.springframework.expression.spel.ast.OpNE;

import java.util.stream.Stream;

import static pro.sky.java.course2.calculatorwithtests.service.Constants.*;

class CalcServiceImplParametriseTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    @ParameterizedTest
    @MethodSource ("provideTests")
    public void threeIfOnePlusTwo (int num1, int num2) {
        int result = out.plus(num1,num2);
        Assertions.assertEquals(num1 + num2,result);
    }

    @ParameterizedTest
    @MethodSource ("provideTests")
    public void zeroIfTwoMinusTwo (int num1, int num2) {
        int result = out.subtraction(num1,num2);
        Assertions.assertEquals(num1 - num2,result);
    }

    @ParameterizedTest
    @MethodSource ("provideTests")
    public void ThreeIfThreeMultiplicationOne (int num1, int num2) {
        int result = out.multiplication(num1,num2);
        Assertions.assertEquals(num1 * num2,result);
    }

    @ParameterizedTest
    @MethodSource ("provideTests")
    public void ThreeIfThreeDivisionOne (double num1, double num2) {
        double result = out.division(num1,num2);
        Assertions.assertEquals(num1 / num2,result);
    }

    @NotNull
    public static Stream<Arguments> provideTests() {
        return Stream.of(
                Arguments.of(ONE,TWO,THREE),
                Arguments.of(TWO,TWO,ZERO),
                Arguments.of(THREE,ONE,THREE),
                Arguments.of(THREE,ONE,THREE)
        );
    }


}