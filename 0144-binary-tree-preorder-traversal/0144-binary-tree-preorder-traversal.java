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
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> result = new ArrayList<>();

        preOrderRecursion(root, result);

        return result;
    }

    private void preOrderRecursion(TreeNode root, List<Integer> result){
        //base case
        if(root == null){
            return;
        }

        result.add(root.val);
        preOrderRecursion(root.left, result);
        preOrderRecursion(root.right, result);
    }
}