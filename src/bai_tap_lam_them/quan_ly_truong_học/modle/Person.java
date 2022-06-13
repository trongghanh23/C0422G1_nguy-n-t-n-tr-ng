package bai_tap_lam_them.quan_ly_truong_học.modle;

public abstract class Person {
    private int id;
    private String code;
    private String name;
    private String birthday;
    private String address;

    public Person() {
    }

    public Person(int id, String studentCode, String name, String birthday, String address) {
        this.id = id;
        this.code = studentCode;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                ", studentCode='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
