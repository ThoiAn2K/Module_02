import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BufferedReader read = null;

       try {
           String line;
           read = new BufferedReader(new FileReader("C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Day16\\Bai_4\\Read_Csv.csv"));
           while ((line = read.readLine())!= null){
               printCountry(parseCsvLine(line));
           }
       } catch (IOException e){
           e.printStackTrace();
       } finally {
           try {
               if(read != null){
                   read.close();
               }
           }catch (IOException e){
               e.printStackTrace();
           }
       }
    }

    public static List<String> parseCsvLine(String csvLine){
        List<String> result = new ArrayList<>();
        if(csvLine != null){
            String[] splitData = csvLine.split(",");
            for (int i = 0; i < splitData.length; i++){
                result.add(splitData[i]);
            }
        }
        return result;
    }
    private static void printCountry(List<String> country){
        System.out.println(
                "Country ["
                        + "id = " + country.get(0)
                        + ", code= " + country.get(1)
                        + " , name=" + country.get(2)
                        + "]"
        );
    }
}