package s15_exception_debug.excercise;

import java.util.Scanner;

public class IllegalTriangle {
    public static void main(String[] args) {
        boolean check = false;
        do {
            Scanner scanner = new Scanner(System.in);

            System.out.println("nhập cạnh thứ  nhất: ");
            int edge1 = Integer.parseInt(scanner.nextLine());

            System.out.println("nhập cạnh thứ  hai: ");
            int edge2 = Integer.parseInt(scanner.nextLine());

            System.out.println("nhập cạnh thứ  ba: ");
            int edge3 = Integer.parseInt(scanner.nextLine());

            if (edge1 <= 0 || edge2 <= 0 || edge3 <= 0) {
                check = true;


                try {
                    throw new IllegalTriangleException("không nhập số âm");
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();

                }

            } else if ((edge1 + edge2) < edge3 || (edge1 + edge3) < edge2 || (edge2 + edge3) < edge1) {
                check = true;
                try {
                    throw new IllegalTriangleException("Tổng 2 cạnh không lớn hơn hai cạnh còn lại");
                } catch (IllegalTriangleException e) {
                    System.out.println(e.getMessage());
                    e.printStackTrace();
                }

            } else {
                check = false;

                System.out.println("3 cạnh nhập vào là cạnh của tam giác ");

            }


        } while (true);

    }

}


