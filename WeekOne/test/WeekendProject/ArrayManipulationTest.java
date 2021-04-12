package WeekendProject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kusac
 */
public class ArrayManipulationTest {

    ArrayManipulation a = new ArrayManipulation();

    List<Integer> nums = Arrays.asList(43, 52, 15, 5, 274, 23, 69, 78);
    List<Integer> numsR = Arrays.asList(3, 2, 5, 5, 4, 3, 9, 8);
    List<Integer> numsD = Arrays.asList(86, 104, 30, 10, 548, 46, 138, 156);
    List<String> words = Arrays.asList("frog", "raxt", "xxx", "xxrix", "cat");
    List<String> xWords = Arrays.asList("frog", "rat", "", "ri", "cat");

    /**
     * Test of rightMostDigit method, of class ArrayManipulation.
     */
    @Test
    public void testRightMostDigit() {
        assertEquals(numsR, a.rightMostDigit(nums));
    }

    /**
     * Test of doubledValues method, of class ArrayManipulation.
     */
    @Test
    public void testDoubledValues() {
        assertEquals(numsD, a.doubledValues(nums));
    }

    /**
     * Test of noX method, of class ArrayManipulation.
     */
    @Test
    public void testNoX() {
        assertEquals(xWords, a.noX(words));
    }

}
