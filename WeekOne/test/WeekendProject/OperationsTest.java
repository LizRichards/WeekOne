package WeekendProject;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kusac
 */
public class OperationsTest {

    Operations opTest = new Operations();
    PerformOperation op;
    int num = 6;
    int num2 = 11;
    int num3 = 4545;
    int num4 = 2345432;

    public OperationsTest() {
    }

    /**
     * Test of checker method, of class Operations.
     */
    @Test
    public void testChecker() {
        op = opTest.isOdd();
        assertNotNull(opTest.checker(op, num));
        op = opTest.isPrime();
        assertNotNull(opTest.checker(op, num));
        op = opTest.isPalindrome();
        assertNotNull(opTest.checker(op, num));
    }

    /**
     * Test of isOdd method, of class Operations.
     */
    @Test
    public void testIsOdd() {
        op = opTest.isOdd();
        assertFalse(opTest.checker(op, num));
        assertTrue(opTest.checker(op, num2));
    }

    /**
     * Test of isPrime method, of class Operations.
     */
    @Test
    public void testIsPrime() {
        op = opTest.isPrime();
        assertFalse(opTest.checker(op, num));
        assertTrue(opTest.checker(op, num2));
    }

    /**
     * Test of isPalindrome method, of class Operations.
     */
    @Test
    public void testIsPalindrome() {
        op = opTest.isPalindrome();
        assertTrue(opTest.checker(op, num2));
        assertFalse(opTest.checker(op, num3));
        assertTrue(opTest.checker(op, num4));
    }

}
