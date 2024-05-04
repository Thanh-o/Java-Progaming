package session9.model;

import session9.entity.Users;

import java.sql.*;

public class LoginDaoImpl implements LoginDAO {
    private static final Connection conn;

    static {
        try {
            conn = MySQLConnectionDB.getMyConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    private Statement stm = null;
    private PreparedStatement pstm = null;

    public LoginDaoImpl()throws SQLException {
    }

    @Override
    public String checkLoginStatement(Users user) throws SQLException {
        // Step1: query, step2: Create statement, step3: ResultSet, step4: while
        String username = user.getUsername();
        String password = user.getPassword();
        String query = "select username from users where username like '"+username+"' "+" and password like '"+password+"' ";
//        String query = "select" + "username" + "from" + "user";
        //Tao Statement moi lan thuc thi
        stm = conn.createStatement();
//try {
//    stm = conn.createStatement();
//
//}
//catch (SQLException ex){
//    ex.printStackTrace();
//}
        ResultSet rs = stm.executeQuery(query);
        while (rs.next()){
            System.out.println("Username is: "+rs.getString("username"));
            return rs.getString("username");
        }
            return "Not in the database";
        }

        @Override
        public String checkLoginPrepapedStatement (Users user) throws SQLException {
        String query = "select username from users where username like ? and password like ?";
        pstm = conn.prepareStatement(query);
        pstm.setString(1,user.getUsername());
        pstm.setString(2,user.getPassword());
            ResultSet rs = pstm.executeQuery();
            while (rs.next()){
                System.out.println("Username is: "+rs.getString("username"));
                return rs.getString("username");
            }
            return "Not in the database";
        }
        }

