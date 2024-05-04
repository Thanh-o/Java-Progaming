package session7;

import java.util.Iterator;
import java.util.LinkedHashSet;

//Duy trì thứ tự chèn, chứa các ptu ko trùng nhau
//Cho phép ptu null
public class LinkedHashSetExample {
    public static void linkedHashSetDemo(){
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        //adding element
        linkedHashSet.add("Java");
        linkedHashSet.add("C#");
        linkedHashSet.add("HTML");
        linkedHashSet.add("Python");
        linkedHashSet.add("ASP.NET");
        linkedHashSet.add("ASP.NET");

        //Check exists
        System.out.println("Check exists: " +linkedHashSet.contains("C#"));
        System.out.println("LinkedHashSet: " +linkedHashSet);
        //Iterator: Dung de lap thong qua 1 LinkedHashSet
        Iterator iterator = linkedHashSet.iterator();
        while (iterator.hasNext())
            System.out.println(iterator.next() +" ");
        System.out.println();

        //Use foreach
        for (String str : linkedHashSet)
            System.out.println(str +", ");
    }

    public static void main(String[] args) {
        linkedHashSetDemo();
    }
}
