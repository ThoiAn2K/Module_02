//package Model.Utils;
//
//import com.opencsv.CSVReader;
//
//import java.io.FileReader;
//import java.io.IOException;
//import java.util.List;
//
//public class ReadAType implements ReadProduct {
//
//    private static ReadAType instance;
//
//    public static ReadAType getInstance() {
//        if (instance == null) {
//            instance = new ReadAType();
//
//        }
//        return instance;
//    }
//
//    @Override
//    public void read(String shop) {
//        readAType(shop);
//    }
//
//    public void readAType(String shop) {
//        try {
//            CSVReader csvReader = new CSVReader(new FileReader(PATH));
//
//            List<String[]> allData = csvReader.readAll();
//            boolean found = false;
//
//            for (String[] row : allData) {
//                for (String value : row) {
//                    if (value.equals(shop)) {
//                        found = true;
//                        break;
//                    }
//                }
//
//                if (found) {
//                    for (String value : row) {
//                        System.out.printf("%-18s", value);
//                    }
//                    System.out.println();
//                }
//            }
//
//            csvReader.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//}
