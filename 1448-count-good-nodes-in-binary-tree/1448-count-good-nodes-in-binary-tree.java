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
    public int goodNodes(TreeNode root) {
        return dfs(root, root.val);
    }

    public int dfs(TreeNode node, int maxValue) {
        if(node == null) return 0;
        if(node.left == null && node.right == null) {
            if(node.val < maxValue) return 0;
            else return 1;
        }

        int c1 = dfs(node.left, Math.max(node.val, maxValue));
        int c2 = dfs(node.right, Math.max(node.val, maxValue));
        int count = node.val < maxValue ? 0 : 1;

        return c1 + c2 + count;
    }
}