package za.ac.nwu.ac.domain.service;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class SubtractMiles {
    public static void main(String[] args) throws IOException, SQLException {
        String jdbcURL = "jdbc:mysql://localhost:3306/mysql";
        String username = "root";
        String password = "@N00dl3-klein";

        Connection cnn = DriverManager.getConnection(jdbcURL, username, password);

        String sql = "UPDATE miles_account(acc_id, mem_id, miles_balance)";
    }
}
