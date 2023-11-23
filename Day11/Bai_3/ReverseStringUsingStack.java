import java.util.Stack;

public class ReverseStringUsingStack {
    public static String reverseString(String input){
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++){
            stack.push(input.charAt(i));
        }
        StringBuilder ouput = new StringBuilder();
        while (!stack.isEmpty()){
            ouput.append(stack.pop());
        }
        return ouput.toString();
    }
    public static void main(String[] args) {
        String input = "Hello, World";
        System.out.println("Before: " + input);
        String reversed = reverseString(input);
        System.out.println("After : " + reversed);
    }
}
