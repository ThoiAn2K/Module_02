import java.util.Scanner;

public class Draw {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String result = "";
        System.out.println("1.Print the rectangle");
        System.out.println("2.Print the square triangle");
        System.out.println("3.Print isosceles triangle");
        System.out.println("4.Exit");
        int choice;
        System.out.println("Choice your number");
        choice = scanner.nextInt();

        switch (choice){
            case 1:
                for ( int i = 0 ; i < 5 ; i++){
                    result = "* * * * *";
                    System.out.println(result);
                }
                break;
            case 2:
                for ( int i = 0; i < 5 ; i++){
                    result += "*";
                    System.out.println(result);
                }
                break;
            case 3:
                for(int i=7; i>=1 ; i--){
                    result = "";
                    for(int j=1; j<=i ; j++){
                        result += "*";
                    }
                    System.out.println(result);
                }
                break;
            case 4:
                System.exit(4);
        }
    }
}
