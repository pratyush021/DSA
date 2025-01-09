package neetcode150.ArrayAndHashStrings;

import java.util.Arrays;

public class ProductOrArrayExceptSelf {
    public int[] productExceptSelf(int[] nums) {
        int size = nums.length;
        int[] prefix = new int[size];
        int[] postfix = new int[size];
        int[] ans = new int[size];
        prefix[0] = 1;
        for(int i = 1; i < size; i++) {
            prefix[i] = prefix[i-1] * nums[i-1];
        }
        postfix[size-1] = 1;
        for(int i = size-2; i >= 0; i--) {
            postfix[i] = postfix[i + 1] * nums[i + 1];
        }
        for(int i = 0; i < size; i++) {
            ans[i] = prefix[i] * postfix[i];
        }
        return ans;

    }

    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        ProductOrArrayExceptSelf productOrArrayExceptSelf = new ProductOrArrayExceptSelf();
        int[] ans = productOrArrayExceptSelf.productExceptSelf(nums);
        for(int a: ans) {
            System.out.print(a + "\t");
        }
    }
}
