import java.util.ArrayList;
import java.util.List;

/**
 * You are given an array items, where each items[i] = [typei, colori, namei] describes the type, color, and name of
 * the ith item. You are also given a rule represented by two strings, ruleKey and ruleValue.
 * The ith item is said to match the rule if one of the following is true:
 * ruleKey == "type" and ruleValue == typei.
 * ruleKey == "color" and ruleValue == colori.
 * ruleKey == "name" and ruleValue == namei.
 * Return the number of items that match the given rule.
 */
public class CountItemsMatchingRule {
    public static void main(String[] args) {
        List<List<String>> items = new ArrayList<>();
        items.add(List.of("phone", "blue", "pixel"));
        items.add(List.of("computer", "silver", "lenovo"));
        items.add(List.of("phone", "gold", "iphone"));
        String ruleKey = "color";
        String ruleValue = "silver";
        CountItemsMatchingRule countItemsMatchingRule = new CountItemsMatchingRule();
        System.out.println(countItemsMatchingRule.countMatches(items, ruleKey, ruleValue));
    }

    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int pointer = -1;
        int counter = 0;
        switch (ruleKey) {
            case "type" -> pointer = 0;
            case "color" -> pointer = 1;
            case "name" -> pointer = 2;
        }
        for (List<String> item : items) {
            if (item.get(pointer).equals(ruleValue)) {
                counter++;
            }
        }
        return counter;
    }
}
