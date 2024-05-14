package Java2PracticalTest;

import Java2PracticalTest.Controller.Controller;
import Java2PracticalTest.Entity.Contact;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Application {


    public static <Int> void main(String[] args) throws SQLException {

        ArrayList<Contact> contacts = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("Address Book Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            Controller controller = new Controller();

            switch (choice) {
                case 1:
                    System.out.print("Enter id: ");
                    int contact_id = Integer.parseInt(scanner.nextLine());
                    System.out.print("Enter name: ");
                    String name = scanner.next();
                    System.out.print("Enter company: ");
                    String company = scanner.next();
                    System.out.print("Enter email: ");
                    String email = scanner.next();
                    System.out.print("Enter phone: ");
                    int phone = Integer.parseInt(scanner.nextLine());
                    controller.add(new Contact(contact_id,name, company, email, phone));
                    System.out.println("Contact added successfully!");
                    break;
                case 2:
                    System.out.print("Enter name to find: ");
                    String searchName = scanner.next();
                    boolean found = false;
                    for (Contact contact : contacts) {
                        if (contact.getName().equals(searchName)) {
                            System.out.println("Phone number for " + searchName + " is: " + contact.getPhone());
                            found = true;
                            break;
                        }
                    }
                    if (!found) {
                        System.out.println("Not found");
                    }
                    break;
                case 3:
                    System.out.println("Address Book:");
                    System.out.println("Name\tCompany\tEmail\tPhone");
                    for (Contact contact : contacts) {
                        System.out.println(contact.getName() + "\t" + contact.company + "\t" + contact.email + "\t" + contact.getPhone());
                    }
                    break;
                case 4:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        } while (choice != 4);


    }
}