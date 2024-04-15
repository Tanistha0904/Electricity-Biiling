package electricity.billing.system;

import java.sql.*;

public class Conn {

    Connection c;
    Statement s;
    Conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql:///ebss", "root", "Tanvi@0904");
            s = c.createStatement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

