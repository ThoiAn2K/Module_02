package Service;

import Controller.Client.ControllerLoginOrRegisterOfClients;
import View.Annoucement.ViewResultsLoginAnnouncement;

public class TestResultsLoginOfClients {
    public static void testResultsLoginOfClients(String account, String password){
      ServiceCheckDataLoginOfClients serviceCheckDataLoginOfClientsObject = new ServiceCheckDataLoginOfClients();
        if((serviceCheckDataLoginOfClientsObject.isServiceCheckDataOfClients(account,password))){
            ViewResultsLoginAnnouncement.successful();
        }else{
            ViewResultsLoginAnnouncement.fail();
            ControllerLoginOrRegisterOfClients.controllerLoginOfClients();

        }
    }
}
