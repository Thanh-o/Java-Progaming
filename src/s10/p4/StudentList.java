package s10.p4;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class StudentList {





        private ArrayList<Student> list; // ArrayList<class mà ta sử dụng> tạo tên biến

        // tạo contructor rỗng không nhập gì bên trong
        public StudentList() {

            this.list = new ArrayList<Student>(); // cách khai báo 1 ArrayList
        }

        public StudentList(ArrayList<Student> list) {
            this.list = list;
        }

        //1. Ham thêm sinh viên vào danh sách
        public void addStudent(Student sv) { //ngta truyền cho mình 1 biến sv và mk sẽ add nó vào danh sách

            this.list.add(sv); // phương thức trèn vào cuối danh sách
        }

        //2. In danh sách sinh viên ra màn hình
        public void inStudentList() {
            //duyệt phần tử bên trong ArrayList
            for (Student st : list) { //tạo 1 biến sinhVien có kiểu là SinhVien và lấy hết phần tử trong danhSach của mình
                System.out.println(st);
            }
        }

        //3. Kiểm tra danh sách có rỗng hay không.
        public boolean Checkforemptylist
            () {
            return this.list.isEmpty();
        }

        //4. Lấy ra số lượng sinh viên trong danh sách
        public int getStudent() {
            return this.list.size();
        }

        //5. làm rỗng danh sách sinh viên
        public void removeStudentList() {
            this.list.removeAll(list);
        }

        //6. kiểm tra sinh viên có tồn tại trong danh sách hay không, dựa trên mã sinh viên
        public boolean CheckStudent(Student sv) {
            return this.list.contains(sv);
        }

        //7. Xóa một sinh viên ra khỏi danh sách dựa trên mã sinh viên
        public boolean deleteStudent(Student sv) {
            return this.list.remove(sv);
        }


    }

