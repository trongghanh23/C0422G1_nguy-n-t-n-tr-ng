package s5_access_modifier_static.practic.static_method;

import javax.swing.text.Style;

public class Student {
    private int rollno;
    private String name;
    private static String college="BBDIT";

    Student(int r, String n){
        rollno=r;
        name=n;
    }
    static void change() {
        college = "CODEGYM";
    }

    //method to display values
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }

}
