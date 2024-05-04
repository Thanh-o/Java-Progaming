package session2;

public class Dog  extends Animal {
    private int age ;
    private int height;

    public Dog(String name,int age, int height) {
        //Gọi tới constructor của lớp Animal
        //Giá trị của Feild trong lớp cha sẽ được gán
        //Constructor public Animal(String name) sẽ được gọi và gán gt
        super(name);
        //Sau đó giá trị Feild trong lớp con mới được gán
        this.age = age;
        this.height = height;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override// Thực hiện triển khai phương thức abstract
    public String getAnimalName() {
        return "Dog";
    }
    public static void main(String []args){
        Dog quick = new Dog("Quick",5,12);
        quick.getAnimalName();
        System.out.println("Name: " +quick.getName());
        System.out.println("animal name: " +quick.getAnimalName());
    }
}
