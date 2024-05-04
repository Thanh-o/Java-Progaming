package lap5.part2.ex3;

public class MovableCircle implements Movable{
    int radius;
    MovablePoint center;

    public MovableCircle(int radius, MovablePoint center) {
        this.radius = radius;
        this.center = center;
    }

    @Override
    public void moveUp() {

    }

    @Override
    public void moveDown() {

    }

    @Override
    public void moveLeft() {

    }

    @Override
    public void moveRight() {

    }

    @Override
    public String toString() {
        return "MovableCircle {" +
                "radius = " + radius +
                ", center = " + center +
                '}';
    }

    }


