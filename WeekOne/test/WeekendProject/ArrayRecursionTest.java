package WeekendProject;

import java.util.Arrays;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author kusac
 */
public class ArrayRecursionTest {

    ArrayRecursion t = new ArrayRecursion();
    int[] nums = {4, 5, 5, 5, 7, 2, 9, 78, 30, 4, 4};
    int[] nums2 = {4, 15, 0, 0, 7, 2, 9, 78, 30, 8, 0};

    /**
     * Test of ElimDoubles method, of class ArrayRecursion.
     */
    @Test
    public void testElimDoubles() {
        assertFalse(Arrays.equals(nums, nums2));
        t.elimDoubles(nums);
        assertTrue(Arrays.equals(nums, nums2));
    }

    /**
     * Test of groupSumClump method, of class ArrayRecursion.
     */
    @Test
    public void testGroupSumClump() {
        assertTrue(t.groupSumClump(0, nums2, 15));
        assertTrue(t.groupSumClump(0, nums2, 108));
        assertTrue(t.groupSumClump(0, nums2, 38));
        assertTrue(t.groupSumClump(0, nums2, 9));
        assertFalse(t.groupSumClump(0, nums2, 5));
        assertFalse(t.groupSumClump(0, nums2, 200));
        assertFalse(t.groupSumClump(0, nums2, 1));
    }

}
