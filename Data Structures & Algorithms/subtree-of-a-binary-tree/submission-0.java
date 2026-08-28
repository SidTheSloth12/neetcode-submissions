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
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root==null){
            return false;
        }
        if(!isSameTree(root,subRoot)){
            return (isSubtree(root.left,subRoot)||isSubtree(root.right,subRoot));
        }
        else{
            return true;
        }
    }
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null || q==null){
            if(p!=null || q!=null){
                return false;
            }
            return true;
        }
        if(p.val!=q.val){
            return false;
        }
        else{
            return((isSameTree(p.left,q.left))&&(isSameTree(p.right,q.right)));
        }
    }
}
