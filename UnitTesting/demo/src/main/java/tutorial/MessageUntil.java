package tutorial;
/*
PRints the given message on console
*/

public class MessageUntil {
    private String message;

    public MessageUntil(String message) {
        this.message = message;
    }

    public String printMessage() {
        System.out.println(message);
        return message;
    }
    
}
