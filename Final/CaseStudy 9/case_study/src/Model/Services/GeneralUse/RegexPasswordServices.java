package Model.Services.GeneralUse;

import Model.Implement.Regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexPasswordServices implements Regex {
    private static RegexPasswordServices instance;

    public static RegexPasswordServices getInstance() {
        if (instance == null) {
            instance = new RegexPasswordServices();
        }
        return instance;
    }

    @Override
    public boolean regex(String regex){
        return isValidate(regex);
    }

    private static final String ACCOUNT_REGEX ="^(?=.*[!@#$%^&*()_+\\\\\\-=[\\\\]{};':\\\"\\\\\\\\|,.<>/?])(?=.*[0-9])[a-zA-Z0-9!@#$%^&*()_+\\\\\\-=[\\\\]{};':\\\"\\\\\\\\|,.<>/?]{7,}$";

    private boolean isValidate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
