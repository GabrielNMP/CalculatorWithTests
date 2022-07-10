package pro.sky.java.course2.calculatorwithtests.exceptions;

public class DivedByZeroException extends IllegalArgumentException {

    public DivedByZeroException() {
    }

    public DivedByZeroException(String s) {
        super(s);
    }

    public DivedByZeroException(String message, Throwable cause) {
        super(message, cause);
    }

    public DivedByZeroException(Throwable cause) {
        super(cause);
    }
}
