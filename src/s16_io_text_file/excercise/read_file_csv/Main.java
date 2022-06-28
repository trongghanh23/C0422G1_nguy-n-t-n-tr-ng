package s16_io_text_file.excercise.read_file_csv;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {

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
    public static List<Country> readCountry(String path) {
        List<String> list = readFile(path);
        List<Country> countryList = new ArrayList<>();
        String[] arr = null;
        for (String str : list) {
            arr = str.split(",");
            countryList.add(new Country(Integer.parseInt(arr[0]), arr[1], arr[2]));

        }

        return countryList;
    }

    public static void main(String[] args) {

        System.out.println(readCountry("src/s16_io_text_file/excercise/read_file_csv/contrys.csv"));

    }

}
