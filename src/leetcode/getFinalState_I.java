package leetcode;

public class getFinalState_I {
    public int[] getFinalState(int[] nums, int k, int multiplier) {
        assert k != 0;
        assert multiplier != 0;
        while(k-->0) {
            int min_index = find_min(nums);
            nums[min_index] = nums[min_index] * multiplier;
        }
        return nums;
    }
    private int find_min(int[] arr) {
        int min = Integer.MAX_VALUE;
        int min_index = 0;
        for(int i = 0; i < arr.length; i++) {
            if(min > arr[i]) {
                min = arr[i];
                min_index = i;
            }
        }
        return min_index;
    }

    public static void main(String[] args) {
        int nums[] = {2, 1, 3, 5, 6};
        int k = 5;
        int multiplier = 2;
        getFinalState_I state = new getFinalState_I();
        int[] ans = state.getFinalState(nums, k, multiplier);
        for(int a: ans) {
            System.out.print(a + "\t");
        }
    }
}
