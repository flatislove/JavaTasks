/**
 * You're given strings jewels representing the types of stones that are jewels, and stones
 * representing the stones you have. Each character in stones is a type of stone you have.
 * You want to know how many of the stones you have are also jewels.
 * Letters are case sensitive, so "a" is considered a different type of stone from "A".
 */
public class JewelsAndStones {
    public static void main(String[] args) {
        String jewels = "aA";
        String stones = "aAAbbbb";
        JewelsAndStones jewelsAndStones = new JewelsAndStones();
        System.out.println(jewelsAndStones.numJewelsInStones(jewels, stones));
    }

    public int numJewelsInStones(String jewels, String stones) {
        int lngtS = stones.length();
        int lngtJ = jewels.length();
        byte number = 0;
        for (int i = 0; i < lngtS; i++) {
            for (int j = 0; j < lngtJ; j++) {
                if (stones.charAt(i)==jewels.charAt(j)) {
                    number++;
                }
            }
        }
        return number;
    }
}
