package InputOutput;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Utils {

    /**
     * Read file txt.
     * 
     * @param path file path.
     * @return content of file.
     */
    public static String readContentFromFile(String path) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(path))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return content.toString();
    }

    /**
     * Write content. 
     * 
     * @param content file content.
     * @param path file path.
     */
    public static void writeContentToFile(String path, String content) {
        // File Writter được tạo với 2 tham số path, false là ghi đè lên file thay vì thêm vào cuối file. 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, false))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Append end. 
     * 
     * @param path file path. 
     * @param content file content. 
     */
    public static void appendContentToFile(String path, String content) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(path, true))) {
            writer.write(content);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Find file by name. 
     * 
     * @param folderPath folder path.
     * @param fileName file name.
     * @return
     */
    public static File findFileByName(String folderPath, String fileName) {
        File folder = new File(folderPath);
        File[] list = folder.listFiles();

        if (list != null) {
            for (File file : list) {
                if (file.isFile() && file.getName().equals(fileName)) {
                    return file;
                }
            }
        }
        return null;
    }

}