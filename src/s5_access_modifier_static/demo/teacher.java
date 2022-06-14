package s5_access_modifier_static.demo;

public class teacher extends Persons{
    private double salary;

    public teacher() {
    }

    public teacher(double salary) {
        this.salary = salary;
    }

    public teacher(String name, String gender, double salary) {
        super(name, gender);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public void work() {
        System.out.println("làm việc");
    }

    public void hoc() {
        System.out.println("studding");
    }

    @Override
    public String toString() {
        return "teacher{" +
                super.toString()+
                "salary=" + salary +
                '}';
    }
}
