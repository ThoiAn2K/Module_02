package Service;


import Controller.Client.ControllerLoginOrRegisterOfClients;
import Utils.WriterDataClients;
import View.Annoucement.ViewResultsAnnouncement;

public class TestResultsRegisterOfClients {
      public static void testResultsOfClients(String account, String [] data){
          ServiceCheckDataRegisterOfClients serviceCheckDataRegisterOfClientsObject = new ServiceCheckDataRegisterOfClients();


          WriterDataClients writerDataClients = new WriterDataClients();
        if (ServiceRegex.isValidate(account) && serviceCheckDataRegisterOfClientsObject.isDataOfClients(account) ){
            writerDataClients.writerDataClients(data);
           ViewResultsAnnouncement.successful();
            ControllerLoginOrRegisterOfClients.controllerLoginOfClients();
        }else{
           ViewResultsAnnouncement.fail();
            ControllerLoginOrRegisterOfClients.controllerLoginOfClients();

        }
    }
}
