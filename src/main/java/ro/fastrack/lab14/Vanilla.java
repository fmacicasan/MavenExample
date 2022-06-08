package ro.fasttrack.lab15;

import java.sql.*;

/**
 * @author flo
 * @since 08.06.2022.
 */
public class Vanilla {
    public static void main(String[] args) throws SQLException {
        try (Connection connection = DriverManager.getConnection("jdbc:mysql://mysql-rfam-public.ebi.ac.uk:4497/Rfam", "rfamro", "")) {
            Statement statement = connection.createStatement();
            ResultSet result = statement.executeQuery("SELECT description, author FROM clan");

            while (result.next()) {
                System.out.print(result.getString("description"));
                System.out.print("=");
                System.out.println(result.getString("author"));
            }
        }
    }
}
