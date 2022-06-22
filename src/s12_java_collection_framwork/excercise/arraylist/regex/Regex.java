package s12_java_collection_framwork.excercise.arraylist.regex;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Regex {
    public static boolean formatHovaTen(String str) {
        final String VALID_NUMBER = "^(SP)[a-z][0-9]{10}$";
        Pattern pattern = Pattern.compile(VALID_NUMBER);
        return pattern.matcher(str).matches();
    }
    public static void main(String[] args) {
        String regexCrawlNews = "^[A-Z][a-zA-z0-9]*[a-zA-z0-9]$";
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Mời bạn nhập ---\n --- Cu phap:(Chữ cái đầu viết Hoa)");
            String test = scanner.nextLine();
            boolean checkRegex = Pattern.matches(regexCrawlNews, test);
            if (checkRegex) {
                System.out.println("ket qua: Khớp" + "\n" + test);
            } else System.out.println("ket qua: Không khớp, mời nhập lại");
        } while (true);
    }
}
