package s12_java_collection_framwork.excercise.arraylist.controller;

import s12_java_collection_framwork.excercise.arraylist.exception.CheckException;
import s12_java_collection_framwork.excercise.arraylist.service.IProduct;
import s12_java_collection_framwork.excercise.arraylist.service.ProductImpl;

import java.util.Scanner;

public class Menu {
   private static Scanner scanner = new Scanner(System.in);
    private static IProduct iProduct = new ProductImpl();

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
            int input =CheckException.checkInt();
            switch (input) {
                case 1:
                    iProduct.add();
                    break;
                case 2:
                    iProduct.edit();
                    break;
                case 3:
                    iProduct.remove();
                    break;
                case 4:
                    iProduct.display();
                    break;
                case 5:
                    iProduct.search();
                    break;
                case 6:
                    iProduct.sort();
                    break;
                case 7:
                    System.exit(0);
                default:
                    System.out.println("Vui lòng nhập lại trong khoảng 1-5");
            }

        } while (true);

    }

}
