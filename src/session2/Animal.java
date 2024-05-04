package session2;
//khai bao lop abstract
//Lớp này có thể chứa 1 hoặc nhiêu phương thức abstract
//cho phép các lớp con kế thừa và thay đổi hành vi trong method abstract

public abstract class Animal {
    private String name;
    public Animal(){
        //gan gia tri mac dinh cho name
       // this.name = "Tom";
        this.name = this.getAnimalName();
    }

    public Animal(String name) {
        //Constructor này sẽ được gọi trong constructỏ của lớp Dog bằng từ khóa super
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //abstract : đây là lớp "trừu tượng" -> có thể được "sửa" ở lớp con
    //Lớp con định nghĩa lại hành vi mà nó muốn
    //Thể hiện tính chất Đa hình
    //Không chứa mã code bên trong
    //Nó phải thuộc về 1 lớp
    public abstract String getAnimalName();
}
