package session9.controller;

import session9.entity.Customers;
import session9.model.CustomerDaoImpl;
import java.sql.SQLException;
import java.util.ArrayList;

public class CustomerController {

    CustomerDaoImpl customerDao = new CustomerDaoImpl();

    public CustomerController() throws SQLException {
    }



        public ArrayList<Customers> getAllCustomers(Customers customer) {
            try {

                return customerDao.getAllCustomer(customer);
            } catch (SQLException e) {
                e.printStackTrace();
                return new ArrayList<>();
            }
        }

        public Customers findCustomerById(int id, Customers customer) {
            try {
                return customerDao.findCustomerById(id, customer);
            } catch (SQLException e) {
                e.printStackTrace();
                return null;
            }
        }

        public void addCustomer(Customers customer) {
            try {
                customerDao.addCustomer(customer);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void deleteCustomer(int id) {
            try {
                customerDao.deleteCustomer(id);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        public void editCustomer(int id, Customers customer) {
            try {
                customerDao.editCustomer(id, customer);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }


    }

