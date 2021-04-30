package tutorial;

import org.junit.Before;
import junit.framework.TestCase;
import org.junit.Test;

public class CaseTest extends TestCase {
    protected double fValue1;
    protected double fValue2;

    @Before
    public void setUp() {
        fValue1 = 2.0;
        fValue2 = 3.0;
    }

    @Test
    public void testAdd() {
        //Count the number of test cases
        System.out.println("The # of Test Cases: " + this.countTestCases());
        
        //test getName
        String name = this.getName();
        System.out.println("Test Case Name: " + name);
    }

    //tearDown used to close the connection and clean up activities
    public void tearDown(  ) {

    }
}
