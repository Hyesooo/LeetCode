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
    int count = 0;

    public int pathSum(TreeNode root, int targetSum) {
        if(root == null) return 0;

        dfs(root, targetSum, 0L);
        
        pathSum(root.left, targetSum);
        pathSum(root.right, targetSum);

        return count;
    }
    public void dfs(TreeNode node, int targetSum, long sum) {
        if(node == null) return;

        sum += node.val;
        if(sum == targetSum) { 
            count++; 
        }

        dfs(node.left, targetSum, sum);
        dfs(node.right, targetSum, sum);

    }
}
