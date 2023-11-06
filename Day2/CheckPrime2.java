import java.util.Scanner;

public class CheckPrime2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = 2 ;
        int count = 0;
        int numberIndex ;
        System.out.println("enter");
        numberIndex = scanner.nextInt();
        int result = 0;


        for ( int i = 2; i <= number; i++ ){
            for ( int j =1; j <= i; j++){
                if (i % j == 0){
                    count++;
                }
            }
            if ( count == 2){
                count = 0;
                System.out.println("Prime : " + i);
                number++;
                result++;

            }
            else {
                count = 0;
                number++;
            }
            if (result == numberIndex){
                break;
            }
        }
    }
 }

