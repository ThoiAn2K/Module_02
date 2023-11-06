import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int number;
        System.out.println("enter");
        number = scanner.nextInt();
        int count = 0;
        int N = 2;
        int result = 0;
        int Numbers = 2;
//        while (result < number) {
              for (int i = 2; i <= Numbers; i++ ){
                  for ( int j = 1; j <= i; j++){
                      if ( i % j == 0){
                          count ++;
                      }
                  }
                  if ( count == 2){
                      System.out.println("Prime " + i);
                      count =0;
                      result ++;
                      Numbers++;
                  } else {
                  Numbers++;
                  count = 0;}
                  if (result == number){
                      break;
                  }
              }

        }
    }
//}
