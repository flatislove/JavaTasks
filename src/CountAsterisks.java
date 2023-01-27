/**
 * You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words,
 * the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
 * Return the number of '*' in s, excluding the '*' between each pair of '|'.
 * Note that each '|' will belong to exactly one pair.
 */
public class CountAsterisks {
    public static void main(String[] args) {
        String s = "l|*e*et|c**o|*de|";
        CountAsterisks countAsterisks = new CountAsterisks();
        System.out.println(countAsterisks.countAsterisks(s));
    }

    public int countAsterisks(String s) {
        boolean isCount = true;
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='*' && isCount) {
                count++;
            } else if (s.charAt(i)=='|') {
                isCount = !isCount;
            }
        }
        return count;
    }
}
