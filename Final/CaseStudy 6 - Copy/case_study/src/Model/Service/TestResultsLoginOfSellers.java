package Model.Service;


import Controller.Seller.LoginOrRegisterOfSellersController;
import Controller.Seller.ControllerSeller;
import View.Annoucement.ViewResultsLoginAnnouncement;


public class TestResultsLoginOfSellers {
    public static void testResultsLoginOfSellers(String account,String password){
        ServiceCheckDataLoginOfSellers serviceCheckDataLoginOfSellersObject = new ServiceCheckDataLoginOfSellers();
        if(serviceCheckDataLoginOfSellersObject.isServiceCheckDataLoginOfSellers(account,password)){
            ViewResultsLoginAnnouncement.successful();
            ControllerSeller.load();

        }else{
            ViewResultsLoginAnnouncement.fail();
            LoginOrRegisterOfSellersController.controllerLoginOfSellers();

        }
    }
}
