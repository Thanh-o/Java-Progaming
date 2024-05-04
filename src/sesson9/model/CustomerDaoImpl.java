package sesson9.model;

import sesson9.entity.Customers;
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

    @Override
    public ArrayList<Customers> getAllCustomer(Customers customer) throws SQLException {
        ArrayList<Customers> customerList = new ArrayList<>();
        String query = "SELECT * FROM customers WHERE first_name LIKE ? AND last_name LIKE ? AND email LIKE ?";
        pstm = conn.prepareStatement(query);
        pstm.setString(1,   customer.getFirst_name() );
        pstm.setString(2,   customer.getLast_name());
        pstm.setString(3,   customer.getEmail());
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            customer.setFirst_name(rs.getString("first_name"));
            customer.setLast_name(rs.getString("last_name"));
            customer.setEmail(rs.getString("email"));
            customerList.add(customer);
        }
        return customerList;
    }

    @Override
    public Customers findCustomerById(int id,Customers customer) throws SQLException {
        String query = "SELECT * FROM customers WHERE id = ?";
        pstm = conn.prepareStatement(query);
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
        String query = "INSERT INTO customers (first_name, last_name, email) VALUES (?, ?, ?)";
        pstm = conn.prepareStatement(query);
        pstm.setString(1, customer.getFirst_name());
        pstm.setString(2, customer.getLast_name());
        pstm.setString(3, customer.getEmail());
        pstm.executeUpdate();
    }

    @Override
    public void deleteCustomer(int id) throws SQLException {
        String query = "DELETE FROM customers WHERE id = ?";
        pstm = conn.prepareStatement(query);
        pstm.setInt(1, id);
        pstm.executeUpdate();
    }


    @Override
    public void editCustomer(int id, Customers customer) throws SQLException {
        String query = "UPDATE customers SET first_name = ?, last_name = ?, email = ? WHERE id = ?";
        pstm = conn.prepareStatement(query);
        pstm.setString(1, customer.getFirst_name());
        pstm.setString(2, customer.getLast_name());
        pstm.setString(3, customer.getEmail());
        pstm.setInt(4, id);
        pstm.executeUpdate();
    }
}