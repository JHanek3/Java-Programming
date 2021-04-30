package tutorial;

public class MessageUtil {
    private String message;

    //Constructor
    public MessageUtil(String message) {
        this.message = message;
    }

    //prints the message
    public String printMessage() {
        System.out.println(message);
        // while(true);
        // int a = 0;
        // int b = 1/a;
        return message;
    }

    // add Hi to the message
    public String salutationMessage() {
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
