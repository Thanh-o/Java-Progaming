package session5;

import java.util.Scanner;

public class ApplicationDemo {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        IntegerArrayDemo integerArrayDemo = new IntegerArrayDemo();
        System.out.println("How many elements of array: ");
        int size = sc.nextInt();
        int intArray[] = new int[size];
        // pass an array to function; create
        integerArrayDemo.createArray(intArray);
        //show
        System.out.println("Truoc khi sap xep");
        integerArrayDemo.show(intArray);
        System.out.println();

        System.out.println("Length of array: " + intArray.length);
        System.out.println("Value of index 3 : " + intArray[3]);
        System.out.println("Sau khi sap xep");
        integerArrayDemo.ascSort(intArray);
    }
    static void stringArrayDemo(){
        String stringArray[] = new String[5];
        stringArray[0] = "Thu";
        stringArray[1] = "Vinh";
        stringArray[2] = "Hoang";
        stringArray[3] = "Vu";
        stringArray[4] = "Thao";

        for (int i = 0; i<stringArray.length;i++){
            System.out.println("String array: " + stringArray[i]);
        }
    }
}
