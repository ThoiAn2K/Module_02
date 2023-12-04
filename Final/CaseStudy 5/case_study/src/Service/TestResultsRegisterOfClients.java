package Service;


import Controller.ControllerLoginOrRegisterOfClients;
import StartUp.Main;
import Utils.WriterDataClients;
import View.ViewResultsAnnouncement;

public class TestResultsRegisterOfClients {
      public void testResultsOfClients(String account, String [] data){
          ServiceCheckDataRegisterOfClients serviceCheckDataRegisterOfClientsObject = new ServiceCheckDataRegisterOfClients();
          ViewResultsAnnouncement viewResultsAnnouncement = new ViewResultsAnnouncement();
          ControllerLoginOrRegisterOfClients controllerLoginOrRegisterOfClients = new ControllerLoginOrRegisterOfClients();
          WriterDataClients writerDataClients = new WriterDataClients();
        if (ServiceRegex.isValidate(account) && serviceCheckDataRegisterOfClientsObject.isDataOfClients(account) ){
            writerDataClients.writerDataClients(data);
            viewResultsAnnouncement.successful();
            controllerLoginOrRegisterOfClients.controllerLoginOfClients();
        }else{
            viewResultsAnnouncement.fail();
            controllerLoginOrRegisterOfClients.controllerLoginOfClients();

        }
    }
}
