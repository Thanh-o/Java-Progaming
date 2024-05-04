package session3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class JavaApplication {
    /*Khối lệnh try-catch và finally
     * try{
     * //code có thể ném ra ngoại lệ
     * }catch(Exception_class_name e){
     * //code xử lý ngoại lệ
     * }finally{
     * //code trong khối này luôn được thực thi
     * }
     * 1 số phương thức(method) của lớp exception
     * getMessage(): trả về 1 message cụ thể về exception đã xảy ra
     * getCause(): trả về nguyên nhân xảy ra Exception
     * toString(): trả về tên của lớp và kết hợp với kết quả từ phương thức getMessage()
     * printStackTrace(): in ra kết quả của phương thức toString() cùng với stack trace đến System.err
     * fillInStackTrace(): Làm đầy stack trace của đối tượng Throwable bằng stack trace hiện tại
     * ********
     * Throw và Throws
     * Từ khóa throw trong java được sử dụng để ném ra 1 ngoại lệ(exception) cụ thể
     * cta có thể ném ra 2 ngoại lệ check cà uncheck trong java bằng từ khóa là throw
     * Từ khóa throw chủ yếu được sử dung để ném ra ngoại lệ tùy chỉnh(ngoại lệ do người dùng định nghĩa)
     * Sau throw là 1 hoặc nhiều instance
     * Không thể throw nhiều exceptions
     * Từ khóa throws
     * Từ khóa throws trong java được sd khi bạn không muốn phải xây dựng try catch bên trong 1 method nào đó
     * Bạn "đẩy trách nhiệm" phải try catch này cho phương thức nào đó bên ngoài có gọi đến nó hoặc try catch giúp bạn
     * Sau throws là 1 hoặc nhiều class.Có thể khai báo nhiều exceptions
     * Ví dụ: public void methodName() throws IOException, SQLException{...}
     *
     */

    public static void main(String[] args) throws Exception {
//        ThrowDemo.validate();
//        ThrowsDemo.getAge();
        //Custom exception
        try {
            int age = inputAge();
            System.out.println("Tuoi da nhap: " + age);

        } catch (AgeCheckingExc e) {
            System.out.println(e.getMessage());

        }

    }

    static int inputAge() throws AgeCheckingExc {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap tuoi cua ban: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCheckingExc("Tuoi khong duoc nho hon 0");

        } catch (InputMismatchException e) {
            throw new AgeCheckingExc("Tuoi phai la so(number)");
        }
        return age;

    }
}
