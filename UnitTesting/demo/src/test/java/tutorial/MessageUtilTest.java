package tutorial;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUtilTest {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() {
        System.out.println("Inside testSalutationMessage");
        message = "Hi!" + "Robert";
        assertEquals(message, messageUtil.salutationMessage());
    }

    //Timeout test with infinite while loop
    // @Test(timeout = 1000)
    // public void testPrintMessage() {
    //     System.out.println("Inside testPrintMessage()");
    //     messageUtil.printMessage();
    // }

    //Aritmetic exception
    @Test(expected = ArithmeticException.class)
    public void testPrintMessage() {
        System.out.println("Inside testPrintMessage()");
        messageUtil.printMessage();
    }
}
