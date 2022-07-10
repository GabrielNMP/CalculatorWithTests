package pro.sky.java.course2.calculatorwithtests.service;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import pro.sky.java.course2.calculatorwithtests.exceptions.DivedByZeroException;

import static org.junit.jupiter.api.Assertions.*;

class CalcServiceImplTest {

    private final CalcServiceImpl out = new CalcServiceImpl();

    @Test
    public void plusCorrect(){
        int actual = out.plus(1,2);
        Assertions.assertEquals(3,actual);

        int actual2 = out.plus(-1, -3);
        Assertions.assertEquals(-4,actual2);
    }

    @Test
    public void subtractionCorrect() {
        int actual = out.subtraction(5,2);
        Assertions.assertEquals(3,actual);

        int actual2 = out.subtraction(-5,6);
        Assertions.assertEquals(-11,actual2);
    }

    @Test
    public void multiplicationCorrect() {
        int actual = out.multiplication(2,2);
        Assertions.assertEquals(4,actual);

        int actual2 = out.multiplication(2,0);
        Assertions.assertEquals(0,actual2);
    }

    @Test
    public void divisionCorrect(){
        double actual = out.division(3,2);
        Assertions.assertEquals(1.5, actual);

        double actual2 = out.division(100,5);
        Assertions.assertEquals(20, actual2);

    }

    @Test
    public void illegalArgumentExceptionInDivisionByZero(){
        Assertions.assertThrows(DivedByZeroException.class,()-> out.division(5,0));
    }
}