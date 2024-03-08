/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    TreeNode ans = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        dfs(root, p.val, q.val);
        return ans;
    }

    public boolean dfs(TreeNode node, int val1, int val2) {
        if(node == null) {
            return false;
        }
        boolean hit = node.val == val1 || node.val == val2;

        boolean val1_rt = dfs(node.left, val1, val2);
        boolean val2_rt = dfs(node.right, val1, val2);

        if(val1_rt && val2_rt) { ans = node; }
        if(hit && val1_rt || hit && val2_rt) { ans = node; }

        if(val1_rt){ return true; }
        if(val2_rt){ return true; }

        return hit;

    }
}