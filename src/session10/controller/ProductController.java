package session10.controller;

import session10.entity.Product;
import session10.model.ProductDaoImpl;

import java.sql.SQLException;
import java.util.ArrayList;

public class ProductController {
    ProductDaoImpl productDaoImpl = new ProductDaoImpl();
    public  ProductController() throws SQLException{}
    public ArrayList<Product> getAllProductController()throws SQLException{
        ArrayList<Product> products = productDaoImpl.getAllProduct();
        return products;
    }
    public void createProductController(Product product)throws SQLException{
        productDaoImpl.createProduct(product);
    }



}