package View.Home;

public class PaymentOfClient {

    private static PaymentOfClient instance;

    public static PaymentOfClient getInstance() {
        if (instance == null) {
            instance = new PaymentOfClient();
        }
        return instance;
    }

    public void paymentOfClient(){
        System.out.println("==============================");
        System.out.println("1.Wallet");
        System.out.println("2.Add money to your account");
        System.out.println("3.Cart checkout ");
        System.out.println("4.Return to previous step");
        System.out.println("==============================");
        System.out.println("Please enter the number corresponding to the content you need");
    }
}
