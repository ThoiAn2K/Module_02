package Model.Service;

import Controller.Seller.LoginOrRegisterOfSellersController;
import Model.Object.ListSeller;
import Model.Object.Register;
import Model.Utils.WriterData.WriterDataListSeller;
import Model.Utils.WriterData.WriterDataSellers;
import View.Annoucement.ViewResultsAnnouncement;


public class TestResultsRegisterOfSellers {
   public static void testResultsRegisterOfSellers(String account, String [] data,String shopName,String password, String phone ){
       WriterDataSellers writerDataSellers = new WriterDataSellers();
       if(ServiceRegex.isValidate(account) && ServiceCheckDataRegisterOfSellers.isDataSellers(account)){
           writerDataSellers.writerDataSellers(data);
           ViewResultsAnnouncement.successful();
           Register register = new Register(shopName,account,password,phone);
           ListSeller listSeller = new ListSeller(register);
           WriterDataListSeller.writerDataListSeller(listSeller);
           LoginOrRegisterOfSellersController.controllerLoginOfSellers();
       }else{
           ViewResultsAnnouncement.fail();
           LoginOrRegisterOfSellersController.controllerLoginOfSellers();
       }
    }
}
