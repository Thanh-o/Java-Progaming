package s10.p4;

public class Student {
    int rollNumber;
    String name;
    int age;
    int mark;

    public Student(int rollNumber, String name, int age, int mark) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student{" +
                "rollNumber=" + rollNumber +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", mark=" + mark +
                '}';
    }
}
