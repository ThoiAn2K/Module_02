import java.util.Scanner;

public class MegreArrays {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Nhập kích thước mảng 1: ");
            int size1 = scanner.nextInt();
            int[] array1 = new int[size1];

            System.out.print("Nhập kích thước mảng 2: ");
            int size2 = scanner.nextInt();
            int[] array2 = new int[size2];

            System.out.println("Nhập các phần tử của mảng 1:");
            for (int i = 0; i < size1; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array1[i] = scanner.nextInt();
            }

            System.out.println("Nhập các phần tử của mảng 2:");
            for (int i = 0; i < size2; i++) {
                System.out.print("Phần tử " + (i + 1) + ": ");
                array2[i] = scanner.nextInt();
            }

            int size3 = size1 + size2;
            int[] array3 = new int[size3];

            for (int i = 0; i < size1; i++) {
                array3[i] = array1[i];
            }

            for (int i = 0; i < size2; i++) {
                array3[size1 + i] = array2[i];
            }

            System.out.println("Mảng sau khi gộp:");
            for (int i = 0; i < size3; i++) {
                System.out.print(array3[i] + " ");
            }
        }
    }

