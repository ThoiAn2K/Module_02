package Model.Utils.ReadData;

import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class LookUpShopFromData {
    public void lookupShop(){
        String search = "new shop";
        String PATH= "C:\\Users\\DELL\\Desktop\\codeGym\\Module02\\Final\\CaseStudy 6\\case_study\\src\\Model\\Model.Data\\DataClient.CSV";
    try{
        CSVReader csvReader = new CSVReader(new FileReader(PATH));
String []nextLine;
while ((nextLine = csvReader.readNext())!=null){
    String shopName = nextLine[0];

}


    }catch (IOException e){
        e.printStackTrace();
    }


    }
}
