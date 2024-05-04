package sesson9.model;

import sesson9.entity.Users;

import java.sql.SQLException;

public interface LoginDAO {
    public String checkLoginStatement(Users user) throws SQLException;
    public String checkLoginPrepapedStatement(Users user) throws SQLException;
}
