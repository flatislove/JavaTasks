import java.util.HashMap;
import java.util.Map;

/**
 * You are given the strings key and message, which represent a cipher key and a secret message, respectively.
 * The steps to decode message are as follows:
 * Use the first appearance of all 26 lowercase English letters in key as the order of the substitution table.
 * Align the substitution table with the regular English alphabet.
 * Each letter in message is then substituted using the table.
 * Spaces ' ' are transformed to themselves.
 * For example, given key = "happy boy" (actual key would have at least one instance of each letter in the alphabet),
 * we have the partial substitution table of ('h' -> 'a', 'a' -> 'b', 'p' -> 'c', 'y' -> 'd', 'b' -> 'e', 'o' -> 'f').
 * Return the decoded message.
 */
public class DecodeTheMessage {
    public static void main(String[] args) {
        String key = "the quick brown fox jumps over the lazy dog";
        String message = "vkbs bs t suepuv";//this is a secret
        DecodeTheMessage decodeTheMessage = new DecodeTheMessage();
        System.out.println(decodeTheMessage.decodeMessage(key, message));
    }

    public String decodeMessage(String key, String message) {
        key = key.replaceAll(" ", "");
        Map<Character, Character> map = new HashMap<>();
        StringBuilder sb = new StringBuilder();
        char start = 'a';
        for (int i = 0; i < key.length(); i++) {
            if (!map.containsKey(key.charAt(i))) {
                map.put(key.charAt(i), start++);
            }
        }
        for (int i = 0; i < message.length(); i++) {
            if (map.containsKey(message.charAt(i))) {
                sb.append(map.get(message.charAt(i)));
            } else {
                sb.append(message.charAt(i));
            }
        }
        return sb.toString();
    }
}
