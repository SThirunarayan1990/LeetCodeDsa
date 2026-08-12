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
    record Pair(TreeNode node, Integer depth) {
    }

    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        Stack<Pair> s = new Stack<>();
        s.push(new Pair(root, 1));

        int maxHeight = 0;

        while (!s.isEmpty()) {
            Pair current = s.pop();

            TreeNode node = current.node;
            int depth = current.depth;

            maxHeight = Math.max(maxHeight, depth);

            if (node.left != null) {
                s.push(new Pair(node.left, depth + 1));
            }

            if (node.right != null) {
                s.push(new Pair(node.right, depth + 1));
            }
        }

        return maxHeight;
    }

}