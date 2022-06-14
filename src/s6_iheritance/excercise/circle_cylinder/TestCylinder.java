package s6_iheritance.excercise.circle_cylinder;

public class TestCylinder {
    public static void main(String[] args) {
        Cylinder cylinder = new Cylinder(3, "blue", 5);
        System.out.println(cylinder + "thể tích hình trụ là:" + cylinder.volume());
    }
}
