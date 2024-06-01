package Java2PracticalTest.view;

import Java2PracticalTest.Controller.Controller;
import Java2PracticalTest.Entity.Contact;

import java.util.Scanner;

public class View {
    private Controller controller;
    private Scanner scanner;

    public View(Controller controller) {
        this.controller = controller;
        this.scanner = new Scanner(System.in);
    }

    public void displayMenu() {
        System.out.println("Address Book Menu:");
        System.out.println("1. Add new contact");
        System.out.println("2. Find a contact by name");
        System.out.println("3. Display contacts");
        System.out.println("4. Exit");
    }

    public void addContact() {
        System.out.println("Enter Name: ");
        String name = scanner.nextLine();
        System.out.println("Enter Company: ");
        String company = scanner.nextLine();
        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        System.out.println("Enter Phone: ");
        int phone = Integer.parseInt(scanner.nextLine());

        controller.addContact(name, company, email, phone);
        System.out.println("Contact added successfully.\n");
    }

    public void findContactByName() {
        System.out.println("Enter the name to search: ");
        String name = scanner.nextLine();
        Contact contact = controller.findContactByName(name);

        if (contact != null) {
            System.out.println("Phone: " + contact.getPhone() + "\n");
        } else {
            System.out.println("Not found\n");
        }
    }

    public void displayContacts() {
        var contacts = controller.getAllContacts();
        if (contacts.isEmpty()) {
            System.out.println("Address book is empty.\n");
        } else {
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
        }
    }

    public void run() {
        while (true) {
            displayMenu();
            System.out.print("Choose an option: ");
            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    findContactByName();
                    break;
                case 3:
                    displayContacts();
                    break;
                case 4:
                    System.out.println("Exiting the program.");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.\n");
            }
        }
    }
}
