package lap5.part2.ex2;

public class MovablePoint implements Movable{

    int x,y;

    public MovablePoint(int x, int y) {
        this.x = x;
        this.y = y;
    }


    @Override
    public void moveUp() {
         y++;

    }

    @Override
    public void moveDown() {
y--;
    }

    @Override
    public void moveLeft() {
x--;
    }

    @Override
    public void moveRight() {
x++;
    }
    @Override
    public String toString() {
        return "MovablePoint {" +
                "x = " + x +
                ", y = " + y +
                '}';
    }
    public static void main(String[] args) {
        MovablePoint point = new MovablePoint(0, 0);
        System.out.println(point);
        point.moveUp();
        System.out.println("Move up: " + point);
        point.moveDown();
        System.out.println("Move down: " + point);
        point.moveRight();
        System.out.println("Move right: " + point);
        point.moveLeft();
        System.out.println("Move left: " + point);
    }

}
