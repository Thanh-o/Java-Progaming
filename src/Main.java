import session1.Person;
public class Main {
    public static void main(String[] agrs){
        Person newName = new Person("Binh", 1954, "09123456");
        newName.setName("Hai");
        newName.setBornYear(1998);
        newName.setPhone("123456789");
        Person truongGia = new Person("Binh", 1954, "09123456");
        Person truongTung = new Person("Tung", 1956, "090123456");
        Person noname;//Chua cap phat va khoi tao
        //lay ten cua doi tuong getter
        truongGia.getName();
        //doi ten cua doi tuong setter
        truongGia.setName("new Name");
    }
}