package Practical_Test;

import java.util.Scanner;

public class Account1 {
    String customerCode;
    String customerName;
    int accNumber;
    long amount ;

    public void Input() {
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("Enter customer code (5 characters): ");
            customerCode = scanner.nextLine();
        } while (customerCode.length() != 5);

        System.out.print("Enter customer name: ");
        customerName = scanner.nextLine();

        do {
            System.out.print("Enter account number (6 digits, starts with '100'): ");
            accNumber = scanner.nextInt();
        } while (!(accNumber >= 100000 && accNumber <= 100999));

        scanner.nextLine();

        int type;
        do {
            System.out.print("Enter transaction type (0 for deposit, 1 for withdrawal): ");
            type = scanner.nextInt();
            if (type == 0 || type == 1) {
                System.out.print("Enter amount of money for the transaction: ");
                long money = scanner.nextLong();

                if (!depositAndWithdraw(money, type)) {
                    System.out.println("Transaction failed. Please try again.");
                }
            } else {
                System.out.println("Invalid transaction type. Please enter 0 for deposit or 1 for withdrawal.");
            }
        } while (type != 0 && type != 1);

        System.out.println(toString());
        scanner.close();
    }

    public boolean depositAndWithdraw(long money, int type) {
        Scanner scanner = new Scanner(System.in);
        if (type == 0 && money > 0) {
            amount += money;
            return true;
        } else if (type == 1 && money > 0 && money <= amount) {
            amount -= money;
            return true;
        }
        else {

            System.out.println("Non-sufficient funds or invalid amount.");


            return false;
        }



    }

    @Override
    public String toString() {
        return "Customer Code: " + customerCode
                + "\nCustomer Name: " + customerName
                + "\nAcc Number: " + accNumber
                + "\nAmount: " + amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.Input(account);

    }
}