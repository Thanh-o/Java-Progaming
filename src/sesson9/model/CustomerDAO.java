package sesson9.model;

import sesson9.entity.Customers;

import java.sql.SQLException;
import java.util.ArrayList;

public interface CustomerDAO {

    ArrayList<Customers> getAllCustomer(Customers customer) throws SQLException;

    public Customers findCustomerById(int id,Customers customer) throws SQLException;

    public void addCustomer(Customers customer) throws SQLException;

    public void deleteCustomer(int id) throws SQLException;

    public void editCustomer(int id, Customers customer) throws SQLException;
}


