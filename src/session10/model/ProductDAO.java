package session10.model;

import session10.entity.Product;

import java.sql.SQLException;
import java.util.ArrayList;

public interface ProductDAO {
    void createProduct(Product product) throws SQLException;
    Product getProductById(int ProdId) throws SQLException;
    ArrayList<Product> getAllProduct() throws SQLException;
    void updateProduct(Product product) throws SQLException;
    boolean deleteProduct(int ProdId) throws SQLException;
    ArrayList<Product> findByName(String name) throws SQLException;
}
