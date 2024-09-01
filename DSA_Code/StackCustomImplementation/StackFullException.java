package StackCustomImplementation;

public class StackFullException extends RuntimeException {
    public StackFullException(String message) {
        super(message); // Call the constructor of the superclass with the message
    }
}
