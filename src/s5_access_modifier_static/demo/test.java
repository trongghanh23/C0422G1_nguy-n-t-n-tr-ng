package s5_access_modifier_static.demo;

import java.util.ArrayList;
import java.util.List;

public class test {
    public static void main(String[] args) {
        Persons persons = new teacher();
        List<Persons> personsList = new ArrayList<>();

        personsList.add(new teacher());
        personsList.add(new student());
        personsList.add(new student());
        personsList.add(new student());
        personsList.add(new teacher());
        personsList.add(new teacher());
        personsList.add(new teacher());
        personsList.add(new student());

        for (Persons e: personsList) {
            if (e instanceof teacher) {
                ((teacher) e).hoc();
            }
            if (e instanceof student) {
                ((student) e).study();
            }
        }
    }
}