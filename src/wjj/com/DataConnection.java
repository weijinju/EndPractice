package wjj.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by Administrator on 2020/5/4.
 */
public class DataConnection {
    static Connection getConnectionMyData() {
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        Connection conn = null;
        try {
            conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:ORCL","scott","tiger");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
    static Statement getMyStatement() {
        Statement stm = null;
        try {
            stm = getConnectionMyData().createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return stm;
    }
}
