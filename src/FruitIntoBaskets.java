import java.util.HashMap;
import java.util.Map;

/**
 * You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented
 * by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.
 * You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:
 * You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the
 * amount of fruit each basket can hold.
 * Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree)
 * while moving to the right. The picked fruits must fit in one of your baskets.
 * Once you reach a tree with fruit that cannot fit in your baskets, you must stop.
 * <p>
 * Given the integer array fruits, return the maximum number of fruits you can pick.
 */
public class FruitIntoBaskets {
    public static void main(String[] args) {
        int[] fruits = new int[]{0, 0, 1, 1};
        FruitIntoBaskets fruitIntoBaskets = new FruitIntoBaskets();
        System.out.println(fruitIntoBaskets.totalFruit(fruits));
        System.out.println(fruitIntoBaskets.totalFruit2(fruits));
    }

    public int totalFruit(int[] fruits) {
        int length = 0;
        int currentLengtn;
        for (int i = 0; i < fruits.length; i++) {
            int pointer = i;
            while (pointer < fruits.length && fruits[pointer] == fruits[i]) {
                pointer++;
            }
            currentLengtn = 0;
            for (int j = i; j < fruits.length; j++) {
                if ((fruits[j] == fruits[i] || fruits[j] == fruits[pointer])) {
                    currentLengtn++;
                } else break;
            }
            if (currentLengtn > length) {
                length = currentLengtn;
            }
        }
        return length;
    }

    public int totalFruit2(int[] fruits) {
        int length = 0;
        int start = 0;
        int end = 0;
        Map<Integer, Integer> map = new HashMap<>();
        while (end < fruits.length) {
            if (map.size() <= 2) {
                map.put(fruits[end], end++);
            }
            if (map.size() > 2) {
                int min = fruits.length - 1;
                for (int value : map.values()) {
                    min = Math.min(min, value);
                }
                map.remove(fruits[min]);
                start = min + 1;
            }
            length = Math.max(length, end - start);
        }
        return length;
    }
}
