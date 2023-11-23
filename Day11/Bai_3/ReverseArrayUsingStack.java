import java.util.Stack;

public class ReverseArrayUsingStack {
    public static void reverseArray(int [] arr){
        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i< arr.length; i++){
            stack.push(arr[i]);
        }
        for (int i = 0; i < arr.length; i++ ){
            arr[i] = stack.pop();
        }
    }

    public static void main(String[] args) {
        int [] arr = {1,2,3,4,5};

        System.out.println("Before : ");
        for (int num: arr){
            System.out.println(num);
        }

        reverseArray(arr);
        System.out.println("\nAfter");
        for (int num : arr){
            System.out.println(num);
        }
    }
}
