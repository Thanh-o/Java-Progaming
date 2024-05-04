package session9.model;

import session9.entity.Customers;
import java.sql.*;
import java.util.ArrayList;

public class CustomerDaoImpl implements CustomerDAO {
    private static final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMyConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PreparedStatement pstm = null;

    public CustomerDaoImpl() throws SQLException {
    }
    private final String SQL_ADD_CUSTOMER = "insert into customers values(?,?,?,?)";
    private final String SQL_FIND_CUSTOMER_BY_ID = "select * from customers where customer_id = ?";
    private final String SQL_GET_ALL_CUSTOMER = "SELECT * FROM customers";
    private final String SQL_DELETE_CUSTOMER = "delete from customers where customer_id = ?";
    private final String SQL_EDIT_CUSTOMER = "update customers where customer_id = ?";
    @Override
    public ArrayList<Customers> getAllCustomer(Customers customer) throws SQLException {
        ArrayList<Customers> customerList = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL_CUSTOMER);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            customer.setCustomer_id(rs.getInt("customer_id"));
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setEmail(rs.getString("email"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customers findCustomerById(int id,Customers customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_FIND_CUSTOMER_BY_ID);
        pstm.setInt(1, id);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setEmail(rs.getString("email"));
            return customer;
        }
        return null;
    }
    @Override
    public void addCustomer(Customers customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_ADD_CUSTOMER);
        pstm.setString(1, customer.getEmail());
        pstm.setInt(2, customer.getCustomer_id());
        pstm.setString(3, customer.getFirst_name());
        pstm.setString(4, customer.getLast_name());

        pstm.executeUpdate();
    }


    @Override
    public void deleteCustomer(int id) throws SQLException {
        pstm = conn.prepareStatement(SQL_DELETE_CUSTOMER);
        pstm.setInt(1, id);
        pstm.executeUpdate();
    }


    @Override
    public void editCustomer(int id, Customers customer) throws SQLException {
        pstm = conn.prepareStatement(SQL_EDIT_CUSTOMER);
        pstm.setString(1, customer.getFirst_name());
        pstm.setString(2, customer.getLast_name());
        pstm.setString(3, customer.getEmail());
        pstm.setInt(4, id);
        pstm.executeUpdate();
    }
}