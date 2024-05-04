package libraryManagement.entity;

public class Librarian {
    private int book_id;
    private int student_id;
    private String book_name;
    private String student_name;

    public Librarian() {
        this.book_id = book_id;
        this.student_id = student_id;
        this.book_name = book_name;
        this.student_name = student_name;
    }

    public int getBook_id() {
        return book_id;
    }

    public void setBook_id(int book_id) {
        this.book_id = book_id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public void setStudent_id(int student_id) {
        this.student_id = student_id;
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getStudent_name() {
        return student_name;
    }

    public void setStudent_name(String student_name) {
        this.student_name = student_name;
    }


    public int getId() {
        return 0;
    }

    public void setId(int id) {
    }
}
