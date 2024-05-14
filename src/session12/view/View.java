package session12.view;

import productManager.entity.Product;
import session12.controller.Controller;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;

public class View {
    Controller controller = new Controller<>();
    private final Scanner sc;
    public View()throws SQLException{
        this.sc = new Scanner(System.in);
    }
    private int menu(){
        System.out.println("====Product Management====");
        System.out.println("1. All product");
        System.out.println("2. Create product");
        System.out.println("3. Update product");
        System.out.println("4. Delete product");
        System.out.println("0. Exit product");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    public void getAllEntity()throws SQLException{

    }
    public void start()throws SQLException {
    }
}
