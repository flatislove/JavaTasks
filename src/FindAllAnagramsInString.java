import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Given two strings s and p, return an array of all the start indices of p's anagrams in s.
 * You may return the answer in any order.
 * An Anagram is a word or phrase formed by rearranging the letters of a different word or phrase,
 * typically using all the original letters exactly once.
 */
public class FindAllAnagramsInString {
    public static void main(String[] args) {
        String s = "cbaebabacd";
        String p = "abc";
        FindAllAnagramsInString findAllAnagramsInString = new FindAllAnagramsInString();
        System.out.println(findAllAnagramsInString.findAnagrams(s, p));
    }

    public List<Integer> findAnagrams(String s, String p) {
        List<Integer> indices = new ArrayList<>();
        if (s.length() < p.length()) {
            return indices;
        }
        int[] ints = new int[26];
        for (int i = 0; i < p.length(); i++) {
            ints[p.charAt(i) - 'a']++;
        }
        int[] tmp = ints.clone();
        for (int i = 0; i < s.length() - p.length() + 1; i++) {
            tmp = ints.clone();
            for (int j = 0; j < p.length(); j++) {
                tmp[s.charAt(j + i) - 'a']--;
            }
            if (isAnagram(tmp)) {
                indices.add(i);
            }
        }
        System.out.println(Arrays.toString(tmp));
        return indices;
    }

    public boolean isAnagram(int[] arr) {
        for (int j : arr) {
            if (j != 0) {
                return false;
            }
        }
        return true;
    }
}
