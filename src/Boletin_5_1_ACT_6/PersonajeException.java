package Boletin_5_1_ACT_6;

public class PersonajeException extends Exception{

    public PersonajeException() {
    }

    public PersonajeException(String message) {
        super(message);
    }

    public PersonajeException(String message, Throwable cause) {
        super(message, cause);
    }

    public PersonajeException(Throwable cause) {
        super(cause);
    }

    public PersonajeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
