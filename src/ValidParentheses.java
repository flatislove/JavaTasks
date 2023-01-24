import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
 * An input string is valid if:
 * Open brackets must be closed by the same type of brackets.
 * Open brackets must be closed in the correct order.
 * Every close bracket has a corresponding open bracket of the same type.
 */
public class ValidParentheses {
    public static void main(String[] args) {
        String s = "()[]{})";
        ValidParentheses validParentheses = new ValidParentheses();
        System.out.println(validParentheses.isValid(s));
    }

    public boolean isValid(String s) {
        Map<Character, Character> map = Stream.of(new Object[][]{
                {'{', '}'}, {'(', ')'}, {'[', ']'}
        }).collect(Collectors.toMap(p -> (Character) p[0], p -> (Character) p[1]));
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            char currentChar = s.charAt(i);
            if (map.containsKey(currentChar)) {
                stack.push(currentChar);
            } else if (!stack.isEmpty() && map.get(stack.lastElement())==currentChar) {
                stack.pop();
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }
}
