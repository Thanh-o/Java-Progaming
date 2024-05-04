package session9.controller;

import session9.entity.Users;
import session9.model.LoginDaoImpl;

import java.sql.SQLException;

public class LoginController {
    //Call instance of Model step 2
    LoginDaoImpl loginDao = new LoginDaoImpl();

    public LoginController() throws SQLException {
    }
    public String loginStatementController(Users user)throws SQLException{
        //Step2 and 3
        //        return loginDao.checkLoginStatement(user);
        //Step2
        String message = loginDao.checkLoginStatement(user);
        //step3
        return message;
    }
    public String loginPrepareStatementController(Users user)throws SQLException{
        //Step2
        String message = loginDao.checkLoginPrepapedStatement(user);
        //Step3
        return message;
    }
}
