import java.util.Scanner;

class ReadNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number yours want");
        int number = scanner.nextInt();
        String  Result = "";
        String Onesnumber = "";
        String Tensnumber = "";
        String Hundrednumber = "";


        if (number < 10) {
            switch (number) {
                case 0:
                    Onesnumber = "zero";
                    break;
                case 1:
                    Onesnumber = "one";
                    break;
                case 2:
                    Onesnumber = "two";
                    break;
                case 3:
                    Onesnumber = "three";
                    break;
                case 4:
                    Onesnumber = "four";
                    break;
                case 5:
                    Onesnumber = "five";
                    break;
                case 6:
                    Onesnumber = "six";
                    break;
                case 7:
                    Onesnumber = "seven";
                    break;
                case 8:
                    Onesnumber = "eight";
                    break;
                case 9:
                    Onesnumber = "nine";
                    break;
            }
        } // số nhỏ hơn 10
//        System.out.printf(Onesnumber);

        if (number < 20) {
            switch (number) {
                case 10:
                    Onesnumber = "ten";
                    break;
                case 11:
                    Onesnumber = "eleven";
                    break;
                case 12:
                    Onesnumber = "twelve";
                    break;
                case 13:
                    Onesnumber = "thirteen";
                    break;
                case 14:
                    Onesnumber = "fourteen";
                    break;
                case 15:
                    Onesnumber = "fifteen";
                    break;
                case 16:
                    Onesnumber = "sixteen";
                    break;
                case 17:
                    Onesnumber = "seventeen";
                    break;
                case 18:
                    Onesnumber = "eighteen";
                    break;
                case 19:
                    Onesnumber = "nineteen";
                    break;
            }
        } // số nhỏ hơn 20
//        System.out.printf(Onesnumber);


        if (number % 10 == 0) {
            switch (number / 10) {
                case 2:
                    Onesnumber = "twetlety";
                    break;
                case 3:
                    Onesnumber = "thirdty";
                    break;
                case 4:
                    Onesnumber = "fourty";
                    break;
                case 5:
                    Onesnumber = "fifty";
                    break;
                case 6:
                    Onesnumber = "sixty";
                    break;
                case 7:
                    Onesnumber = "seventy";
                    break;
                case 8:
                    Onesnumber = "eighty";
                    break;
                case 9:
                    Onesnumber = "ninety";
                    break;
            }
        } // số chia hết cho 10
        else if (number % 10 != 0 && number < 100) // số không chia hết cho 10 và nhỏ hơn 100
        {
            switch (number / 10) // lấy ra giá trị hàng chục
            {
                case 2:
                    Tensnumber = "twetlety";
                    break;
                case 3:
                    Tensnumber = "thirdty";
                    break;
                case 4:
                    Tensnumber = "fourty";
                    break;
                case 5:
                    Tensnumber = "fifty";
                    break;
                case 6:
                    Tensnumber = "sixty";
                    break;
                case 7:
                    Tensnumber = "seventy";
                    break;
                case 8:
                    Tensnumber = "eighty";
                    break;
                case 9:
                    Tensnumber = "ninety";
                    break;
            }
            switch (number % 10) // lấy ra giá trị hàng đơn vị
            {
                case 1:
                    Onesnumber = "one";
                    break;
                case 2:
                    Onesnumber = "two";
                    break;
                case 3:
                    Onesnumber = "three";
                    break;
                case 4:
                    Onesnumber = "four";
                    break;
                case 5:
                    Onesnumber = "five";
                    break;
                case 6:
                    Onesnumber = "six";
                    break;
                case 7:
                    Onesnumber = "seven";
                    break;
                case 8:
                    Onesnumber = "eight";
                    break;
                case 9:
                    Onesnumber = "nine";
                    break;
            }
            Result = Tensnumber + " " + Onesnumber;
            System.out.printf(Result);

        }

        if (number > 100 )// lấy hàng trăm
        {

            switch (number / 100){
                case 1:
                    Hundrednumber = "one hundred";
                    break;
                case 2:
                    Hundrednumber = "two hundred";
                    break;
                case 3:
                    Hundrednumber = "three hundred";
                    break;
                case 4:
                    Hundrednumber = "four hundred";
                    break;
                case 5:
                    Hundrednumber = "five hundred";
                    break;
                case 6:
                    Hundrednumber = "six hundred";
                    break;
                case 7:
                    Hundrednumber = "seven hundred";
                    break;
                case 8:
                    Hundrednumber = "eight hundred";
                    break;
                case 9:
                    Hundrednumber = "nine hundred";
                    break;
            }

            switch (number % 100 - number % 10 ) // lấy ra giá trị hàng chục
            {
                case 10:
                    Tensnumber = "ten";
                    break;
                case 20:
                    Tensnumber = "twetlety";
                    break;
                case 30:
                    Tensnumber = "thirdty";
                    break;
                case 40:
                    Tensnumber = "fourty";
                    break;
                case 50:
                    Tensnumber = "fifty";
                    break;
                case 60:
                    Tensnumber = "sixty";
                    break;
                case 70:
                    Tensnumber = "seventy";
                    break;
                case 80:
                    Tensnumber = "eighty";
                    break;
                case 90:
                    Tensnumber = "ninety";
                    break;
            }
            switch (number % 10) // lấy ra giá trị hàng đơn vị
            {
                case 1:
                    Onesnumber = "one";
                    break;
                case 2:
                    Onesnumber = "two";
                    break;
                case 3:
                    Onesnumber = "three";
                    break;
                case 4:
                    Onesnumber = "four";
                    break;
                case 5:
                    Onesnumber = "five";
                    break;
                case 6:
                    Onesnumber = "six";
                    break;
                case 7:
                    Onesnumber = "seven";
                    break;
                case 8:
                    Onesnumber = "eight";
                    break;
                case 9:
                    Onesnumber = "nine";
                    break;
            }
            Result = Hundrednumber + " " + Tensnumber + " " + Onesnumber;
            System.out.printf(Result);

        }
    }
}

