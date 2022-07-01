package day36jdbcinstructions;
import java.sql.*;

public class JdbcConnectSample01 { // 127.0.0.1

    private static final String CONNECTSTR="jdbc:mysql://localhost:3306/jdbc_tech?useSSL=false";
                                          // "jdbc:mysql://localhost:3306/jdbc_tech?useSSL=false"
    private static final String QUERY="SELECT * FROM students";
    public static void main(String[] args) {
        try{
            // Try with resources
            // 1. Create a connection
            Connection connection = DriverManager.getConnection(CONNECTSTR,"root","A1490195zss");
            // 2. Create a statement using that above connection object
            Statement stmt = connection.createStatement();
            // 3. Execute sql query, there are two methods to execute sql query
            ResultSet rs = stmt.executeQuery(QUERY);


            /*  cursor  pointer
                  1     2      3
                 id   name   email
                 1     a      a@aa
                 2     b      b@bb
             */

            // 4. Process the resultset
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String email = rs.getString("email");
                String country = rs.getString("country");
                System.out.println(id+","+name+","+email+","+country);
            }
            //  connection.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
