import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class PalindromeCheck {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase();
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new LinkedList<>();

        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);

            if (Character.isLetter(c)) {
                stack.push(c);
                queue.offer(c);
            }
        }

        while (!stack.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "Able was I ere I saw Elba";
        boolean isPalindrome = isPalindrome(str);
        System.out.println(isPalindrome); // Output: true
    }
}
