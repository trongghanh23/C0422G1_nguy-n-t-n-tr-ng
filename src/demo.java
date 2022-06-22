import java.util.Scanner;

public class demo {
    public static void main(String[] args) {
        do {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Nhập vào số kiểm tra");
            try {
                int divideByZero;
                int a = Integer.parseInt(scanner.nextLine());


                divideByZero = 5 / a;
                System.out.println("chia hết");
            } catch (NumberFormatException e) {
                System.out.println(" NumberFormatException=> " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("ArithmeticException =>" + e.getMessage());
            }
        }while (true);
    }

}

