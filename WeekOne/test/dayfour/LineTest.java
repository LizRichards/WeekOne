package dayfour;

import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liz Richards
 */
public class LineTest {

    Line a = new Line(0, 0, 5, 5);

    public LineTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetSlope() {
        assertEquals(1, (a.getSlope()), 0.0001);
    }

    @Test
    public void testGetDistance() {
        assertEquals(7.0710, (a.getDistance()), 0.0001);
    }

    @Test
    public void testParallelTo() {
        Line b = new Line(1, 0, 6, 5);
        assertTrue(a.parallelTo(b));
    }
}
