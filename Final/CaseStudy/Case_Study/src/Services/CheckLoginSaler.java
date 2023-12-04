package Services;

import Controller.LoginOfSaler;
import Utils.OutputWriterSaler;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class CheckLoginSaler extends OutputWriterSaler {

    public static void checkDataSaler() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            String[] nextLine;

            boolean isLoginSaler = false;

            while ((nextLine = csvReader.readNext()) != null) {
                String csvAccount = nextLine[0];
                String csvPassword = nextLine[1];

                if ((csvAccount.equals(LoginOfSaler.loginOfSalerAccount)) && (csvPassword.equals(LoginOfSaler.loginOfSalerPassword)))
                {
                    isLoginSaler = true;
                    break;
                }
            }
            csvReader.close();

            if (isLoginSaler){
                System.out.println("thanh cong");
            }else {
                System.out.println("loi tip sua nua di ");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
