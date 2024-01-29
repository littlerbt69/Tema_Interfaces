package Boletin_5_1;

public class CuentaCreditoException extends Exception{
    public CuentaCreditoException() {
    }

    public CuentaCreditoException(String message) {
        super(message);
    }

    public CuentaCreditoException(String message, Throwable cause) {
        super(message, cause);
    }

    public CuentaCreditoException(Throwable cause) {
        super(cause);
    }

    public CuentaCreditoException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
