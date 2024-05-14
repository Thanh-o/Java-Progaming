package Java2PracticalTest.Model;

import Java2PracticalTest.Entity.Contact;
import Java2PracticalTest.MySQLConnectionDB;


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public abstract class ContactDAOImpl extends ContactDAO {
    private static final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMyConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private PreparedStatement pstm = null;
    public ContactDAOImpl() throws SQLException{}

    private final String SQL_ADD = "insert into contact values(?,?,?,?,?)";
    private final String SQL_FIND_BY_ID = "select * from contact where name = ?";
    private final String SQL_GET_ALL = "SELECT * FROM contact";

    @Override
    public ArrayList<Contact> getAll(Contact contact) throws SQLException {
        ArrayList<Contact> List = new ArrayList<>();
        pstm = conn.prepareStatement(SQL_GET_ALL);
        ResultSet rs = pstm.executeQuery();

        while (rs.next()) {
            contact.setContact_id(rs.getInt("contact_id"));
            contact.setName(rs.getString("name"));
            contact.setCompany(rs.getString("company"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone(rs.getInt("phone"));
            List.add(contact);
        }
        return List;
    }
    @Override
    public Contact findById(String name,Contact contact) throws SQLException {
        pstm = conn.prepareStatement(SQL_FIND_BY_ID);
        pstm.setString(1,name);
        ResultSet rs = pstm.executeQuery();

        if (rs.next()) {
            contact.setCompany(rs.getString("company"));
            contact.setEmail(rs.getString("email"));
            contact.setPhone(rs.getInt("phone"));
            return contact;
        }
        return null;
    }
    @Override
    public void add(Contact contact) throws SQLException {
        pstm = conn.prepareStatement(SQL_ADD);
        pstm.setString(1, contact.getName());
        pstm.setInt(4, contact.phone);
        pstm.setString(3, contact.company);
        pstm.setString(2, contact.getEmail());

        pstm.executeUpdate();
    }
}
