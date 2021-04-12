package WeekendProject;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Liz Richards
 */
public class SampleSingleton {

    private static Connection conn = null;
    private static SampleSingleton instance = null;

    public static SampleSingleton getInstance() {
        if (instance == null) {
            instance = new SampleSingleton();
        }
        return instance;
    }

    public static void databaseQuery(BigDecimal input) throws SQLException {
        conn = DriverManager.getConnection("url of database");
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery("select id from table");
        BigDecimal x = new BigDecimal(BigInteger.ZERO);
        while (rs.next()) {
            x = input.multiply(rs.getBigDecimal(1));
        }
    }

}
