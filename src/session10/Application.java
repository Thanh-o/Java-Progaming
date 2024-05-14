package session10;

import session10.entity.Product;
import session10.model.Model;
import session10.view.ProductConsoleUI;
import session10.entity.Customer;

import java.sql.SQLException;

public class Application {
    public static void main(String[] args)throws SQLException {
        Model<Customer> customersModel = new Model<Customer>();
        Model<Product> productModel = new Model<Product>();
        ProductConsoleUI productConsoleUI = new ProductConsoleUI();
        productConsoleUI.start();
    }
}
