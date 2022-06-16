package bai_tap_lam_them.service;

import bai_tap_lam_them.modle.Person;
import bai_tap_lam_them.modle.Student;
import bai_tap_lam_them.utils.NameStudentComparator;
import bai_tap_lam_them.utils.WriteAndRead;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class StudentIplm implements IStudent {
    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    public static final String FILE_STUDENT = "src/bai_tap_lam_them/data/test.csv";

//    static {
//        studentList.add(new Student("hs1", "a", "12/1/2000", "Đà Nẵng", 12));
//        studentList.add(new Student("hs1", "a", "12/1/2000", "Đà Nẵng", 18));
//        studentList.add(new Student("hs1", "a", "12/1/2000", "Đà Nẵng", 19));
//        studentList.add(new Student("hs1", "a", "12/1/2000", "Đà Nẵng", 14));
//
//    }

    @Override
    public void display() {
        studentList = WriteAndRead.readHocSinh(FILE_STUDENT);
        for (Person item : studentList) {
            System.out.println(item);

        }

    }

    @Override
    public void add() {
        studentList=WriteAndRead.readHocSinh(FILE_STUDENT);
        System.out.println("Nhập mã học sinh:");
        boolean flag;
        String studentId;
        do {
            flag = false;
            studentId = scanner.nextLine();
            for (Student item : studentList) {
                if (studentId.equals(item.getCode())) {
                    System.out.println("Id Already Exist. Enter Again: ");
                    flag = true;
                    break;
                }
            }
        } while (flag);

        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh:");
        String birthday = scanner.nextLine();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập thời gian học");
        double studyTime = Double.parseDouble(scanner.nextLine());
        Student student = new Student(studentId, name, birthday, address, studyTime);
        studentList.add(student);
        WriteAndRead.writeHocSinh(FILE_STUDENT,studentList);
        System.out.println("Thêm mới thành công");


    }


    @Override
    public void edit() {
        System.out.println("Nhập code học sinh cần sửa");

        String input = scanner.nextLine();
        boolean check = true;

        for (int i = 0; i < studentList.size(); i++) {

            if (studentList.get(i).getCode().equals(input)) {
                check = false;

                System.out.println("Nhập tên học sinh:");
                String name = scanner.nextLine();

                System.out.println("Nhập ngày sinh:");
                String birthday = scanner.nextLine();

                System.out.println("nhập địa chỉ");
                String address = scanner.nextLine();

                System.out.println("Nhập thời gian học");
                double studyTime = Double.parseDouble(scanner.nextLine());
                Student student = new Student(input, name, birthday, address, studyTime);
                studentList.set(i, student);
                System.out.println("sửa thành công");
                break;

            }

        }
        if (check) {
            System.out.println("Nhập sai id nhập lại");
            edit();
        }


    }


    @Override
    public void remove() {
        System.out.println("Nhập id cần xoá");
        String input = scanner.nextLine();
        boolean check = true;
        for (Person item : studentList) {
            if (item.getCode().equals(input)) {
                studentList.remove(item);
                check = false;
                System.out.println("xoá thành công");
                break;
            }

        }
        if (check) {
            System.out.println("xoá không thành cônng");
            remove();
        }
    }


    @Override
    public void search() {
        System.out.println("Nhập id cần tìm");
        String input = scanner.nextLine();
        boolean check = true;
        for (Person item : studentList) {
            if (item.getCode().equals(input)) {
                check = false;
                System.out.println(item);
            }

        }
        if (check) {
            System.out.println("Không tìm thấy id");
            search();
        }

    }

    @Override
    public void sort() {
        Collections.sort(studentList, new NameStudentComparator());
        for (Person item : studentList) {
            System.out.println(item);

        }

    }

}
