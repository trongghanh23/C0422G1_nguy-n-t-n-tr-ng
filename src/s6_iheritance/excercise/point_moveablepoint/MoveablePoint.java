package s6_iheritance.excercise.point_moveablepoint;

public class MoveablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MoveablePoint() {
    }

    public MoveablePoint(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MoveablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float getXSpeed() {
        return xSpeed;
    }

    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getYSpeed() {
        return ySpeed;
    }

    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public float[] getXY() {
        float array[] = {xSpeed, ySpeed};
        return array;
    }

    public MoveablePoint move() {
        super.setX(xSpeed + getX());
        super.setY(ySpeed + getY());
        return this;
    }

    @Override
    public String toString() {
        return "(" + xSpeed + "," + ySpeed + "," + super.toString() + ")";
    }

}
