package lap4;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(1.0, "red", 1.0);
        System.out.println(cylinder);
        System.out.println("Cylinder volume: " + cylinder.getVolume());
        System.out.println("Cylinder surface area: " + cylinder.getArea());

    }
}