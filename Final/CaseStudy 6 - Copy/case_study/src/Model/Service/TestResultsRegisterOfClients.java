package Model.Service;


import Controller.Client.LoginOrRegisterOfClientsController;
import Model.Utils.WriterData.WriterDataClients;
import View.Annoucement.ViewResultsAnnouncement;

public class TestResultsRegisterOfClients {
      public static void testResultsOfClients(String account, String [] data){
          ServiceCheckDataRegisterOfClients serviceCheckDataRegisterOfClientsObject = new ServiceCheckDataRegisterOfClients();


          WriterDataClients writerDataClients = new WriterDataClients();
        if (ServiceRegex.isValidate(account) && serviceCheckDataRegisterOfClientsObject.isDataOfClients(account) ){
            writerDataClients.writerDataClients(data);
           ViewResultsAnnouncement.successful();
            LoginOrRegisterOfClientsController.controllerLoginOfClients();
        }else{
           ViewResultsAnnouncement.fail();
            LoginOrRegisterOfClientsController.controllerLoginOfClients();

        }
    }
}
