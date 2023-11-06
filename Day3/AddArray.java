import java.util.Scanner;

public class AddArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int [] array = new int[10];
        //      int [] array = {1,2,3,4,5,6,7,8,9,0};
        System.out.print("Enter value ");

        int x = scanner.nextInt();

        System.out.println("Enter position ");
        int index = scanner.nextInt();

        if (index < 0 || index > array.length){
            System.out.println("erorr");
            return;
        }

        for ( int i = array.length - 1 ; i > index ;i--){
            array[i] = array[i - 1];
        }

            array[index] = x;
            System.out.println("new array");

            for (int i = 0; i <  array.length; i++){
                System.out.print(array[i] + " ");
            }

     }
}
