public class InsertionSort {
    public static void insertionSort(int[] list) {
        int n = list.length;

        for (int i = 1; i < n; i++) {
            int key = list[i];
            int j = i - 1;

            while (j >= 0 && list[j] > key) {
                list[j + 1] = list[j];
                j--;
            }

            list[j + 1] = key;
        }
    }

    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 3, 1, 6};

        System.out.println("Mảng trước khi sắp xếp:");
        printArray(arr);

        insertionSort(arr);

        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}