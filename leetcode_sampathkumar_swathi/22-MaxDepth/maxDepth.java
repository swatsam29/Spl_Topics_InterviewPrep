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

class Solution {
    public int maxDepth(TreeNode root) {
        if (root == null)//root node is 0-- depth is 0
            return 0;

        //max depth is calculated in the subtrees left and right
        //max depth +1 is returned 
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right)); 
    }
}
