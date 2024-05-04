package session2;

public class Duck extends Animal{
    private int age;
    private int height;
    private int swim;

    public Duck(int age, int height, int swim) {
        this.age = age;
        this.height = height;
        this.swim = swim;
    }

    public Duck(String name, int age, int height, int swim) {
        super(name);
        this.age = age;
        this.height = height;
        this.swim = swim;
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

    public int getSwim() {
        return swim;
    }

    public void setSwim(int swim) {
        this.swim = swim;
    }

    @Override
    public String getAnimalName() {
        return "Duck";
    }
    public static void main(String []args){
        Duck quick = new Duck("Quick",5,12,5);
        quick.getAnimalName();
        System.out.println("Name: " +quick.getName());
        System.out.println("animal name: " +quick.getAnimalName());
        System.out.println("=======================");

        System.out.println("Age: " +quick.getAge());
        System.out.println("Height: " +quick.getHeight());
        System.out.println("Height: " +quick.getSwim());
    }
}
