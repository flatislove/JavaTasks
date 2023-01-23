import java.util.*;

/**
 * In a town, there are n people labeled from 1 to n. There is a rumor that one of these people is secretly the town judge.
 * If the town judge exists, then:
 * The town judge trusts nobody.
 * Everybody (except for the town judge) trusts the town judge.
 * There is exactly one person that satisfies properties 1 and 2.
 * You are given an array trust where trust[i] = [ai, bi] representing that the person labeled ai trusts the person labeled bi.
 * Return the label of the town judge if the town judge exists and can be identified, or return -1 otherwise.
 */
public class FindTheTownJudge {
    public static void main(String[] args) {
        int n = 3;
        int[][] trust = {{1, 3}, {1, 4}, {2, 3}, {2, 4}, {4, 3}};
        FindTheTownJudge find = new FindTheTownJudge();
        System.out.println(find.findJudge(n, trust));
    }

    public int findJudge(int n, int[][] trust) {
        if (trust.length==0 && n==1) {
            return 1;
        }
        Map<Integer, Integer> judge = new HashMap<>();
        Set<Integer> voters = new HashSet<>();
        for (int[] ints : trust) {
            if (judge.containsKey(ints[1])) {
                judge.put(ints[1], judge.get(ints[1]) + 1);
            }
            judge.putIfAbsent(ints[1], 1);
            voters.add(ints[0]);
        }
        if (n - voters.size() > 1) {
            return -1;
        }
        if (!judge.isEmpty()) {
            int judgeNumber = Collections.max(judge.entrySet(), Map.Entry.comparingByValue()).getKey();
            for (int[] ints : trust) {
                if (judgeNumber==ints[0]) {
                    return -1;
                }
            }
            return judgeNumber;
        }
        return -1;
    }
}