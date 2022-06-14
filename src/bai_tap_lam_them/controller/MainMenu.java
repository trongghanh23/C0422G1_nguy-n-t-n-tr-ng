package bai_tap_lam_them.controller;

import bai_tap_lam_them.modle.Person;
import bai_tap_lam_them.modle.Students;
import bai_tap_lam_them.service.Student;
import bai_tap_lam_them.service.StudentIplm;

import java.util.Scanner;

public class MainMenu {
    static Scanner scanner=new Scanner(System.in);
   static Student studentMain=new StudentIplm();

     public static void mainDisplay(){

         do {
             System.out.println("***************Menu**************\n" +
                     "1. Display \n" +
                     "2. Add \n" +
                     "3. Edit \n" +
                     "4. Remove \n" +
                     "5. Search \n" +
                     "6. Exit \n");
             System.out.println("Mời bạn chon chức năng");
             int input=Integer.parseInt(scanner.nextLine());
             switch (input){
                 case 1:
                    studentMain.display();
                     break;
                 case 2:
                     studentMain.add();
                     break;
                 default:
                     System.out.println("Mời bạn nhập lại");

             }
         }while (true);

    }
}
