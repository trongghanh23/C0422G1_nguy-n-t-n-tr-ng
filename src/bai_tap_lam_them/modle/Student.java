package bai_tap_lam_them.modle;

public class Student extends Person{
    private double studyTime;

    public Student() {
    }

    public Student(double studyTime) {
        this.studyTime = studyTime;
    }
    @Override
    public String convertLine() {
        return super.getCode()+"," +
                ","+getName()+"," +
                ","+getBirthday()+"," +
                ","+getAddress()+"," +
                ","+this.studyTime;
    }

    public Student(String code, String name, String birthday, String address, double studyTime) {
        super(code, name, birthday, address);
        this.studyTime = studyTime;
    }

    public double getStudyTime() {
        return studyTime;
    }

    public void setStudyTime(double studyTime) {
        this.studyTime = studyTime;
    }

    @Override
    public String toString() {
        return "Student{" +
                super.toString()+
                "studyTime=" + studyTime +
                '}';
    }
}
