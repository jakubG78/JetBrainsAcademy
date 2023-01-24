package carsharing;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Main {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:file:./src/carsharing/db/carsharing";

    public static void main(String[] args) {
        Connection connection = null;
        Statement statement = null;
        String table = "CREATE TABLE COMPANY" +
                "(ID INT PRIMARY KEY AUTO_INCREMENT," +
                "NAME VARCHAR(255) NOT NULL UNIQUE)";

        try {
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DB_URL);
            connection.setAutoCommit(true);
            statement = connection.createStatement();
            statement.execute("DROP TABLE IF EXISTS COMPANY");
            statement.execute(table);
            statement.close();
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}