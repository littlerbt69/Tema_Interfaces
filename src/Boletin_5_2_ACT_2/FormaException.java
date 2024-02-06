package Boletin_5_2_ACT_2;

public class FormaException extends Exception{
    public FormaException() {
    }

    public FormaException(String message) {
        super(message);
    }

    public FormaException(String message, Throwable cause) {
        super(message, cause);
    }

    public FormaException(Throwable cause) {
        super(cause);
    }

    public FormaException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
