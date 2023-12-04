package Service;

import Controller.Seller.ControllerLoginOrRegisterOfSellers;
import Utils.WriterDataSellers;
import View.Annoucement.ViewResultsAnnouncement;
import View.Annoucement.ViewResultsLoginAnnouncement;


public class TestResultsRegisterOfSellers {
   public static void testResultsRegisterOfSellers(String account, String [] data){
       WriterDataSellers writerDataSellers = new WriterDataSellers();
       if(ServiceRegex.isValidate(account) && ServiceCheckDataRegisterOfSellers.isDataSellers(account)){
           writerDataSellers.writerDataSellers(data);
           ViewResultsAnnouncement.successful();
           ControllerLoginOrRegisterOfSellers.controllerLoginOfSellers();
       }else{
           ViewResultsAnnouncement.fail();
           ControllerLoginOrRegisterOfSellers.controllerLoginOfSellers();
       }
    }
}
