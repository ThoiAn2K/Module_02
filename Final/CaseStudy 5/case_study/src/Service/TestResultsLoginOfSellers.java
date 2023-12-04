package Service;

import Controller.ControllerLoginOrRegisterOfSellers;
import Controller.ControllerRegistrationHomePage;
import Controller.ControllerSeller;
import StartUp.Main;
import View.ViewResultsLoginAnnouncement;

public class TestResultsLoginOfSellers {
    public void testResultsLoginOfSellers(String account,String password){
        ServiceCheckDataLoginOfSellers serviceCheckDataLoginOfSellersObject = new ServiceCheckDataLoginOfSellers();
        ViewResultsLoginAnnouncement viewResultsLoginAnnouncementObject = new ViewResultsLoginAnnouncement();
        ControllerLoginOrRegisterOfSellers controllerLoginOrRegisterOfSellers = new ControllerLoginOrRegisterOfSellers();
        ControllerSeller controllerSellerObject = new ControllerSeller();
        if(serviceCheckDataLoginOfSellersObject.isServiceCheckDataLoginOfSellers(account,password)){
            viewResultsLoginAnnouncementObject.successful();
            controllerSellerObject.load();

        }else{
            viewResultsLoginAnnouncementObject.fail();
            controllerLoginOrRegisterOfSellers.controllerLoginOfSellers();

        }
    }
}
