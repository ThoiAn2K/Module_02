public class MainStopWatch {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 100000);
        }

        StopWatch stopwatch = new StopWatch();
        stopwatch.start();

        StopWatch.selectionSort(arr);

        stopwatch.stop();

        System.out.println("Thời gian thực thi của thuật toán sắp xếp chọn cho 100,000 số là: " + stopwatch.getElapsedTime() + " milisecond");
    }
}
