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
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> r1 = this.dfs(root1, new ArrayList<Integer>());
        List<Integer> r2 = this.dfs(root2, new ArrayList<Integer>());

        if(r1.size() != r2.size()) return false;

        for(int i=0; i<r1.size() ;i++) {
            if(!r1.get(i).equals(r2.get(i))) {
                return false;
            }
        }

        return true;
        
    }

    public List<Integer> dfs(TreeNode node, List<Integer> results) {
        if(node == null) return results;
        if(node.left == null && node.right == null) {
            results.add(node.val);
            return results;
        }
        
        results = this.dfs(node.left, results);
        results = this.dfs(node.right, results);
        
        return results;
    }
}