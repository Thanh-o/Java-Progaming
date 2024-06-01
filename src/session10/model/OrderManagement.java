package session10.model;

import session10.entity.OrderDetail;

import java.sql.*;
import java.util.Date;

public class OrderManagement {
    private OrderDetail[] orderDetails;

    public void createOrder() throws SQLException{
        Connection conn = MySQLConnectionDB.getMyConnection();
        PreparedStatement pstm = null;
        ResultSet rs = null;
        conn.setAutoCommit(false);//danh dau diem bat dau cua transaction
        String orderQuery = "insert into orders(customer_id,create_at,update_at,payment_type) value(?,?,?,?)";
        String orderDetailQuery = "insert into order_details(order_id,create_at,ipdate_at,product_id,price) value(?,?,?,?,?)";
        //insert doi voi bang co khoa chinh tang tu dong
        pstm = conn.prepareStatement(orderQuery,PreparedStatement.RETURN_GENERATED_KEYS);
        pstm.setInt(1,1);
        pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
        pstm.setTimestamp(3,new java.sql.Timestamp(new Date().getTime()));
        pstm.setString(4,"Credit Card");
        pstm.executeUpdate();
        //Lay ra key moi generated tu insert order o tren
        rs = pstm.getGeneratedKeys();
        int orderId = -1;
        if (rs.next()){
            orderId = rs.getInt(1);
        }
        if (orderId!=-1){
            //insert orderDetails
            pstm = conn.prepareStatement(orderDetailQuery);
            for (OrderDetail orderDetail : orderDetails);
            pstm.setInt(1,orderId);
            pstm.setTimestamp(2,new java.sql.Timestamp(new Date().getTime()));
            //...
            pstm.addBatch();//cu co 1 chi tiet don hang thi duoc them vao 1 batch
        }
        pstm.executeBatch();//thuc thi ca batch(insert nhieu ban ghi cung luc)
        conn.commit();//danh dau giao dich (transaction) thanh cong
    }
}
