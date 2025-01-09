package neetcode150.TwoPointers;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int size = height.length;
        int ans = Integer.MIN_VALUE;
        //brute force
        int i = 0, j = size - 1;
        while(i < j) {
            int bottleNeck = Math.min(height[i], height[j]);
            int width = j - i;
            ans = Math.max(ans, bottleNeck * width);
            if(height[i] > height[j]) {
                j--;
            } else {
                i++;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        ContainerWithMostWater containerWithMostWater = new ContainerWithMostWater();
        System.out.println(containerWithMostWater.maxArea(arr));
    }
}
