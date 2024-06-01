package Java2PracticalTest.Model;

import Java2PracticalTest.Entity.Contact;
import Java2PracticalTest.MySQLConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ContactDAOImpl implements ContactDAO {
    @Override
    public void addContact(Contact contact) {
        String sql = "INSERT INTO contacts (name, company, email, phone) VALUES (?, ?, ?, ?)";
        try (Connection conn = MySQLConnectionDB.getMyConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, contact.getName());
            pstmt.setString(2, contact.getCompany());
            pstmt.setString(3, contact.getEmail());
            pstmt.setInt(4, contact.getPhone());
            pstmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }



    @Override
    public Contact findContactByName(String name) {
        String sql = "SELECT * FROM contacts WHERE name = ?";
        try (Connection conn = MySQLConnectionDB.getMyConnection();
             PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, name);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                return new Contact(rs.getString("name"), rs.getString("company"),
                        rs.getString("email"), rs.getInt("phone"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public List<Contact> getAllContacts() {
        List<Contact> contacts = new ArrayList<>();
        String sql = "SELECT * FROM contacts";
        try (Connection conn = MySQLConnectionDB.getMyConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(sql)) {
            while (rs.next()) {
                contacts.add(new Contact(rs.getString("name"), rs.getString("company"),
                        rs.getString("email"), rs.getInt("phone")));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return contacts;
    }
}
