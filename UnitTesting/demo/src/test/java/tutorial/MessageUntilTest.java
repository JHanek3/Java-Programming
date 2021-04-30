package tutorial;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MessageUntilTest {
    String message = "Hello World";
    MessageUntil messageUntil = new MessageUntil(message);

    @Test
    public void testPrintMessage() {
        assertEquals(message, messageUntil.printMessage());
    }

    @Test
    public void testPrintMessageExpectFail() {
        message = "New Word";
        assertEquals(message, messageUntil.printMessage());
    }
}
