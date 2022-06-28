package s17_binary_serialization.excercise.manager_product.controller;

import s17_binary_serialization.excercise.manager_product.service.ProductImpl;
import s17_binary_serialization.excercise.manager_product.service.ProductService;
import s17_binary_serialization.excercise.manager_product.utils.CheckException;

import java.util.Scanner;

public class MenuMain {
    private static Scanner scanner = new Scanner(System.in);
    private static ProductService productService = new ProductImpl();

    public static void menuProduct() {
        do {


            System.out.println("**************menu product******************\n" +
                    "1. thêm sản phẩm\n" +
                    "2. hiển thị sản phẩm\n" +
                    "3. tìm kiếm theo mã sản phẩm\n" +
                    "4. thoát menu");
            System.out.println("Mời chọn chức năng");
            int input = CheckException.checkInt();

            switch (input) {
                case 1:
                    productService.add();
                    break;
                case 2:
                    productService.display();
                    break;
                case 3:
                    productService.search();
                    break;
                case 4:
                    System.exit(0);
                default:
                    System.out.println("chọn lại từ 1-4");
            }
        } while (true);
    }
}
