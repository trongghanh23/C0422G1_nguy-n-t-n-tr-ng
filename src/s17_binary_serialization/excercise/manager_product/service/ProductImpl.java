package s17_binary_serialization.excercise.manager_product.service;

import s17_binary_serialization.excercise.manager_product.models.Product;
import s17_binary_serialization.excercise.manager_product.utils.CheckException;
import s17_binary_serialization.excercise.manager_product.utils.ReadAndWriteByte;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductImpl implements ProductService{
    private static Scanner  scanner=new Scanner(System.in);
    private static List<Product>productList=new ArrayList<>();
    private static final String FILE_PRODUCT="src/s17_binary_serialization/excercise/manager_product/data/product.csv";

    @Override
    public void display() {
        productList= ReadAndWriteByte.readProduct(FILE_PRODUCT);
        for (Product item:productList) {
            System.out.println(item);

        }

    }
    @Override
    public void add() {

        System.out.println("nhập mã sản phẩm");
        String productCode;
        boolean check;
        do {
            check=true;
            productCode=scanner.nextLine();

            for (Product item : productList) {
                if (item.getProductCode().equals(productCode)) {
                    System.out.println("mã tồn tại vui lòng nhập lại");
                    check=false;
                }

            }
        }while (check==false);

        System.out.println("nhập tên sản phẩm");
        String productName=scanner.nextLine();

        System.out.println("nhập nhà sản xuất");
        String manufacturer=scanner.nextLine();

        System.out.println("nhập giá sản phẩm");
        double price= CheckException.checkDouble();

        System.out.println("nhập mô tả");
        String descriptions=scanner.nextLine();
        Product  product=new Product(productCode,manufacturer,productName,price,descriptions);
        productList.add(product);
        ReadAndWriteByte.writeProduct(productList,FILE_PRODUCT);
        System.out.println("thêm thành công");



    }

    @Override
    public void search() {

        System.out.println("Nhập mã sản phẩm cần tìm");
        String productCode=scanner.nextLine();
        boolean check=true;
        for (Product item:productList) {
            if (item.getProductCode().equals(productCode)){
                System.out.println(item);
                check=false;
            }

        }if (check){
            System.out.println("không tìm thấy mã sản phẩm");
        }

    }
}
