package neetcode150.slidingwindow;

import java.util.HashSet;
import java.util.Set;

public class lengthOfLongestSubstring_3 {
    public static int lengthOfLongestSubstring(String s) {
        int left = 0, ans = 0, right = 0;
        Set<Character> set = new HashSet<>();
        while(right < s.length() && left <= right) {

            while(set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            right++;
            ans = Math.max(ans, set.size());
        }
        return ans;
    }
    public static void main(String[] args) {
        String s1 = "abcabcab";
        String s2 = "bbbbbbb";
        String s3 = "pwwkew";
        int l1 = lengthOfLongestSubstring(s1);
        int l2 = lengthOfLongestSubstring(s2);
        int l3 = lengthOfLongestSubstring(s3);
        System.out.println(l1 + " " + l2 + " " + l3);
    }
}
