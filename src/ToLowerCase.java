/**
 * Given a string s, return the string after replacing every uppercase letter with the same lowercase letter.
 */
public class ToLowerCase {
    public static void main(String[] args) {
        String s = "Spring Boot";
        ToLowerCase toLowerCase = new ToLowerCase();
        System.out.println(toLowerCase.toLowerCase(s));
    }

    public String toLowerCase(String s) {
        char[] word = new char[s.length()];
        for (int i = 0; i < s.length(); i++) {
            char current = s.charAt(i);
            if ((byte) current > 64 && (byte) current < 91) {
                word[i] = (char) ((byte) current + 32);
            } else {
                word[i] = current;
            }
        }
        return String.valueOf(word);
    }
}
