package session2;

public class AppName {
    public static void main(String[] args){
        Dog quick = new Dog("Quick", 5,128);
        //gọi các phương thức kế thừa của lớp cha
        System.out.println("Name: " +quick.getName());
        System.out.println("animal name: " +quick.getAnimalName());
        System.out.println("=======================");

        //gọi các phương thức khai báo trên lớp Dog
        System.out.println("Age: " +quick.getAge());
        System.out.println("Height: " +quick.getHeight());

        //Thể hiện tính đa hình
        Dog quick2 = new PhuQuocDog("PQ Dog", 3,130);
        System.out.println("Animal name: " +quick2.getAnimalName());
    }
}
