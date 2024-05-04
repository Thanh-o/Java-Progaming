package session8;

import java.sql.*;

public class MyApplication {
    public static void main(String[] args) throws SQLException {
        //createCustomer();
        getAllCustomer();
        getCustomerVsPreparedStatement();


    }
    //Lay toan bo thong tin cua bang Customer
    public static void getAllCustomer() throws SQLException {
        //Goi DT Connection(nhac Object Connection dat vao class nay)
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Tao Statement(Lenh thuc thi voi csdl)
        Statement stm = connection.createStatement();
        //Truy vans trong csdl
        String query = "SELECT * FROM customers";
        //Thuc thi truy van,tra ket qua ve cho DT ResultSet
        //ResultSet chua ket qua tra ve tu csdl
        ResultSet rs = stm.executeQuery(query);

        //Doc ban ghi tren ResultSet
        while(rs.next()){
            //doc customer_id co kieu int
            int cusId = rs.getInt(1);
//            int cusId2 = rs.getInt("customer_id");
            String first_name = rs.getString(2);
            String last_name = rs.getString(3);
            String email = rs.getString(4);
            System.out.println("=======================");
            System.out.println("Customer id: "+ cusId);
            System.out.println("First Name: "+first_name);
            System.out.println("Last name: "+last_name);
            System.out.println("Email: "+email);
        }
        connection.close();
    }

    //Them ban ghi trong csdl
    public static void createCustomer() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        Statement stm = connection.createStatement();
        String query = "INSERT INTO customers(customer_id,first_name,last_name,email)" +
                       " VALUES(3,'NGUYEN','THANH NAM','nam@fpt.edu.vn')";
        //Ham excuteUpdate dung cho muc dich : INSERT, UPDATE, DELETE
        int count = stm.executeUpdate(query);
        System.out.println(count);

    }
    public static void getCustomerVsPreparedStatement() throws SQLException{
        Connection connection = MySQLConnectionDB.getMyConnection();
        //Truy van
        String query = "SELECT * from customers where customer_id=? and last_name like ?";
        //Tao doi tuong PreparedStatement
        PreparedStatement pstm = connection.prepareStatement(query);
        //Thiet lap tham so cho dau ? dau tien(so 1)
        pstm.setInt(1,3);
        //Thiet lap tham so cho dau ? thu 2(so 2)
        pstm.setString(2,"THANH NAM");

        //Ket qua tra ve DT ResultSet
        ResultSet rs = pstm.executeQuery();
        while (rs.next()){
            System.out.println("================use PreparedStatement==============");
            System.out.println("Customer id: "+rs.getInt("customer_id"));
            System.out.println("First name: " +rs.getString(2));
            System.out.println("Last name: " +rs.getString(3));
            System.out.println("Email: "+ rs.getString(4));
        }
        connection.close();
    }

}
