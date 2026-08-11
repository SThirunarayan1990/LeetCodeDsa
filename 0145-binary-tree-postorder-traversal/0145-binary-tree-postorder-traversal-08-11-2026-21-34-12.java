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
        Stack<TreeNode> s = new Stack();
        TreeNode curr = root;
        List<Integer> res = new ArrayList();
        while (curr != null || !s.isEmpty()) {
            if(curr != null) {
                s.push(curr);
                curr = curr.left;
            } else {
                TreeNode temp = s.peek().right;
                if(temp != null) {
                    curr = temp;
                } else {
                    temp = s.pop();
                    // This will print left node
                    res.add(temp.val);
                    // checking if the temp is right node of the current node at top of stack. 
                    // If true, it means tree is visited, this will print right 1st and then parent node. 
                    while(!s.isEmpty() && temp == s.peek().right) {
                        temp = s.pop();
                        res.add(temp.val);
                    }
                }
            }
        }
        return res;
    }
}