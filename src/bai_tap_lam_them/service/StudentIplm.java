package bai_tap_lam_them.service;

import bai_tap_lam_them.modle.Person;
import bai_tap_lam_them.modle.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentIplm implements IStudent {
    static List<Student> studentList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);

    static {
        studentList.add(new Student("hs1", "Nguyễn văn a", "12/1/2000", "Đà Nẵng", 12));

    }

    @Override
    public void display() {
        for (Person item : studentList) {
            System.out.println(item);

        }

    }

    @Override
    public void add() {
        System.out.println("Nhập mã học sinh:");
        String code = scanner.nextLine();
//        for (int i = 0; i < studentList.size(); i++) {
//            if (studentList.get(i).getCode().equals())
//
//        }

        System.out.println("Nhập tên học sinh:");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh:");
        String birthday = scanner.nextLine();

        System.out.println("nhập địa chỉ");
        String address = scanner.nextLine();

        System.out.println("Nhập thời gian học");
        double studyTime = Double.parseDouble(scanner.nextLine());
        Student student = new Student(code, name, birthday, address, studyTime);
        studentList.add(student);
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
            if (check){
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
        String input=scanner.nextLine();
        boolean check=true;
        for (Person item:studentList) {
            if (item.getCode().equals(input)){
                check=false;
                System.out.println(item);
            }

        }if (check){
            System.out.println("Không tìm thấy id");
            search();
        }

    }

    @Override
    public void sort() {

    }
}
