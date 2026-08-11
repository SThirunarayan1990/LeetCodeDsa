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
    public List<Integer> postorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Stack<TreeNode> s = new Stack();
        s.add(root);
        Stack<Boolean> visit = new Stack<>();
        visit.add(false);

        while (!s.isEmpty()) {
            TreeNode curr = s.pop();
            Boolean visited = visit.pop();
            if (curr != null) {
                if (visited) {
                    res.add(curr.val);
                } else {
                    s.add(curr);
                    visit.add(true);
                    s.add(curr.right);
                    visit.add(false);
                    s.add(curr.left);
                    visit.add(false);
                }
            }
        }
        return res;
    }

}