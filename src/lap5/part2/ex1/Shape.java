package lap5.part2.ex1;

public abstract class Shape {
    private String color;

    public Shape(String color) {

        this.color = color;
    }

    @Override
    public String toString() {
        return "Shape{" +
                "color='" + color + '\'' +
                '}';
    }

   public abstract double getArea();

}


