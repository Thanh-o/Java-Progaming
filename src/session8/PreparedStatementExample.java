package session8;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class PreparedStatementExample {
    public static void main(String[] args)throws SQLException{
        //get connection
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Create Query(sql engine)
        String query = "SELECT * FROM customers WHERE customer_id = ? AND first_name like ?";
        //Create PreparedStatement
        PreparedStatement pstm = connection.prepareStatement(query);
        //Gan gia tri cho tham so theo thu tu
        pstm.setInt(1,1);
        pstm.setString(2,"TRUONG");

        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("======================");
            System.out.println("Customer id: " +rs.getInt("customer_id"));
            System.out.println("First name: " + rs.getString(2));
            System.out.println("Last name: " +rs.getString(3));
            System.out.println("Email: " +rs.getString("email"));
        }
        connection.close();
    }
}
