package sesson9.view;

import sesson9.controller.LoginController;
import sesson9.entity.Users;

import java.sql.SQLException;
import java.util.Scanner;

public class LoginConsoleUI {
    private final Scanner sc;
    public LoginConsoleUI() throws SQLException {
        this.sc = new Scanner(System.in);
    }
    //step 1
    LoginController loginController = new LoginController();


    Users user = new Users();

    private int menu(){
        System.out.println("=====Admin zone=====");
        System.out.println("1. Login Statement ");
        System.out.println("2. Login PreparedStatement");
        System.out.println("0. Exit");
        int choice = Integer.parseInt(sc.nextLine());
        return choice;
    }
    private void loginStatementUI() throws SQLException {
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        //Step1
        String result = loginController.loginStatementController(user);
        //Step 5
        System.out.println(result);
    }
    private void loginPrepareUI() throws SQLException {
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        System.out.println("Enter password: ");
        String password = sc.nextLine();
        user.setUsername(username);
        user.setPassword(password);
        //Step1
        String result = loginController.loginPrepareStatementController(user);
        //Step 5
        System.out.println(result);
    }
    public void start() throws SQLException {
        while (true){
            int choice = menu();
            switch (choice){
                case 0:
                    System.exit(0);
                    break;
                case 2:
                    loginPrepareUI();break;
                case 1:
                    loginStatementUI();break;
                default:throw new AssertionError();
            }
        }
    }

}
