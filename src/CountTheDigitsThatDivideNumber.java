/**
 * Given an integer num, return the number of digits in num that divide num.
 * An integer val divides nums if nums % val == 0.
 */
public class CountTheDigitsThatDivideNumber {
    public static void main(String[] args) {
        int num = 1248;
        CountTheDigitsThatDivideNumber countTheDigitsThatDivideNumber = new CountTheDigitsThatDivideNumber();
        System.out.println(countTheDigitsThatDivideNumber.countDigits(num));
    }

    public int countDigits(int num) {
        int count = 0;
        int tmp = num;
        while (tmp > 0) {
            int current = tmp % 10;
            if (num % current==0) {
                count++;
            }
            tmp /= 10;
        }
        return count;
    }
}