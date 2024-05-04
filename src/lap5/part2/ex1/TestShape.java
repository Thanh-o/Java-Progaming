package lap5.part2.ex1;

public class TestShape {
    public static void main (String[] args){
        Rectangle rectangle = new Rectangle("red", 4, 5);
        Triangle triangle = new Triangle("blue", 5, 6);

        System.out.println(rectangle );
        System.out.println("Rectangle area: " + rectangle.getArea());

        System.out.println(triangle);
        System.out.println("Triangle area: " + triangle.getArea());

    }
}
