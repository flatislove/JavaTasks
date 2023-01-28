import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 * Balanced strings are those that have an equal quantity of 'L' and 'R' characters.
 * Given a balanced string s, split it into some number of substrings such that:
 * Each substring is balanced.
 * Return the maximum number of balanced strings you can obtain.
 */
public class SplitStringInBalancedStrings {
    public static void main(String[] args) {
        String s = "RLRRRLLRLL";
        SplitStringInBalancedStrings strings = new SplitStringInBalancedStrings();
        System.out.println(strings.balancedStringSplit(s));
    }

    public int balancedStringSplit(String s) {
        int count = 0;
        Map<Character, Integer> map = new HashMap<>();
        map.put('R', 0);
        map.put('L', 0);
        for (int i = 0; i < s.length(); i++) {
            map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            if (Objects.equals(map.get('R'), map.get('L'))) {
                count++;
            }
        }
        return count;
    }
}
