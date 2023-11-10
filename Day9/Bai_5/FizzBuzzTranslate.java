public class FizzBuzzTranslate {
    public String translate(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            return "FizzBuzz";
        } else if (number % 3 == 0 || String.valueOf(number).contains("3")) {
            return "Fizz";
        } else if (number % 5 == 0 || String.valueOf(number).contains("5")) {
            return "Buzz";
        } else {
            return convertToWord(number);
        }
    }

    private String convertToWord(int number) {
        if (number < 1 || number > 99) {
            throw new IllegalArgumentException("Number must be between 1 and 99");

        }
        String[] units = {"khong", "mot", "hai", "ba", "bon", "nam", "sau", "bay", "tam", "chin", "muoi", "muoi mot", "muoi hai", "muoi ba", "muoi bon", "muoi lam", "muoi sau", "muoi bay", "muoi tam", "muoi chin"};
        String[] tens = {"", "muoi", "hai muoi", "ba muoi", "bon muoi", "nam muoi", "sau muoi", "bay muoi", "tam muoi", "chin muoi"};

        if (number < 20) {
            return units[number];
        } else {
            int unitDigit = number % 10;
            int tensDigit = number / 10;
            return tens[tensDigit] + " " + units[unitDigit];
        }
    }
}


