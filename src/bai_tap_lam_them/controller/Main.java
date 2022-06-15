package bai_tap_lam_them.controller;

import bai_tap_lam_them.service.IStudent;
import bai_tap_lam_them.service.StudentIplm;

import java.util.Scanner;

public class Main {
     static  IStudent iStudent=new StudentIplm();
     static Scanner  scanner=new Scanner(System.in);
    public static void displays(){
         do {
             System.out.println("***********menu*********\n" +
                     "1. display\n" +
                     "2. add\n" +
                     "3. edit\n" +
                     "4. remove\n" +
                     "5. search");
             System.out.println("Mời chon chức năng: ");
             int input=Integer.parseInt(scanner.nextLine());
             switch (input){
                 case 1:
                     iStudent.display();
                     break;
                     case 2:
                     iStudent.add();
                     break;
                     case 3:
                     iStudent.edit();
                     break;
                     case 4:
                     iStudent.remove();
                     break;
                     case 5:
                     iStudent.search();
                     break;
                 default:
                     System.out.println("mời chon lại chức năng");
             }
         }while (true);


     }

}
