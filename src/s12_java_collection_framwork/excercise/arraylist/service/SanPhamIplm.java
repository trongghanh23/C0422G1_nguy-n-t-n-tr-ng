package s12_java_collection_framwork.excercise.arraylist.service;

import s12_java_collection_framwork.excercise.arraylist.modle.SanPham;
import s12_java_collection_framwork.excercise.arraylist.utils.SapXepGiamDanTheoGiaComparator;
import s12_java_collection_framwork.excercise.arraylist.utils.SapXepTangDanTheoGiaComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class SanPhamIplm implements ISanPham {
    static Scanner scanner = new Scanner(System.in);
    static List<SanPham> sanPhamList = new ArrayList<>();//LinkedList


    static {
        sanPhamList.add(new SanPham("sp1", "dell1", "12/3/2020", "usa", 12000));
        sanPhamList.add(new SanPham("sp2", "mackbook", "2/3/2021", "usa", 15000));
        sanPhamList.add(new SanPham("sp3", "lenovo", "12/7/2019", "usa", 17000));
        sanPhamList.add(new SanPham("sp4", "hp", "1/3/2021", "usa", 11000));
    }

    @Override
    public void add() {
        System.out.println("Nhập mã sản phẩm ");
        String maSanPham;
        boolean check;
        do {
            check = false;
            maSanPham = scanner.nextLine();
            for (SanPham item : sanPhamList) {

                if (item.getMaSanPham().equals(maSanPham)) {
                    check = true;
                    System.out.println("mã tồn tại nhập lại");

                }

            }
        } while (check);

        System.out.println("Nhập tên sản phẩm");
        String tenSanPham = scanner.nextLine();

        System.out.println("Nhập ngày sản xuất");
        String ngaySanXuat = scanner.nextLine();

        System.out.println("nhập hãng sản xuất");
        String hangSanXuat = scanner.nextLine();

        System.out.println("nhập giá sản phẩm");
        double giaSanPham = Double.parseDouble(scanner.nextLine());

        SanPham sanPham = new SanPham(maSanPham, tenSanPham, ngaySanXuat, hangSanXuat, giaSanPham);
        sanPhamList.add(sanPham);
        System.out.println("thêm mới thành công");

    }

    @Override
    public void edit() {
        System.out.println("nhập mã sản phẩm cần sửa");
        String maSanPham = scanner.nextLine();
        boolean check = true;
        for (int i = 0; i < sanPhamList.size(); i++) {

            if (sanPhamList.get(i).getMaSanPham().equals(maSanPham)) {
                check = false;
                System.out.println("Nhập tên sản phẩm");
                String tenSanPham = scanner.nextLine();

                System.out.println("Nhập ngày sản xuất");
                String ngaySanXuat = scanner.nextLine();

                System.out.println("nhập hãng sản xuất");
                String hangSanXuat = scanner.nextLine();

                System.out.println("nhập giá sản phẩm");
                double giaSanPham = Double.parseDouble(scanner.nextLine());

                SanPham sanPham = new SanPham(maSanPham, tenSanPham, ngaySanXuat, hangSanXuat, giaSanPham);
                sanPhamList.set(i, sanPham);
                System.out.println("sửa thành công");

            }

        }
        if (check) {
            System.out.println("nhập mã sai vui lòng nhập lại");
            edit();
        }

    }

    @Override
    public void remove() {
        display();
        System.out.println("nhập mã sản phẩm cần xoá");
        String maSanPham = scanner.nextLine();
        boolean check = true;
        for (SanPham item : sanPhamList) {
            if (item.getMaSanPham().equals(maSanPham)) {
                check = false;
                sanPhamList.remove(item);
                break;
            }

        }
        if (check) {
            System.out.println("nhập mã xoá ko đúng nhập lại:");
            remove();
        }

    }

    @Override
    public void display() {
        for (SanPham item : sanPhamList) {
            System.out.println(item);

        }

    }

    @Override
    public void search() {
        System.out.println("nhập tên cần tìm");
        String tenSanPham = scanner.nextLine();
        boolean check = true;
        for (SanPham item : sanPhamList) {
            if (item.getTenSanPham().equals(tenSanPham)) {
                check = false;
                System.out.println(item);
            }

        }
        if (check) {
            System.out.println("tên cần tìm ko có nhập lại");
            search();
        }

    }

    @Override
    public void sort() {
        System.out.println("1.sắp xếp theo giá tăng dần\n" +
                "2.sắp xếp theo giá giảm dần\n");
        int input = Integer.parseInt(scanner.nextLine());
        if (input == 1) {
            Collections.sort(sanPhamList, new SapXepTangDanTheoGiaComparator());
            for (SanPham item : sanPhamList) {
                System.out.println(item);

            }
        } else if (input == 2) {
            Collections.sort(sanPhamList, new SapXepGiamDanTheoGiaComparator());
            for (SanPham item : sanPhamList) {
                System.out.println(item);

            }

        } else {
            System.out.println("nhập sai vui lòng nhập lại trong khoảng 1-2");
            sort();
        }
    }
}
