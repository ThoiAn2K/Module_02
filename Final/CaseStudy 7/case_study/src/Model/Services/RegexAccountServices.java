package Model.Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAccountServices {
    private static RegexAccountServices instance;

    public static RegexAccountServices getInstance() {
        if (instance == null) {
            synchronized (RegexAccountServices.class) {
                if (instance == null) {
                    instance = new RegexAccountServices();
                }
            }
        }
        return instance;
    }

    public boolean isValidAccount(String account) {
        final String ACCOUNT_PATTERN = "^[a-zA-Z][a-zA-Z0-9]{6,9}$";

        Pattern pattern = Pattern.compile(ACCOUNT_PATTERN);
        Matcher matcher = pattern.matcher(account);
        return matcher.matches();

    }

}
