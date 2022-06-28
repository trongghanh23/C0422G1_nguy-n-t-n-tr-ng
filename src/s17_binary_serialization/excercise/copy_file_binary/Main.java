package s17_binary_serialization.excercise.copy_file_binary;


import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardCopyOption;

public class Main implements Serializable {
    private static void copyFileUsingJava7Files(File source, File dest) throws IOException {
        Files.copy(source.toPath(), dest.toPath(), StandardCopyOption.REPLACE_EXISTING);
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }

    public static void main(String[] args) {
        String sourcePath = "src/s17_binary_serialization/excercise/copy_file/file_soure.csv";
        String targetPath = "src/s17_binary_serialization/excercise/copy_file/file_target.csv";
        File sourceFile = new File(sourcePath);
        File targetFile = new File(targetPath);
        try {
            copyFileUsingJava7Files(sourceFile, targetFile);
            System.out.println("số byte là:" + targetPath.length());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}



