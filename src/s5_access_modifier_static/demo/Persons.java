package s5_access_modifier_static.demo;

public class Persons {
    private String name;
    private String gender;

    public Persons() {
    }

    public Persons(String name, String gender) {
        this.name = name;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }
    public void work(){
        System.out.println("hello");
    }

    @Override
    public String toString() {
        return "Persons{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
