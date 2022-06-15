package bai_tap_lam_them.modle;

public abstract class Person {
    private String code;
    private String name;
    private String birthday;
    private String address;

    public Person() {
    }
    public abstract String convertLine();

    public Person(String code, String name, String birthday, String address) {
        this.code = code;
        this.name = name;
        this.birthday = birthday;
        this.address = address;
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
                "code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
