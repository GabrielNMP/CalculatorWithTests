package pro.sky.java.course2.calculatorwithtests.service;

import org.springframework.stereotype.Service;
import pro.sky.java.course2.calculatorwithtests.exceptions.DivedByZeroException;

@Service
public class CalcServiceImpl implements ServiceCalc {

    public String hello(){
        return "<b> Добро пожаловать в калькулятор.</b>";
    }

    public int plus(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

    public int subtraction(int num1, int num2){
        int sub = num1 - num2;
        return sub;
    }

    public int multiplication(int num1, int num2){
        int mult = num1 * num2;
        return mult;
    }

    public double division(double num1, double num2) {
        if (num2 == 0) {
            throw new DivedByZeroException();
        }
            double div = num1 / num2;
        return div;
    }
}
