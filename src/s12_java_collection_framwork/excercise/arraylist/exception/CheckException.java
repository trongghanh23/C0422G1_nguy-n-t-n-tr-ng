package s12_java_collection_framwork.excercise.arraylist.exception;

import java.util.Scanner;

public class CheckException {
    static Scanner scanner = new Scanner(System.in);
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


}
