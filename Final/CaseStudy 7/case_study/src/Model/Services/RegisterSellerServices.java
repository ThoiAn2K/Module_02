package Model.Services;

import Controller.Sellers.HomePageOfSeller;
import Model.Utils.Reader.ReadSeller;

public class RegisterSellerServices {
    private static RegisterSellerServices instance;
    public static RegisterSellerServices getInstance() {
        if (instance == null) {
            synchronized (RegisterSellerServices.class) {
                if (instance == null) {
                    instance = new RegisterSellerServices();
                }
            }
        }
        return instance;
    }
    public void check(String account){
        RegexAccountServices regexAccountServices = new RegexAccountServices();

        ReadSeller readSeller = new ReadSeller();
        if ( regexAccountServices.isValidAccount(account) && readSeller.isRegister(account)){
            System.out.println("ad");
            HomePageOfSeller homePageOfSeller = new HomePageOfSeller();
        }else {
            System.out.println("error");
        }


    }
}
