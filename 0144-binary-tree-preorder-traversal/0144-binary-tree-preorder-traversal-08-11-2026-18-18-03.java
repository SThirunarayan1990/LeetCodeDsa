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
        List<Integer> res = new ArrayList();
        preorderTraversal(root, res);
        return res;
    }

    public void preorderTraversal(TreeNode root, List<Integer> res) {
        Stack<TreeNode> s = new Stack();
        if (root != null) {
            s.push(root);
        }
        while (!s.isEmpty()) {
            TreeNode n = s.pop();
            res.add(n.val);
            // Even though we want to print NLR, we are inserting R 1st and then L, bcoz stack is 1st in last out. We want left to poped out 1st
            if (n.right != null) {
                s.push(n.right);
            }
            if (n.left != null) {
                s.push(n.left);
            }
        }
    }
}