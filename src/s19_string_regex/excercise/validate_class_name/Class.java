package s19_string_regex.excercise.validate_class_name;

import java.util.Scanner;

public class Class {
    public static void main(String[] args) {
        boolean check=true;
        do {

            String regexClass = "^(C|A|P)[0-9]{4}(G|H|I|K|L|M)$";
            Scanner scanner = new Scanner(System.in);
            System.out.println("nhập tên vào kiểm tra");
            String input = scanner.nextLine();
            boolean checkRegex = input.matches(regexClass);

            if (checkRegex == true) {
                System.out.println("tên nhập vào hợp lệ");
                check=false;
                break;
            } else {

                System.out.println("tên không hợp lệ");
                check=true;
            }
        }while (check);
    }

}
