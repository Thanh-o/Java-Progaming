package Java2PracticalTest;

import Java2PracticalTest.Controller.Controller;
import Java2PracticalTest.Model.ContactDAO;
import Java2PracticalTest.Model.ContactDAOImpl;
import Java2PracticalTest.view.View;

public class Application {

        public static void main(String[] args) {
            ContactDAO contactDAO = new ContactDAOImpl();
            Controller controller = new Controller(contactDAO);
            View view = new View(controller);
            view.run();
        }
    }
