package s12_java_collection_framwork.excercise.arraylist.controller;

import s12_java_collection_framwork.excercise.arraylist.service.ISanPham;
import s12_java_collection_framwork.excercise.arraylist.service.SanPhamIplm;

import java.util.Scanner;

public class Menu {
    static Scanner scanner = new Scanner(System.in);
    static ISanPham sanPham = new SanPhamIplm();

    public static void displaySanPham() {
        do {
            System.out.println("*************menu product************\n" +
                    "1.Thêm sản phẩm\n" +
                    "2.Sửa thông tin sản phẩm theo id\n" +
                    "3.Xoá sản phẩm theo id\n" +
                    "4.Hiển thị danh sách sản phẩm\n" +
                    "5.Tìm kiếm sản phẩm theo tên\n" +
                    "6.sắp xêp\n" +
                    "7.exit");
            System.out.println("chon chức năng");
            int input = Integer.parseInt(scanner.nextLine());
            switch (input) {
                case 1:
                    sanPham.add();
                    break;
                case 2:
                    sanPham.edit();
                    break;
                case 3:
                    sanPham.remove();
                    break;
                case 4:
                    sanPham.display();
                    break;
                case 5:
                    sanPham.search();
                    break;
                case 6:
                    sanPham.sort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại trong khoảng 1-5");
            }

        } while (true);

    }

}
