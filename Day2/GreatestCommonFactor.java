import java.util.Scanner;

public class GreatestCommonFactor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a,b;
        int result;

        System.out.println("Enter number a");
        a = scanner.nextInt();

        System.out.println("Enter number b");
        b = scanner.nextInt();

        a = Math.abs(a);
        b = Math.abs(b);

        if ( a == 0 && b == 0){
            System.out.printf(" No greatest common factor" );
        } else {
           result = Math.abs((a-b));
           System.out.printf(" Greatest Common Factor is : " + result);
        }
    }
}
