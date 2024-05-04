package Practical_Test;

import java.util.Scanner;

public class Account {
     String customerCode;
     String customerName;
     int accNumber;
     long amount ;

    public void Input(Account account) {
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
                long money;
                do {
                    System.out.print("Enter the amount for the transaction: ");
                    money = scanner.nextLong();
                   account.depositAndWithdraw(money, type);
                } while (money <= 0);
            } else {
                System.out.println("Invalid transaction type. Please enter 0 for deposit or 1 for withdrawal.");
            }
        } while (type != 0 && type != 1);
        System.out.println(account.toString());
        scanner.close();
    }

    public boolean depositAndWithdraw(long money, int type) {
        if (type == 0 && money > 0) {
            amount += money;
            System.out.println("Deposit successful.");
            return true;
        } else if (type == 1 && money > 0 ) {
                amount -= money;
                System.out.println("Withdrawal successful.");
                return true;
        } else {
            System.out.println("Invalid transaction type or amount.");
            return false;
        }
    }

    @Override
    public String toString() {
        return  "*********************************"
                + "\nCustomer Code: " + customerCode
                + "\nCustomer Name: " + customerName
                + "\nAcc Number: " + accNumber
                + "\nAmount: " + amount;
    }

    public static void main(String[] args) {
        Account account = new Account();
        account.Input(account);
    }
}

