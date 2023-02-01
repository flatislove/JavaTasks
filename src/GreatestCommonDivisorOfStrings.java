import java.util.ArrayList;

/**
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t
 * (i.e., t is concatenated with itself one or more times).
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class GreatestCommonDivisorOfStrings {
    public static void main(String[] args) {
        String str1 = "ABABABAB";
        String str2 = "ABAB";
        GreatestCommonDivisorOfStrings greatest = new GreatestCommonDivisorOfStrings();
        System.out.println(greatest.gcdOfStrings(str1, str2));
    }

    public String gcdOfStrings(String str1, String str2) {
        ArrayList<Integer> divisors = new ArrayList<>();
        int lngtStr1 = str1.length();
        int lngtStr2 = str2.length();
        for (int i = Math.min(lngtStr1, lngtStr2); i > 0; i--) {
            if (lngtStr1 % i==0 && lngtStr2 % i==0) {
                divisors.add(i);
            }
        }
        for (Integer divisor : divisors) {
            String strDiv = str1.substring(0, divisor);
            int timesStr1 = lngtStr1 / divisor;
            int timesStr2 = lngtStr2 / divisor;
            if (str1.equals(strDiv.repeat(timesStr1)) && str2.equals(strDiv.repeat(timesStr2))) {
                return strDiv;
            }
        }
        return "";
    }
}
