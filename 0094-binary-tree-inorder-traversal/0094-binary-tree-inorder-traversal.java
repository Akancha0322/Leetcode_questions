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
    public List<Integer> inorderTraversal(TreeNode root) {
       List<Integer> result = new ArrayList<>();
       inOrederRecursive(root, result);
       return result;
    }

    private void inOrederRecursive(TreeNode root, List<Integer> result){
        //base case
        if(root == null){
            return;
        }

        inOrederRecursive(root.left, result);
        result.add(root.val);
        inOrederRecursive(root.right, result);
    }
}