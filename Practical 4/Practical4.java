

import java.sql.*;

public class Practical4{
    public static void main(String args[]) {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");


            Connection con = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/enter_dbname", "enter_username", "enter_password");


            Statement stmt = con.createStatement();
            String insertQuery = "INSERT INTO student VALUES (1, 'Aman', 30)";
            stmt.executeUpdate(insertQuery);


            PreparedStatement pstmt = con.prepareStatement("SELECT * FROM student");
            ResultSet rs = pstmt.executeQuery();


            while (rs.next()) {
                System.out.println(
                        rs.getInt(1) + " " + rs.getString(2) + " " + rs.getInt(3));
            }


            rs.close();
            pstmt.close();
            stmt.close();
            con.close();

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}
