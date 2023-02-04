import java.util.HashMap;
import java.util.Map;

/**
 * Given two strings s1 and s2, return true if s2 contains a permutation of s1, or false otherwise.
 * In other words, return true if one of s1's permutations is the substring of s2.
 */
public class PermutationInString {
    public static void main(String[] args) {
        String s1 = "adc";
        String s2 = "dcda";
        PermutationInString permutationInString = new PermutationInString();
        System.out.println(permutationInString.checkInclusion(s1, s2));
        System.out.println(permutationInString.checkInclusion2(s1, s2));
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()) {
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            char tmp = s1.charAt(i);
            map.putIfAbsent(tmp, 0);
            map.replace(tmp, map.get(tmp) + 1);
        }
        for (int i = 0; i < s2.length() - s1.length() + 1; i++) {
            Map<Character, Integer> tmpMap = new HashMap<>(map);
            char c = s2.charAt(i);
            var val = tmpMap.get(c);
            if (val != null && val != 0) {
                for (int j = 0; j < s1.length(); j++) {
                    char c2 = s2.charAt(i + j);
                    if (tmpMap.get(c2) == null || tmpMap.get(c2) < 0) {
                        break;
                    }
                    tmpMap.put(c2, tmpMap.get(c2) - 1);
                    if (tmpMap.get(c2) == 0) {
                        tmpMap.remove(c2);
                    }
                }
            }
            if (tmpMap.isEmpty()) {
                return true;
            }
        }
        return false;
    }

    public boolean checkInclusion2(String s1, String s2) {
        int lngt1 = s1.length();
        int lngt2 = s2.length();
        if (lngt1 > lngt2) {
            return false;
        }
        int[] count = new int[26];
        for (int i = 0; i < lngt1; i++) {
            count[s1.charAt(i) - 'a']++;
            count[s2.charAt(i) - 'a']--;
        }
        if (allZero(count)) {
            return true;
        }
        for (int i = lngt1; i < lngt2; i++) {
            count[s2.charAt(i) - 'a']--;
            count[s2.charAt(i - lngt1) - 'a']++;
            if (allZero(count)) {
                return true;
            }
        }
        return false;
    }

    private boolean allZero(int[] count) {
        for (int i = 0; i < 26; i++) {
            if (count[i] != 0) {
                return false;
            }
        }
        return true;
    }
}
