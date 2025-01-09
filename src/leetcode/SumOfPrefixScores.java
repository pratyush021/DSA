package leetcode;

import java.util.HashMap;
import java.util.Map;

public class SumOfPrefixScores {
    public int[] sumPrefixScores(String[] words) {
        int[] ans = new int[words.length];
        Map<String, Integer> map = new HashMap<>();
        for(int i = 0; i < words.length; i++) {
            String[] prefixArr = getPrefix(words[i]);
            int score = getScore(prefixArr, map, words);
            ans[i] = score;
        }
        System.out.println(map);
        return ans;
    }
    private String[] getPrefix(String s) {
        String[] ans = new String[s.length() * 2];
        int idx = 0;
        for(int i = 0; i < s.length(); i++) {
            ans[idx++] =  s.substring(0, i + 1);
        }

        return ans;
    }
    private int getScore(String[] prefixArr, Map<String, Integer> map, String[] arr) {
        int score = 0;
        int idx = 0;
        int count = 0;
        for(int i = 0; i < prefixArr.length; i++) {
            if(map.containsKey(prefixArr[i])) {
                score += map.get(prefixArr[i]);
            } else {
                idx = 0;
                count = 0;
                while(isPrefix(prefixArr[i], arr[idx++])) count++;
                map.put(prefixArr[i], count);
                score += count;
            }

        }
        return score;
    }
    private boolean isPrefix(String s, String t) {
        int i = 0;
        int count = 0;
        if(s == null || t == null) return false;
        char[] ar1 = s.length() < t.length() ? s.toCharArray() : t.toCharArray();
        char[] ar2 = s.length() > t.length() ? s.toCharArray() : t.toCharArray();
        while(i < ar1.length && ar1[i] == ar2[i]) {
            i++;
            count++;
        }
        return count > 0;
    }
    public static void main(String[] args) {
        String[] words = {"abc","ab","bc","b"};
        SumOfPrefixScores obj = new SumOfPrefixScores();
        int[] ans = obj.sumPrefixScores(words);
        for(int a: ans) {
            System.out.print(a + " \t");
        }
    }
}
