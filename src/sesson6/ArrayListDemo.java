package sesson6;

import java.util.*;


public class ArrayListDemo {
    public static void arrayListMethod(){
        // ArrayList tao bang 2 cach
        //C1:
        ArrayList<String> student = new ArrayList<>();

        //C2: dùng class cha hoặc interface
        List<String> animal = new ArrayList<>();

        //Thêm ptu vao ArrayList
        student.add("Ngoc");
        student.add("Hung");
        student.add("Vinh");
        student.add("Dat");
        student.add("Hai");
        //Hiển thị thông tin
        System.out.println(student);
//        display(student);
        show(student);
        System.out.println("========================");

        student.add(2,"Thu");
        display(student);
        System.out.println("========================");

        student.addFirst("Manh");
        student.addLast("Duong");
        int size = student.size();
        display(student);
        System.out.println("========================");
        //lay 1 ptu theo index
        String st = student.get(1);
        System.out.println("Phan tu co index = 1: " + st);
        System.out.println("========================");
        //lay ptu dau tien
        String firstStudent = student.getFirst();//student.getLast();
        System.out.println("SV dau tien: "+firstStudent);
        System.out.println("========================");
        //Sua gia tri
        student.set(4,"new name at index 4");
        System.out.println("The final list after updated");
        display(student);

        //Xoa ptu dau tien va lay ra
        String first = student.removeFirst();
        //Remove bat ki
        student.remove(1);
        student.remove("Thu");
        //Xoa toan bo
        student.clear();
        size = student.size();
        System.out.println("ArrayList sau khi clear: "+ size);
        System.out.println("List sau khi clear:");
        display(student);
        System.out.println("========================");

    }
    public static void display(ArrayList list){
        for (int i =0; i<list.size(); i++){
            System.out.println(list.get(i));
        }

    }
    public static void show(ArrayList list){
        //Su dung foreach de in thong tin
        for (Object arrList : list){
            System.out.println(arrList);
        }
    }

    public static void main(String[] args) {
//        ArrayListDemo arrayListDemo = new ArrayListDemo();
//        arrayListDemo.arrayListMethod();
        arrayListMethod();
    }
}
