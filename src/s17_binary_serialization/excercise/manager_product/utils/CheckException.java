package s17_binary_serialization.excercise.manager_product.utils;

import java.util.Scanner;

public class CheckException {
    static Scanner scanner = new Scanner(System.in);
    public static int checkInt() {
        int value=0;

        try {
            value = Integer.parseInt(scanner.nextLine());

        } catch (java.lang.NumberFormatException e) {
            System.out.println(e.getMessage());
            System.out.print("Không nhập kí tự vui lòng nhập số: ");
        }

        return value;
    }
    public static double checkDouble() {
        double value ;
        while (true) {

            try {
                value = Double.parseDouble(scanner.nextLine());
                break;
            } catch (java.lang.NumberFormatException e) {
                System.out.println(e.getMessage());
                System.out.print("Không nhập kí tự vui lòng nhập số ");
            }
        }
        return value;
    }
}
