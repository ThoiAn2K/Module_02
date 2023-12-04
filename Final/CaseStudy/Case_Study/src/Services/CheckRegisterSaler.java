package Services;

import Utils.InputWriterClient;

import static Services.ServicesRegex.isValidate;

public class CheckRegisterSaler {
    public static void checkDataRegisterSaler(String registerOfSalerAccount, String registerOfSalerPassword){
        if(isValidate(registerOfSalerAccount) && (isValidate(registerOfSalerPassword))){
            System.out.println("dung r ma sai me gi");
            String [] data = {registerOfSalerAccount,registerOfSalerPassword};
            InputWriterClient.writeDataClients(data);
        } else {
            System.out.println("sai vl lm lai di");

        }
    }

}
