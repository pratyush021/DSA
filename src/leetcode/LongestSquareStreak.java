package leetcode;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class LongestSquareStreak {

    public int longestSquareStreak(int[] nums) {
        Set<Long> set = new HashSet<>(); 
        for(int n: nums) set.add((long)n); 
        int ans = -1; 
        for(int a: nums) {
            long current = a; 
            int currentStreak = 1; 
            while (set.contains(current * current)) { 
                currentStreak++; 
                current = current * current; 
                if(current > 100000) break; 
            }
            if(currentStreak >= 2) 
            ans = Math.max(ans, currentStreak);
        }
        return ans; 
    }

    public static void main(String[] args) {
        int[] arr = {4,3,6,16,8,2};
        LongestSquareStreak obj = new LongestSquareStreak(); 
        System.out.println(obj.longestSquareStreak(arr));
    }
}
