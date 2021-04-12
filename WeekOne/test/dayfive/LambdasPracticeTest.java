package dayfive;

import java.util.Arrays;
import java.util.List;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liz Richards
 */
public class LambdasPracticeTest {

    LambdasPractice a = new LambdasPractice();

    String[] words = {"frog", "cat", "Lizard", "Owls", "elephant", "ears"};
    String[] eFirst = {"ears", "elephant", "cat", "frog", "Lizard", "Owls"};
    List<Integer> nums = Arrays.asList(43, 52, 15, 5, 274, 23, 69, 78);
    String res = "o43,e52,o15,o5,e274,o23,o69,e78";

    /**
     * Test of eFirst method, of class LambdasPractice.
     */
    @Test
    public void testEFirst() {
        Arrays.sort(words, (s1, s2) -> a.eFirst(s1, s2));
        System.out.println(Arrays.toString(words));
        assertTrue(Arrays.equals(eFirst, words));
    }

    /**
     * Test of commaList method, of class LambdasPractice.
     */
    @Test
    public void testCommaList() {
        assertEquals(res, a.commaList(nums));
    }

    /**
     * Test of threeAs method, of class LambdasPractice.
     */
    @Test
    public void testThreeAs() {
        List<String> input = Arrays.asList("ant", "cat", "Lizard", "art", "elephant", "aardvark");
        List<String> result = Arrays.asList("ant", "art");
        assertEquals(result, a.threeAs(input));
    }

}
