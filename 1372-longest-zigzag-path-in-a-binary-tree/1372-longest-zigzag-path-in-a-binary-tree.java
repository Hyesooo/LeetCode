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
    int length = 0;
    public int longestZigZag(TreeNode root) {
        if (root == null) return 0;

        dfs(root.left, 0, 1);
        dfs(root.right, 1, 1);

        return length;
    }
    public void dfs(TreeNode node, int direction, int depth) {
        if(node == null) return;

        length = Math.max(length, depth);

        if(direction == 0) {
            dfs(node.right, 1, depth+1);
            dfs(node.left, 0, 1);
        } else {
            dfs(node.left, 0, depth+1);
            dfs(node.right, 1, 1);
        }
    }
}