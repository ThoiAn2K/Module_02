import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopyProgram {
    public static void main(String[] args) {

        String sourceFile = "source.txt";
        String targetFile = "result.txt";

        try (FileInputStream inputStream = new FileInputStream(sourceFile);
             FileOutputStream outputStream = new FileOutputStream(targetFile)) {

            byte[] buffer = new byte[1024];
            int bytesRead;
            long totalBytesCopied = 0;

            while ((bytesRead = inputStream.read(buffer)) != -1) {
                outputStream.write(buffer, 0, bytesRead);
                totalBytesCopied += bytesRead;
            }

            System.out.println("File copied successfully.");
            System.out.println("Total bytes copied: " + totalBytesCopied);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}