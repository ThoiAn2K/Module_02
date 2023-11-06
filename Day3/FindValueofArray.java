import java.util.Scanner;

public class FindValueofArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Kích thước của mảng: ");
        int size1 = scanner.nextInt();
        int [] array = new int[size1];

        for (int i =0; i < array.length; i++){
            System.out.println("Nhập giá trị của phần tử " + (i+1) + " :");
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        int result = array[0];
        for (int i = 0; i< array.length; i++){
            if ( min > array[i]){
                min = array[i];
                result = array[i];
            }
        }
        System.out.print("Mảng của bạn là: ");
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");

        }
        System.out.println(" ");
        System.out.println(" Giá trị nhỏ nhất: " + result);
    }
}
