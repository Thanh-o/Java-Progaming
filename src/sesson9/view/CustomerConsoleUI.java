package sesson9.view;

import sesson9.controller.CustomerController;
import sesson9.entity.Customers;

import java.sql.SQLException;
import java.util.Scanner;

public class CustomerConsoleUI {
    private CustomerController customerController;
    private Scanner scanner;

    public CustomerConsoleUI() throws SQLException {
        this.customerController = new CustomerController();
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("1. Show all customers");
        System.out.println("2. Find customer by ID");
        System.out.println("3. Add new customer");
        System.out.println("4. Delete customer");
        System.out.println("5. Edit customer");
        System.out.println("6. Exit");
    }

    public void start() {
        int choice = 0;
        do {
            displayMenu();
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    showAllCustomers();
                    break;
                case 2:
                    findCustomerById();
                    break;
                case 3:
                    addNewCustomer();
                    break;
                case 4:
                    deleteCustomer();
                    break;
                case 5:
                    editCustomer();
                    break;
                case 6:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);


        scanner.close();
    }



    private void showAllCustomers() {
        Customers customer = new Customers() ;
        System.out.println("All customers:");
        customerController.getAllCustomers(customer).forEach(System.out::println);
    }

    private void findCustomerById() {
        Customers customer = new Customers() ;
        System.out.print("Enter customer ID: ");
        int id = scanner.nextInt();
         customerController.findCustomerById(id, customer);
        if (customer != null) {
            System.out.println("Customer found: " + customer);
        } else {
            System.out.println("Customer not found.");
        }
    }

    private void addNewCustomer() {
        System.out.print("Enter first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter email: ");
        String email = scanner.nextLine();

        Customers newCustomer = new Customers();
        customerController.addCustomer(newCustomer);
        System.out.println("New customer added successfully.");
    }

    private void deleteCustomer() {
        System.out.print("Enter customer ID to delete: ");
        int id = scanner.nextInt();
        customerController.deleteCustomer(id);
        System.out.println("Customer deleted successfully.");
    }

    private void editCustomer() {
        System.out.print("Enter customer ID to edit: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character

        System.out.print("Enter new first name: ");
        String firstName = scanner.nextLine();
        System.out.print("Enter new last name: ");
        String lastName = scanner.nextLine();
        System.out.print("Enter new email: ");
        String email = scanner.nextLine();

        Customers updatedCustomer = new Customers();
        customerController.editCustomer(id, updatedCustomer);
        System.out.println("Customer updated successfully.");
    }


}
