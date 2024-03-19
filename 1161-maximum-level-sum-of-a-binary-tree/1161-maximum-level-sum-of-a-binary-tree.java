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
    public int maxLevelSum(TreeNode root) {
        int sum = Integer.MIN_VALUE, ans = 0, level = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            int size = q.size();
            int temp = 0;
            level++;
            
            for (int i = 0; i < size; i++) {
                TreeNode cur = q.poll();
                if(cur != null) { 
                    temp += cur.val;

                    if (i == size - 1) {
                        if(sum < temp) {
                            sum = temp;
                            ans = level;
                        }
                    }

                    if (cur.left != null) {
                        q.add(cur.left);
                    }

                    if (cur.right != null) {
                        q.add(cur.right);
                    }
                }
            }
        }

        return ans;
    }
}