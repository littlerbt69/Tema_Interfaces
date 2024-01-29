package Boletin_5_1;

public class CuentaException extends Exception{
    public CuentaException() {
    }

    public CuentaException(String message) {
        super(message);
    }

    public CuentaException(String message, Throwable cause) {
        super(message, cause);
    }

    public CuentaException(Throwable cause) {
        super(cause);
    }

    public CuentaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
