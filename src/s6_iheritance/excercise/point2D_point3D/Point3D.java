package s6_iheritance.excercise.point2D_point3D;

public class Point3D extends Point2D {
    private float z = 0.0f;

    public Point3D() {
    }

    public Point3D(float z) {
        this.z = z;
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }

    public void setXYZ(float x, float y, float z) {
        super.setX(x);
        super.setX(y);
        this.z = z;
    }

    public float[] getXYZ() {
        return new float[]{this.getX(), this.getY(), z};
    }

    @Override
    public String toString() {
        return "(" + super.toString() + "," + z + ")";
    }
}
