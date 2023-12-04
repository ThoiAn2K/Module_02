package Model.Services;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexAccountServices implements Regex {

    private static RegexAccountServices instance;

    public static RegexAccountServices getInstance() {
        if (instance == null) {
            instance = new RegexAccountServices();
        }
        return instance;
    }

    @Override
    public boolean regex(String regex){
       return isValidate(regex);
    }

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    private boolean isValidate(String regex){
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}

