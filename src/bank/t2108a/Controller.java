package bank.t2108a;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Controller {
    private static long balanceNumber = 1000000;
     List<TransactionHistory> listHistory = new ArrayList<TransactionHistory>();

    public long getBalanceNumber() {
        return balanceNumber;
    }

    public static long transfer(long money) {
        if (money < 50000) {
            System.out.println("Số tiền chuyển tối thiểu phải là 50,000 VND.");
            return balanceNumber;
        }
        if (money > balanceNumber) {
            System.out.println("Tài khoản không đủ.");
            return balanceNumber;
        }
        balanceNumber -= money;
        System.out.println("Chuyển khoản thành công.");
        System.out.println("Số dư mới: " + formatMoney(balanceNumber));

        return balanceNumber;
    }

    public void actionTransfer() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số tài khoản thụ hưởng: ");
        String accountNumber = scanner.nextLine();
        System.out.print("Nhập số tiền: ");
        long money = scanner.nextLong();
        transfer(money);
    }

    public void getHistory() {
       //In danh sách lịch sử giao dịch
    }

    //Định dạng số tiền theo mình mong muốn
    public static String formatMoney(long money) {
        DecimalFormat formatter = new DecimalFormat("###,###,##0.00");
        //100000->100,000.00
        return formatter.format(money);
    }

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.actionTransfer();
        // controller.getHistory();
    }
}

