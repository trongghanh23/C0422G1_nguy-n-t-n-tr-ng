package bai_tap_lam_them.service;

import bai_tap_lam_them.modle.Person;
import bai_tap_lam_them.modle.Students;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentIplm implements Student {
    static Scanner scanner = new Scanner(System.in);
    static List<Students> studentList = new ArrayList<>();

    static {

        studentList.add(new Students(1, "hs1", "nguyên văn an", "12/2/2000", "đà nẵng"));
        studentList.add(new Students(2, "hs2", "nguyên văn an", "12/2/2000", "đà nẵng"));
        studentList.add(new Students(3, "hs3", "nguyên văn an", "12/2/2000", "đà nẵng"));


    }


    @Override
    public void display() {
        for (Person item : studentList) {
            System.out.println(item);

        }

    }

    @Override
    public void add() {

        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        String code;
        boolean check;

        do {
            check = false;
            System.out.println("nhập mã học sinh");
            code = scanner.nextLine();

            for (int i = 0; i < studentList.size(); i++) {
                if (studentList.get(i).getCode().equals(code)) {
                    System.out.println("mã đã tồn tại");
                    check = true;
                    break;
                }

            }

        } while (check);
        System.out.println("nhập tên học sinh");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày sinh");
        String birthday = scanner.nextLine();

        System.out.println("Nhập địa chỉ");
        String address = scanner.nextLine();


        Students students = new Students(id, code, name, birthday, address);
        studentList.add(students);
        System.out.println("đã thêm thành công");


    }

    @Override
    public void edit() {
        System.out.println("Nhập mã học sinh cần sửa");
        String input = scanner.nextLine();
        boolean check = false;

        for (int i = 0; i < studentList.size(); i++) {
            if (studentList.get(i).getCode().equals(input)) {
                check = true;
                break;
            }
        }
        if (check = true) {
            System.out.println("Nhập id");
            int id = Integer.parseInt(scanner.nextLine());

            System.out.println("nhập tên học sinh");
            String name = scanner.nextLine();

            System.out.println("Nhập ngày sinh");
            String birthday = scanner.nextLine();

            System.out.println("Nhập địa chỉ");
            String address = scanner.nextLine();
            Students students=new Students();
            String code=students.getCode();
            Students  students1=new Students(id,code,name,birthday,address);
//            studentList.set(i,students1);

//            studentList.set(id,name,birthday,address,code)



        }else {
            System.out.println("nhập sai mã cần sữa");
        }


    }

    @Override
    public void remove() {

    }

    @Override
    public void search() {

    }
}
