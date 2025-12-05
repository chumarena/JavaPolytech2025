package IskluchIOshibki;

public class MyFirstException extends Exception {


    public MyFirstException() {
        super();
    }

    public MyFirstException(String message) {
        super(message);
    }

    public MyFirstException(String message, Throwable cause) {
        super(message, cause);
    }


}
