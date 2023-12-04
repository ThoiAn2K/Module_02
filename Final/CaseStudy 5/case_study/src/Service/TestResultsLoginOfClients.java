package Service;

import Controller.ControllerLoginOrRegisterOfClients;
import StartUp.Main;
import View.ViewResultsAnnouncement;
import View.ViewResultsLoginAnnouncement;

public class TestResultsLoginOfClients {
    public void testResultsLoginOfClients(String account, String password){
      ServiceCheckDataLoginOfClients serviceCheckDataLoginOfClientsObject = new ServiceCheckDataLoginOfClients();
        ViewResultsLoginAnnouncement viewResultsLoginAnnouncement = new ViewResultsLoginAnnouncement();
        ControllerLoginOrRegisterOfClients controllerLoginOrRegisterOfClients = new ControllerLoginOrRegisterOfClients();
        if((serviceCheckDataLoginOfClientsObject.isServiceCheckDataOfClients(account,password))){
            viewResultsLoginAnnouncement.successful();
        }else{
            viewResultsLoginAnnouncement.fail();
            controllerLoginOrRegisterOfClients.controllerLoginOfClients();

        }
    }
}
