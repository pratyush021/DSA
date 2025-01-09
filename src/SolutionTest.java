import java.util.ArrayList;
import java.util.List;

class SolutionTest {
    public static void main(String[] args) {
        Solution solution = new Solution();

        // Test case 1: Empty tree
        TreeNode root1 = null;
        System.out.println(solution.largestValues(root1)); // Expected output: []

        // Test case 2: Single node tree
        TreeNode root2 = new TreeNode(1);
        System.out.println(solution.largestValues(root2)); // Expected output: [1]

        // Test case 3: Complete binary tree
        TreeNode root3 = new TreeNode(1);
        root3.left = new TreeNode(3);
        root3.right = new TreeNode(2);
        root3.left.left = new TreeNode(5);
        root3.left.right = new TreeNode(3);
        root3.right.right = new TreeNode(9);
        System.out.println(solution.largestValues(root3)); // Expected output: [1, 3, 9]

        assert solution.largestValues(root3) != null;
        assert solution.largestValues(root3).size() == 3;
        // Test case 4: Left-skewed tree
        TreeNode root4 = new TreeNode(1);
        root4.left = new TreeNode(2);
        root4.left.left = new TreeNode(3);
        root4.left.left.left = new TreeNode(4);
        System.out.println(solution.largestValues(root4)); // Expected output: [1, 2, 3, 4]

        // Test case 5: Right-skewed tree
        TreeNode root5 = new TreeNode(1);
        root5.right = new TreeNode(2);
        root5.right.right = new TreeNode(3);
        root5.right.right.right = new TreeNode(4);
        System.out.println(solution.largestValues(root5)); // Expected output: [1, 2, 3, 4]
    }
}