package Model.Service;

import Controller.Client.LoginOrRegisterOfClientsController;
import View.Annoucement.ViewResultsLoginAnnouncement;

public class TestResultsLoginOfClients {
    public static void testResultsLoginOfClients(String account, String password){
      CheckDataLoginOfClientsServices serviceCheckDataLoginOfClientsObject = new CheckDataLoginOfClientsServices();
        if((serviceCheckDataLoginOfClientsObject.isServiceCheckDataOfClients(account,password))){
            ViewResultsLoginAnnouncement.successful();
        }else{
            ViewResultsLoginAnnouncement.fail();
            LoginOrRegisterOfClientsController.controllerLoginOfClients();

        }
    }
}
