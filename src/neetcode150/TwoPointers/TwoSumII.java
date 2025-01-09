package neetcode150.TwoPointers;

public class TwoSumII {
    public int[] twoSum(int[] numbers, int target) {
        int i = 0, j = numbers.length-1;
        while(i < j) {
            int sum = numbers[i] + numbers[j];
            if(sum == target) return new int[]{i+1, j+1};
            if(sum < target) i++;
            else j--;
        }
        return new int[]{};
    }

    public static void main(String[] args) {
        int[] ar = {-1, 0};
        int target = -1;
        TwoSumII twoSumII = new TwoSumII();
        int[] ans = twoSumII.twoSum(ar, target);
        for(int a: ans) {
            System.out.print(a + "\t");
        }
    }
}
