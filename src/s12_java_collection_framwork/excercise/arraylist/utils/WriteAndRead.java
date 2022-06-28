package s12_java_collection_framwork.excercise.arraylist.utils;


import s12_java_collection_framwork.excercise.arraylist.models.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class WriteAndRead {
    public static void writeFile(String pathFile, List<String> list) {
        File file = new File(pathFile);

        try (FileWriter fileWriter = new FileWriter(file, false);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (String data : list) {
                bufferedWriter.write(data);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
            System.err.println("Error: " + e.getMessage());
        }

    }

//    public static void writeProduct(String pathFile, List<Product> manage) {
//        List<String> list = new ArrayList<>();
//        for (Product e : manage) {
//            list.add(e.ConvertLine());
//
//        }
//        writeFile(pathFile, list);
//    }

    public static List<String> readFile(String pathFile) {
        File file = new File(pathFile);
        List<String> list = new ArrayList<>();

        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line = null;
            while ((line = bufferedReader.readLine()) != null && !line.equals("")) {

                list.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return list;

    }

//    public static List<HocSinh> readHocSinh(String path) {
//        List<String> list = readFile(path);
//        List<HocSinh> studentList = new ArrayList<>();
//        String[] arr = null;
//        for (String str : list) {
//            arr = str.split(",");
//            studentList.add(new HocSinh(Integer.parseInt(arr[0]), arr[1], arr[2], arr[3], arr[4], arr[5], Double.parseDouble(arr[6])));
//        }
//
//        return studentList;
//    }

}
