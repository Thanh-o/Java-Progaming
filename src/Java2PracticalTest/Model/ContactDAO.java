package Java2PracticalTest.Model;


import Java2PracticalTest.Entity.Contact;

import java.util.List;

public interface ContactDAO {
    void addContact(Contact contact);
    Contact findContactByName(String name);
    List<Contact> getAllContacts();
}

