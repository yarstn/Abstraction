public class MoveablePoint implements Moveable {
    private int x;
    private int y;
    private int xSpeed;
    private int ySpeed;

    public MoveablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public void moveUp() {
        y -= ySpeed;
    }

    @Override
    public void moveDown() {
y += ySpeed;
    }

    @Override
    public void moveLeft() {
x -= xSpeed;
    }

    @Override
    public void moveRighr() {
x += xSpeed;
    }

    @Override
    public String toString() {
        return "(" + x + ", " + y + ")";
    }
}
