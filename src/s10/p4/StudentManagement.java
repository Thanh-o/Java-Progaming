package s10.p4;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentManagement {
    public static void main(String[] args) {
        ArrayList<String> student = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int choice;
        for (int i = 1;i<=8; i++){
            System.out.println("\n1. Add Students");
            System.out.println("2. Update a Student");
            System.out.println("3. Delete a Student");
            System.out.println("4. Search Students");
            System.out.println("5. Display All Students");
            System.out.println("6. Save to File");
            System.out.println("7. Load from File");
            System.out.println("8. Exit");
            System.out.print("Your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 1:
                    System.out.println("\n1. Add Students");
                    break;
                case 2:
                    System.out.println("2. Update a Student");
                    break;
                case 3:
                    System.out.println("3. Delete a Student");
                    break;
                case 4:
                    System.out.println("4. Search Students");
                    break;
                case 5:
                    System.out.println("5. Display All Students");
                    break;
                case 6:
                    System.out.println("6. Save to File");
                    break;
                case 7:
                    System.out.println("7. Load from File");
                    break;
                case 8:
                    System.out.println("Exiting program.");
                    break;
                default:
                    System.out.println("Invalid choice. Please choose a number from 1 to 8.");
            }
        }

    }
    }


