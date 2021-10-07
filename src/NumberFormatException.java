public class NumberFormatException extends Exception{
    private String message;

    public NumberFormatException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return message;
    }
}
