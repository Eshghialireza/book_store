package ir.mupra.book_store.exception;

public class Unauthorized  extends RuntimeException {
    public Unauthorized() {
    }

    public Unauthorized(String message) {
        super(message);
    }

    public Unauthorized(String message, Throwable cause) {
        super(message, cause);
    }
}
