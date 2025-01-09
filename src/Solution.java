import java.util.*;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int val) {
        this.val = val;
        this.left = null;
        this.right = null;
    }
}
class Solution {
    /**
     * Finds the largest value in each row of a binary tree.
     *
     * @param root The root node of the binary tree.
     * @return A list of integers representing the largest value in each row of the tree.
     */
    public List<Integer> largestValues(TreeNode root) {
        if(root == null) return new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        List<Integer> ans = new ArrayList<>();

        while(!queue.isEmpty()) {
            int size = queue.size();
            int max = Integer.MIN_VALUE;
            for(int i = 0; i < size; i++) {
                assert queue.peek() != null;
                if(max < queue.peek().val) {
                    max = queue.peek().val;

                }

                TreeNode child = queue.poll();
                if(child.left != null) queue.add(child.left);
                if(child.right != null) queue.add(child.right);
            }
            ans.add(max);
        }
        return ans;
    }

}