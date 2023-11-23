import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class PhoneNumberValidator {

    public static boolean isValidPhoneNumber(String phoneNumber) {
        String regex = "\\(\\d{2}\\)-\\(0\\d{9}\\)";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(phoneNumber);
        return matcher.matches();
    }

    public static void main(String[] args) {
        String phoneNumber1 = "(84)-(0978489648)";
        String phoneNumber2 = "(a8)-(22222222)";
        String phoneNumber3 = "(84)-(22b22222)";
        String phoneNumber4 = "(84)-(9978489648)";

        System.out.println(phoneNumber1 + " is valid: " + isValidPhoneNumber(phoneNumber1));
        System.out.println(phoneNumber2 + " is valid: " + isValidPhoneNumber(phoneNumber2));
        System.out.println(phoneNumber3 + " is valid: " + isValidPhoneNumber(phoneNumber3));
        System.out.println(phoneNumber4 + " is valid: " + isValidPhoneNumber(phoneNumber4));
    }
}