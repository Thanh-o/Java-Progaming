package Java2PracticalTest.Model;


import Java2PracticalTest.Entity.Contact;

import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ContactDAO {
    abstract ArrayList<Contact> getAll(Contact contact) throws SQLException;

    public abstract Contact findById(Contact contact) throws SQLException;

    public abstract Contact findById(String name, Contact contact) throws SQLException;

    public abstract void add(Contact contact) throws SQLException;
}
