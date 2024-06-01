package Java2PracticalTest.Controller;

import Java2PracticalTest.Entity.Contact;
import Java2PracticalTest.Model.ContactDAO;
import Java2PracticalTest.Model.ContactDAOImpl;

import java.util.List;

public class Controller {
    private ContactDAO contactDAO;

    public Controller(ContactDAO contactDAO) {
        this.contactDAO = contactDAO;
    }

    public void addContact(String name, String company, String email, int phone) {
        Contact contact = new Contact(name, company, email, phone);
        contactDAO.addContact(contact);
    }

    public Contact findContactByName(String name) {
        return contactDAO.findContactByName(name);
    }

    public List<Contact> getAllContacts() {
        return contactDAO.getAllContacts();
    }
}
