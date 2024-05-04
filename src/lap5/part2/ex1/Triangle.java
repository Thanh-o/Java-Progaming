package lap5.part2.ex1;

import lap5.part2.ex1.Shape;

public class Triangle extends Shape {
    private double base;
    private double height;

    public Triangle(String color, double base, double height) {
        super(color);
        this.base = base;
        this.height = height;
    }

    @Override
    public double getArea() {
        return 0.5 * base * height;
    }

    @Override
    public String toString() {
        return "Triangle{" + super.toString() +
                "base=" + base +
                ", height=" + height +
                '}';
    }
}
