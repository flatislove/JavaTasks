/**
 * The Tribonacci sequence Tn is defined as follows:
 * T0 = 0, T1 = 1, T2 = 1, and Tn+3 = Tn + Tn+1 + Tn+2 for n >= 0.
 * Given n, return the value of Tn.
 */
public class NthTribonacciNumber {
    public static void main(String[] args) {
        int n = 25;
        NthTribonacciNumber nthTribonacciNumber = new NthTribonacciNumber();
        System.out.println(nthTribonacciNumber.tribonacci(n));
    }

    public int tribonacci(int n) {
        int n0 = 0;
        int n1 = 1;
        int n2 = 1;
        if (n==0) {
            return n0;
        }
        for (int i = 3; i <= n; i++) {
            int tmp = n0 + n1 + n2;
            n0 = n1;
            n1 = n2;
            n2 = tmp;
        }
        return n2;
    }
}
