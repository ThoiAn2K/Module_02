import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        if ( number < 2){
            System.out.println("Number is not  a Prime");
        }else {
            int i = 2;
            boolean check = true;
            while (i<number){
                if ( number % i == 0){
                    check = false;
                    break;
                }
                i++;
            }
            if ( check ){
                System.out.println("Number is a Prime");
            } else System.out.println("Number is Not a Prime");

        }
    }
}
