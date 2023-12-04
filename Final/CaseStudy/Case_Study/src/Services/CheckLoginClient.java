package Services;

import Controller.LoginOfClient;
import Controller.LoginOfSaler;
import Utils.OutputWriterClient;
import com.opencsv.CSVReader;

import java.io.FileReader;
import java.io.IOException;

public class CheckLoginClient extends OutputWriterClient {
    public static void checkDataClient() {
        try {
            CSVReader csvReader = new CSVReader(new FileReader(PATH));
            String[] nextLine;

            boolean isLoginClient = false;

            while ((nextLine = csvReader.readNext()) != null) {
                String csvAccount = nextLine[0];
                String csvPassword = nextLine[1];

                if ((csvAccount.equals(LoginOfClient.loginOfClientAccount)) && (csvPassword.equals(LoginOfClient.loginOfClientPassword)))
                {
                    isLoginClient = true;
                    break;
                }
            }
            csvReader.close();

            if (isLoginClient){
                System.out.println("thanh cong");
            }else {
                System.out.println("loi tip sua nua di ");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
