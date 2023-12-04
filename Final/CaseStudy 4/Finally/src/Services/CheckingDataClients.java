package Services;

import View.NotificationOfRegistration;

public class CheckingDataClients {
      public void checkingDataClients(String account){
          CheckDataSellers checkDataSellersObject = new CheckDataSellers();
        if(CheckRegex.isValidate(account) && checkDataSellersObject.isDataSellers(account)){
            NotificationOfRegistration.notificationOfSuccessfulRegistration();
        }else {
            NotificationOfRegistration.notificationOfFailRegistration();
        }
    }
}
