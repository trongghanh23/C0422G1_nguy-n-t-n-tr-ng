package s12_java_collection_framwork.excercise.arraylist.utils;

import java.util.Scanner;
import java.util.regex.Pattern;

public class DeMo {
    private static String regex = "SVVL";
    public static String test() {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        boolean checkRegex = Pattern.matches(regex, name);
        if (checkRegex == true) {
            System.out.println("tên hợp lý");
        } else {
            System.out.println("tên ko hợp lý");
        }
        return name;
    }




}




