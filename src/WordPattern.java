import java.util.HashMap;
import java.util.Map;

/**
 * Given a pattern and a string s, find if s follows the same pattern.
 * Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in s.
 */
public class WordPattern {
    public static void main(String[] args) {
        String pattern = "ab";
        String s = "happy hacking";
        WordPattern wordPattern = new WordPattern();
        System.out.println(wordPattern.wordPattern(pattern, s));
    }

    public boolean wordPattern(String pattern, String s) {
        String[] strings = s.split(" ");
        if (strings.length!=pattern.length()) {
            return false;
        }
        char pointer = 0;
        Map<Character, Character> map = new HashMap<>();
        while (pointer < strings.length) {
            if (!map.containsValue(strings[pointer].charAt(0))) {
                map.putIfAbsent(pattern.charAt(pointer), strings[pointer].charAt(0));
            }
            if (!map.containsKey(pattern.charAt(pointer)) || map.get(pattern.charAt(pointer))!=strings[pointer].charAt(0)) {
                return false;
            }
            pointer++;
        }
        return true;
    }
}
