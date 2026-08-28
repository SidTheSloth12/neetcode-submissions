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
    public boolean isBalanced(TreeNode root) {
        if(root==null){
            return true;
        }
        int lh=treeheight(root.left);
        int rh=treeheight(root.right);
        return ((Math.abs(lh-rh)<2)&&(isBalanced(root.left))&&(isBalanced(root.right)));
    }
    public int treeheight(TreeNode root){
        if(root==null){
            return 0;
        }
        int lh=1+treeheight(root.left);
        int rh=1+treeheight(root.right);
        return Math.max(lh,rh);
    }
}
