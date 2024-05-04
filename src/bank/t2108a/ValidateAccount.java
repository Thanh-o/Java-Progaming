package bank.t2108a;

public class ValidateAccount {
    // Kiểm tra đăng nhập
    public final String MOBILE = "8984999999";
    public final String PASSWORD = "Ngo Van Khoai";
    // Method to check account credentials
    public boolean checkAccount(String mobile, String password) {
        if (mobile.equals(MOBILE)) {
            if (password.equals(PASSWORD)) {
                System.out.println("Đăng nhập thành công!");
                return true;
            } else {
                System.out.println("Mật khẩu sai, vui lòng nhập lại");
                return false;
            }
        } else {
            System.out.println("Kiểm tra lại số điện thoại hoặc password");
            return false;
        }
    }
}

