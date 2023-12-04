package Model.Services;

public class ReceiveDataSellerServices {
    private static ReceiveDataSellerServices instance;
    public static ReceiveDataSellerServices getInstance() {
        if (instance == null) {
            synchronized (ReceiveDataSellerServices.class) {
                if (instance == null) {
                    instance = new ReceiveDataSellerServices();
                }
            }
        }
        return instance;
    }


    public void result(String account){
        RegexAccountServices regexAccountServices = new RegexAccountServices();
        if(regexAccountServices.isValidAccount(account)){

        }
    }
}
