import java.util.Stack;

public class BracketCheck {
    public static boolean isBracketValid(String expression) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < expression.length(); i++) {
            char c = expression.charAt(i);

            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else if (c == ')' || c == ']' || c == '}') {
                if (stack.isEmpty()) {
                    return false;
                }

                char top = stack.pop();

                if ((c == ')' && top != '(') ||
                        (c == ']' && top != '[') ||
                        (c == '}' && top != '{')) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression1 = "s * (s – a) * (s – b) * (s – c)";
        String expression2 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";
        String expression3 = "s * (s – a) * (s – b * (s – c)";
        String expression4 = "s * (s – a) * s – b) * (s – c)";
        String expression5 = "(– b + (b^2 – 4*a*c)^(0.5/ 2*a))";

        System.out.println(isBracketValid(expression1));
        System.out.println(isBracketValid(expression2));
        System.out.println(isBracketValid(expression3));
        System.out.println(isBracketValid(expression4));
        System.out.println(isBracketValid(expression5));
    }
}
