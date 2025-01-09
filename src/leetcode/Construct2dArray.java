package leetcode;

public class Construct2dArray {

    public int[][] construct2DArray(int[] original, int m, int n) {
        if(original.length != m*n) return new int[0][0];
        int[][] ans = new int[m][n];
        // when i reaches n, then we have to add one row and move the row index to 0
        for(int i = 0; i < original.length; i++) {
            ans[i/n][i%n] = original[i]; 
        }
        return ans;
    }

    public static void main(String[] args) {
        Construct2dArray obj = new Construct2dArray();
        int[] arr = {1, 2, 3, 4};
//        int[] arr = {1, 2};
        int[][] ans = obj.construct2DArray(arr, 2, 2);

        for(int[] a: ans) {
            for(int ar: a) {
                System.out.print(ar +" ");
            }
            System.out.println();
        }
    }
}
