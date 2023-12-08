package Model.Services.GeneralUse;

import Model.Implement.Result;

public class ResultPasswordAgainService implements Result {
    private static ResultPasswordAgainService instance;

    public static ResultPasswordAgainService getInstance() {
        if (instance == null) {
            instance = new ResultPasswordAgainService();
        }
        return instance;
    }

    @Override
    public boolean result(String password, String passwordAgain) {
        return resultsCheck(password,passwordAgain);
    }
    private boolean resultsCheck(String password, String passwordAgain){
        if (password.equals(passwordAgain)){
            return true;
        }else return false;

    }
}
