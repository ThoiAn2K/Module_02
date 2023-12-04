package Services;

public class GeneralCheckRegisterOfClient {
    public static GeneralCheckRegisterOfClient generalCheckRegisterOfClient;

    public static GeneralCheckRegisterOfClient ClientDataCheckingProgram() {
        if (generalCheckRegisterOfClient != null) {
            generalCheckRegisterOfClient = new GeneralCheckRegisterOfClient();
        }
        return ClientDataCheckingProgram();
    }

    boolean isValidate;

//    public void generalCheckClients(Boolean ){


    }


