package dayfour;

import dayfour.Singleton;
import static dayfour.Singleton.getInstance;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liz Richards
 */
public class SingletonTest {

    public SingletonTest() {
    }

    @Before
    public void setUp() {
    }

    @Test
    public void testGetInstance() {
        Singleton testy = Singleton.getInstance();
        Singleton testTwo = Singleton.getInstance();
        assertEquals(testy, testTwo);
    }

}
