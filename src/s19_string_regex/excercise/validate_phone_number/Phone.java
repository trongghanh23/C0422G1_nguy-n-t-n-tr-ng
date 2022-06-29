package s19_string_regex.excercise.validate_phone_number;

import java.util.Scanner;

public class Phone {
    public static void main(String[] args) {
        boolean check=true;
        do {
            String regex="^\\([0-9]{2}\\)\\-\\(0[0-9]{9}\\)$";
            Scanner scanner=new Scanner(System.in);
            System.out.println("nhập vào số điện thoại dạng (xx)-(0xxxxxxxxx)");
            String input=scanner.nextLine();
            boolean checkRegex=input.matches(regex);
            if (checkRegex==true){
                System.out.println("số điện thoại hợp lệ");
                check=false;
                break;

            }else {
                System.out.println("số điện thoại không hợp lệ");
                check=true;
            }

        }while (check);

    }

}
