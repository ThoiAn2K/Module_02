import java.io.*;

public class FileCopyExample {
    public static void main(String[] args) {

        if (args.length < 2) {
            System.out.println("Vui lòng cung cấp tệp tin nguồn và tệp tin đích.");
            return;
        }

        String sourceFilePath = args[0];
        String targetFilePath = args[1];

        File sourceFile = new File(sourceFilePath);
        if (!sourceFile.exists()) {
            System.out.println("Tệp tin nguồn không tồn tại.");
            return;
        }

        File targetFile = new File(targetFilePath);
        if (targetFile.exists()) {
            System.out.println("Tệp tin đích đã tồn tại.");
            return;
        }
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFile));
             BufferedWriter writer = new BufferedWriter(new FileWriter(targetFile))) {
            int character;
            int characterCount = 0;

            while ((character = reader.read()) != -1) {
                writer.write(character);
                characterCount++;
            }

            System.out.println("Sao chép tệp tin thành công.");
            System.out.println("Số ký tự trong tệp tin là: " + characterCount);
        } catch (IOException e) {
            System.out.println("Đã xảy ra lỗi khi sao chép tệp tin.");
            e.printStackTrace();
        }
    }
}