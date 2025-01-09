package neetcode150.TwoPointers;

import java.util.*;

public class ThreeSum {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        if(nums.length < 3) return Collections.EMPTY_LIST;
        Set<List<Integer>> list = new HashSet<>();
        for(int i = 0; i < nums.length - 2; i++) {
            int j = i + 1;
            int k = nums.length -1;
           while (j < k) {
               int sum = nums[i] + nums[j] + nums[k];
               if(sum == 0) {
                   list.add(Arrays.asList(nums[i], nums[j], nums[k]));
                   j++; k--;
               }
               else if(sum < 0) j++;
               else k--;
           }
        }
        return new ArrayList<>(list);
    }
    List<List<Integer>> func(int[] nums) {
        // WHY IS THIS NOT WORKING???
        HashSet<Integer> set = new HashSet<>();
        for(int a: nums) set.add(a);
        List<List<Integer>> ans = new ArrayList<>();
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j< nums.length; j++) {
                List<Integer> temp = new ArrayList<>();
                if(set.contains( (nums[i] + nums[j]))) {
                    System.out.println(nums[i] + "\t" + nums[j] + "\t" +( -1 * nums[i]+nums[j]));
                    temp.add(nums[i]);
                    temp.add(nums[j]);
                    temp.add(nums[i]+nums[j]);
                    ans.add(temp);
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {-1,0,1,2,-1,-4};
        ThreeSum obj = new ThreeSum();
        System.out.println(obj.threeSum(arr));
    }
}
