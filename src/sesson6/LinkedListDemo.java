package sesson6;

import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void demoLinkList() {
        //Khởi tạo LinkedList
        LinkedList<String> student = new LinkedList<>();
        //them ds
        student.add("Ngoc");
        student.add("Thanh");
        student.add("Tung");
        student.add("Binh");
        student.add("Trong");
        List<String> animal = new LinkedList<>();
        //Về cơ bản thì nó tương đương các phương thức trong arrayList
        //add...,set...,get,remove...,clear()
        //poll():trả về ptu đầu tiên và xóa khỏi danh sách
        student.poll();
        //pollLast(): Trả về ptu cuối và xóa khỏi ds
        student.pollLast();
        showList(student);
    }
    public static void showList(LinkedList list){
        for (Object linkedList : list){
            System.out.println(linkedList);
        }


    }

    public static void main(String[] args) {
        demoLinkList();

    }
}