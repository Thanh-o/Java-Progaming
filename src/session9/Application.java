package session9;

import session9.view.CustomerConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
//        LoginConsoleUI ui = new LoginConsoleUI();
//        ui.start();

        CustomerConsoleUI ui = new CustomerConsoleUI();
        ui.start();

    }
}
