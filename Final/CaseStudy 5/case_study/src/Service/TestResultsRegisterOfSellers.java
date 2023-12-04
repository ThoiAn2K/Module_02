package Service;

import Controller.ControllerLoginOrRegisterOfSellers;
import Utils.WriterDataSellers;
import View.ViewResultsAnnouncement;

public class TestResultsRegisterOfSellers {
   public void testResultsRegisterOfSellers(String account, String [] data){
       ServiceCheckDataRegisterOfSellers serviceCheckDataRegisterOfSellers = new ServiceCheckDataRegisterOfSellers();
       WriterDataSellers writerDataSellers = new WriterDataSellers();
       ControllerLoginOrRegisterOfSellers controllerLoginOrRegisterOfSellers = new ControllerLoginOrRegisterOfSellers();
       ViewResultsAnnouncement viewResultsAnnouncement = new ViewResultsAnnouncement();
       if(ServiceRegex.isValidate(account) && serviceCheckDataRegisterOfSellers.isDataSellers(account)){
           writerDataSellers.writerDataSellers(data);
           viewResultsAnnouncement.successful();
           controllerLoginOrRegisterOfSellers.controllerLoginOfSellers();
       }else{
           viewResultsAnnouncement.fail();
           controllerLoginOrRegisterOfSellers.controllerLoginOfSellers();
       }
    }
}
