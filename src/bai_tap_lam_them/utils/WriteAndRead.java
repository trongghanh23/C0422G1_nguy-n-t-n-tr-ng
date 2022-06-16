package bai_tap_lam_them.utils;

import bai_tap_lam_them.modle.Student;

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

    public static void writeHocSinh(String pathFile, List<Student> manage) {
        List<String> list = new ArrayList<>();
        for (Student e : manage) {
            list.add(e.convertLine());

        }
        writeFile(pathFile, list);
    }

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

    public static List<Student> readHocSinh(String path) {
        List<String> list = readFile(path);
        List<Student> studentList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            studentList.add(new Student( arr[0], arr[1], arr[2], arr[3], Double.parseDouble(arr[4])));
        }

        return studentList;
    }
}
