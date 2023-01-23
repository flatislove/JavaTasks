import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RomanToInteger {
    /**
     * Given a roman numeral, convert it to an integer.
     */
    public static void main(String[] args) {
        String s = "MCMXCIV";
        RomanToInteger romanToInteger = new RomanToInteger();
        System.out.println(romanToInteger.romanToInt(s));
    }

    public int romanToInt(String s) {
        if (s.length()==0) {
            return 0;
        }
        Map<Character, Integer> map = Stream.of(new Object[][]{
                {'I', 1}, {'V', 5}, {'X', 10}, {'L', 50}, {'C', 100}, {'D', 500}, {'M', 1000}
        }).collect(Collectors.toMap(p -> (Character) p[0], p -> (Integer) p[1]));
        int integerValue = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            int current = map.get(s.charAt(i));
            int next = map.get(s.charAt(i + 1));
            integerValue = current < next ? integerValue - current:integerValue + current;
        }
        return integerValue + map.get(s.charAt(s.length() - 1));
    }
}