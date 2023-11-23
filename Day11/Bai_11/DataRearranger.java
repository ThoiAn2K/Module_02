import java.io.*;
import java.util.LinkedList;
import java.util.Queue;

public class DataRearranger {
    public static void main(String[] args) {
        String inputFilePath = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Day11\\Bai_11\\Input.txt";
        String outputFilePath = "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Day11\\Bai_11\\Output.txt";

        rearrangeRecords(inputFilePath, outputFilePath);
    }

    public static void rearrangeRecords(String inputFilePath, String outputFilePath) {
        Queue<String> femaleQueue = new LinkedList<>();
        Queue<String> maleQueue = new LinkedList<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(inputFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter(outputFilePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] record = line.split(",");
                String name = record[0];
                String gender = record[1];
                String dob = record[2];

                if (gender.equals("Female")) {
                    femaleQueue.add(line);
                } else if (gender.equals("Male")) {
                    maleQueue.add(line);
                }
            }

            // Ghi danh sách nữ
            while (!femaleQueue.isEmpty()) {
                writer.write(femaleQueue.poll());
                writer.newLine();
            }

            // Ghi danh sách nam
            while (!maleQueue.isEmpty()) {
                writer.write(maleQueue.poll());
                writer.newLine();
            }

            System.out.println("Dữ liệu đã được tổ chức lại thành công.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
