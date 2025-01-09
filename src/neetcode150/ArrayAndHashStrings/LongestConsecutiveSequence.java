package neetcode150.ArrayAndHashStrings;

import java.util.HashSet;
import java.util.Set;

public class LongestConsecutiveSequence {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int a: nums) set.add(a);
        int ans = 0;
        for(int i =0; i < nums.length; i++) {
            if(!set.contains(nums[i]-1)) {
                int count = 0;
                int val = nums[i];
                while(set.contains(val)) {
                    val++;
                    count++;
                }
                ans = Math.max(ans, count);
            } else {
                continue;
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        int[] nums = {100, 4, 200, 1, 3, 2};
        LongestConsecutiveSequence longestConsecutiveSequence = new LongestConsecutiveSequence();
        System.out.println(longestConsecutiveSequence.longestConsecutive(nums));
    }
}
