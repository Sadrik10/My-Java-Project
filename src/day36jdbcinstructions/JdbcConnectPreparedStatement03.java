package day36jdbcinstructions;

import java.sql.*;
import java.util.Scanner;

public class JdbcConnectPreparedStatement03 {

    public static void main(String[] args) {
        // Create a database connection
        try {
            String url = "jdbc:mysql://localhost:3306/jdbc_tech";
            String username = "root";
            String password = "A1490195zss";

            // Call a connection driver
            Connection connection = DriverManager.getConnection(url, username, password);

            // If we fail in building the connection
            if (connection.isClosed()) {
                System.out.println("Connection is failed or closed");
            } else {
                System.out.println("Connection has been established!");
            }
            String queryInsert = "INSERT INTO students(id,name,email,country) values(?,?,?,?)";
            PreparedStatement ps = connection.prepareStatement(queryInsert);
            Statement stId = connection.createStatement();
            ResultSet rs = stId.executeQuery("SELECT MAX(id) AS maxid from students");
            int maxId =0;
            if (rs.next()) {
                maxId = rs.getInt("maxid");
            }
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter user name:");
            String name = scan.nextLine();
            System.out.println("Enter email:");
            String email = scan.nextLine();
            System.out.println("Enter country:");
            String country = scan.nextLine();

            // INSERT INTO students(id,name,email,country)values(10,'d','ddd@dd','dddd')
            ps.setInt(1,maxId+1);
            ps.setNString(2,name);
            ps.setNString(3,email);
            ps.setNString(4,country);

            ps.executeUpdate();

            System.out.println("OK");
            connection.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}














