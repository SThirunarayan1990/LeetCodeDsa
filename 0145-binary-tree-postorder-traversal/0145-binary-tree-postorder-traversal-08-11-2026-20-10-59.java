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
        record Pair(TreeNode currNode, Boolean visited) {
        }
        ;
        List<Integer> res = new ArrayList<>();
        Stack<Pair> s = new Stack();
        s.add(new Pair(root, false));

        while (!s.isEmpty()) {
            Pair currPair = s.pop();
            TreeNode curr = currPair.currNode;
            Boolean visited = currPair.visited;
            if (curr != null) {
                if (visited) {
                    res.add(curr.val);
                } else {
                    s.push(new Pair(curr, true));
                    s.push(new Pair(curr.right, false));
                    s.push(new Pair(curr.left, false));
                }
            }
        }
        return res;
    }

}