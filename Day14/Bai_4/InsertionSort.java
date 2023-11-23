public class InsertionSort {
    public static void insertionSort(int[] arr) {
        int n = arr.length;

        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;

            // Di chuyển các phần tử lớn hơn key về sau
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }

            arr[j + 1] = key;

            // In ra mảng sau mỗi bước
            printArray(arr);
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};

        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        System.out.println("Các bước thực hiện của thuật toán sắp xếp chèn:");
        insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }
}