package main.exceptions;

public class ClientHTTPException extends RuntimeException {

    public ClientHTTPException(String message) {
        super(message);
    }

}
