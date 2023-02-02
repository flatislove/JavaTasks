import java.util.HashMap;
import java.util.Map;

/**
 * In an alien language, surprisingly, they also use English lowercase letters, but possibly in a different order.
 * The order of the alphabet is some permutation of lowercase letters.
 * Given a sequence of words written in the alien language, and the order of the alphabet, return true if and only
 * if the given words are sorted lexicographically in this alien language.
 */
public class VerifyingAnAlienDictionary {
    public static void main(String[] args) {
        String[] words = {"apple", "app"};
        String order = "abcdefghijklmnopqrstuvwxyz";//false
        String[] words1 = {"kuvp", "q"};
        String order1 = "ngxlkthsjuoqcpavbfdermiywz";//true

        VerifyingAnAlienDictionary verifyingAnAlienDictionary = new VerifyingAnAlienDictionary();
        System.out.println(verifyingAnAlienDictionary.isAlienSorted(words, order));
        System.out.println(verifyingAnAlienDictionary.isAlienSorted(words1, order1));
    }

    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Byte> letters = new HashMap<>();
        byte lngt = (byte) order.length();
        for (int i = 0; i < lngt; i++) {
            letters.put(order.charAt(i), (byte) i);
        }
        byte lngtWords = (byte) words.length;
        for (int i = 0; i < lngtWords - 1; i++) {
            byte pointer = 0;
            byte a = 0;
            byte b = 0;
            while (pointer < words[i].length() && pointer < words[i + 1].length() && a==b) {
                a = letters.get(words[i].charAt(pointer));
                b = letters.get(words[i + 1].charAt(pointer));
                pointer++;
            }
            if (a > b) {
                return false;
            }
            if (a==b && words[i].length() > pointer) {
                return false;
            }
        }
        return true;
    }
}
