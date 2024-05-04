package libraryManagement;

import libraryManagement.view.ConsoleUI;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws SQLException {
        ConsoleUI ui = new ConsoleUI();
        ui.start();
    }
}
