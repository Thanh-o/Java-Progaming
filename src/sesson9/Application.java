package sesson9;

import sesson9.entity.Customers;
import sesson9.model.CustomerDAO;
import sesson9.model.CustomerDaoImpl;
import sesson9.view.CustomerConsoleUI;
import sesson9.view.LoginConsoleUI;

import java.sql.SQLException;
import java.util.ArrayList;

public class Application {
    public static void main(String[] args) throws SQLException {
//        LoginConsoleUI ui = new LoginConsoleUI();
//        ui.start();

        CustomerConsoleUI ui = new CustomerConsoleUI();
        ui.start();

    }
}
