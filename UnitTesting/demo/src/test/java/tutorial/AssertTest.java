package tutorial;

import org.junit.Test;
import static org.junit.Assert.*;

public class AssertTest {
    @Test
    public void equals() {
        
        String str = "Junit is working fine";

        //Check for equality
        assertEquals("Junit is working fine", str);

    }

    @Test
    public void assertationFalse() {
        int num = 5;
        //check for false condition
        assertFalse(num > 6);
    }

    @Test
    public void amINull() {
        String temp = null;
        //check for null value
        assertNull(temp);
    }
}
