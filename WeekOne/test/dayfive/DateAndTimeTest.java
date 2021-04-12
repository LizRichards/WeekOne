package dayfive;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Liz Richards
 */
public class DateAndTimeTest {
    DateAndTime t = new DateAndTime();
    public DateAndTimeTest() {
    }


    /**
     * Test of isFriday13 method, of class DateAndTime.
     */
    @Test
    public void testIsFriday13() throws ParseException {
       Calendar calendar = Calendar.getInstance();
       DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        calendar.setTime(dateFormat.parse("13/11/2020"));
        assertTrue(t.isFriday13(calendar));
        calendar.setTime(dateFormat.parse("20/05/1987"));
        assertFalse(t.isFriday13(calendar));
    }
    
}
