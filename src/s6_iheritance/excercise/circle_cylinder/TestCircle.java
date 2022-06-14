package s6_iheritance.excercise.circle_cylinder;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle = new Circle(2, "red");
        System.out.println(circle + "diện tích hình tròn là:" + circle.area());
    }
}
