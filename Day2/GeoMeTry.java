import java.util.Scanner;

public class GeoMeTry {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int choice ;
        System.out.println("Menu");
        System.out.println("1. Draw the triangle");
        System.out.println("2. Draw the square");
        System.out.println("3. Draw the rectangle");
        System.out.println("0. Exit");
        System.out.println("Enter your choice");
        choice = scanner.nextInt();
        String result = "";

       switch (choice){
           case 1:
               for(int i = 0 ; i < 6; i++){
                   result += "*" ;
                   System.out.println(result);
               }
               break;
           case 2:
               for(int i = 0 ; i < 6; i++){
                   result = "* * * * * *" ;
                   System.out.println(result);
               }
               break;
           case 3:
               for(int i = 0 ; i < 4; i++){
                   result = "* * * * * *" ;
                   System.out.println(result);
               }
               break;
           case 0:
               System.exit(0);
               break;
           default:
               System.out.println("No choice");

       }
    }
}
