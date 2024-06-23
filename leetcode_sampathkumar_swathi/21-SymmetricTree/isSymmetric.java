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
    public boolean isSymmetric(TreeNode root) {
      return isSymmetric(root, root);
    }

  private boolean isSymmetric(TreeNode p, TreeNode q) {
    if (p == null || q == null)//check if either tree or one is null and return them
      return p == q;

      //values of nodes are same and check the subtrees are symmetric
    return p.val == q.val && isSymmetric(p.left, q.right) && isSymmetric(p.right, q.left);
  }
}

// Example 1:
// Input: root = [1,2,2,3,4,4,3]
// Output: true

// Example 2:
// Input: root = [1,2,2,null,3,null,3]
// Output: false