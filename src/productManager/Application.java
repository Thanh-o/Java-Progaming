package productManager;
import productManager.view.ConsoleUI;
import java.sql.SQLException;

public class Application {
    public static void main(String[] args) throws Exception {
        ConsoleUI ui = new ConsoleUI();
        ui.start();
    }
}
