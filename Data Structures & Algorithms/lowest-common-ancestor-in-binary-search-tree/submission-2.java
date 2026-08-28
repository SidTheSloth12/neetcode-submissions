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
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(p.val>q.val){
            TreeNode temp=q;q=p;p=temp;
        }
        while(true){
            if((root==p)||(root==q)||(root.val>p.val&&root.val<q.val))
                return root;
            root=(root.val>q.val)?root.left:root.right;
        }
    }
}
