import java.util.Arrays;
import java.util.Scanner;

public class BinarySearchExample {
    public static void main(String[] args) {
        // Bước 1: Khởi tạo mảng từ người dùng
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số phần tử của mảng: ");
        int n = scanner.nextInt();

        int[] array = new int[n];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            array[i] = scanner.nextInt();
        }

        // Bước 2: Sắp xếp lại mảng theo thứ tự từ bé đến lớn
        Arrays.sort(array);

        // Bước 3: Khai báo hàm binarySearch
        System.out.print("Nhập giá trị cần tìm: ");
        int value = scanner.nextInt();
        int index = binarySearch(array, 0, array.length - 1, value);

        if (index != -1) {
            System.out.println("Phần tử " + value + " được tìm thấy tại vị trí " + index);
        } else {
            System.out.println("Phần tử " + value + " không được tìm thấy trong mảng");
        }

        scanner.close();
    }

    // Bước 4-8: Hàm binarySearch
    public static int binarySearch(int[] array, int left, int right, int value) {
        while (left <= right) {
            int middle = (left + right) / 2;

            if (array[middle] == value) {
                return middle; // Bước 5: Tìm thấy giá trị, trả về vị trí middle
            }

            if (value > array[middle]) {
                left = middle + 1; // Bước 6: Giá trị lớn hơn, tìm phía bên phải của middle
            } else {
                right = middle - 1; // Bước 7: Giá trị nhỏ hơn, tìm phía bên trái của middle
            }
        }

        return -1; // Bước 8: Không tìm thấy giá trị trong mảng
    }
}