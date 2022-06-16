package bai_tap_lam_them.utils;

import bai_tap_lam_them.modle.Student;

import java.util.Comparator;

public class NameStudentComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int value1 = o1.getName().compareTo(o2.getName());
       if (value1==0){
           return (int) (o1.getStudyTime()-(o2.getStudyTime()));
       }else {
           return value1;
       }
    }
}
