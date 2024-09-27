package electricity_billing_system;

import java.sql.*;

public class conn {

    Connection c;
    Statement s;

    conn() {
        try {
            c = DriverManager.getConnection("jdbc:mysql://localhost:3306/ebs", "root", "root@123");
            s = c.createStatement();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
