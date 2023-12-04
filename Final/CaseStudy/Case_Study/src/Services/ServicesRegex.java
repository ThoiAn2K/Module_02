package Services;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ServicesRegex {

    private static final String ACCOUNT_REGEX = "^[_a-z0-9]{6,}$";

    public static boolean isValidate(String regex) {
        Pattern pattern = Pattern.compile(ACCOUNT_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
