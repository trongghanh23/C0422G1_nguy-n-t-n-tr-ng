package bai_tap_lam_them.quan_ly_truong_học.modle;

public class Teacher extends Person {
    private double salary;

    public Teacher() {
    }

    public Teacher(double salary) {
        this.salary = salary;
    }

    public Teacher(int id, String code, String name, String birthday, String address, double salary) {
        super(id, code, name, birthday, address);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                super.toString() +
                "salary=" + salary +
                '}';
    }
}
