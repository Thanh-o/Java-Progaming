package Java2PracticalTest.Controller;

import Java2PracticalTest.Entity.Contact;
import Java2PracticalTest.Model.ContactDAOImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class Controller {
    ContactDAOImpl contactDAO = new ContactDAOImpl() {
        @Override
        public Contact findById(Contact contact) throws SQLException {
            return null;
        }
    };
    private Contact contact;

    public Controller() throws SQLException {
    }
    public ArrayList<Contact> getAll(Contact contact) {
        try {

            return contactDAO.getAll(contact);
        } catch (SQLException e) {
            e.printStackTrace();
            return new ArrayList<>();
        }
    }

    public Contact findById(String name,Contact contact) {
        try {
            return contactDAO.findById(name,contact);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }

    public void add(Contact contact) {
        try {
            contactDAO.add(this.contact);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
