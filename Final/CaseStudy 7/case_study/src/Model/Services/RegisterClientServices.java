package Model.Services;

public class RegisterClientServices {
    private static RegisterClientServices instance;
    public static RegisterClientServices getInstance() {
        if (instance == null) {
            synchronized (RegisterClientServices.class) {
                if (instance == null) {
                    instance = new RegisterClientServices();
                }
            }
        }
        return instance;
    }
}
