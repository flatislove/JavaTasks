/**
 * Given a positive integer n, return the smallest positive integer that is a multiple of both 2 and n.
 */
public class SmallestEvenMultiple {
    public static void main(String[] args) {
        int n = 5;
        SmallestEvenMultiple smallestEvenMultiple = new SmallestEvenMultiple();
        System.out.println(smallestEvenMultiple.smallestEvenMultiple(n));
    }

    public int smallestEvenMultiple(int n) {
        int number = n;
        while (number % n!=0 || number % 2!=0) {
            number += n;
        }
        return number;
    }
}
