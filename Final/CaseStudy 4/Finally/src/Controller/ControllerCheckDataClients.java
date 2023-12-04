package Controller;

import Services.CheckDataClients;
import Services.CheckingDataClients;
import Services.CheckingDataSellers;

public class ControllerCheckDataClients {
    public void controllerCheckDataClient(String account){
        CheckingDataClients checkingDataClientsObject = new CheckingDataClients();
        checkingDataClientsObject.checkingDataClients(account);
    }
}
